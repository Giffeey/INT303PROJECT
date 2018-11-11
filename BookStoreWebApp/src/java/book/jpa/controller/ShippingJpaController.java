/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.jpa.controller;

import book.jpa.controller.exceptions.IllegalOrphanException;
import book.jpa.controller.exceptions.NonexistentEntityException;
import book.jpa.controller.exceptions.PreexistingEntityException;
import book.jpa.controller.exceptions.RollbackFailureException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import book.model.Orders;
import book.model.Payment;
import book.model.Shipping;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.transaction.UserTransaction;

/**
 *
 * @author GIFS
 */
public class ShippingJpaController implements Serializable {

    public ShippingJpaController(UserTransaction utx, EntityManagerFactory emf) {
        this.utx = utx;
        this.emf = emf;
    }
    private UserTransaction utx = null;
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Shipping shipping) throws PreexistingEntityException, RollbackFailureException, Exception {
        if (shipping.getPaymentList() == null) {
            shipping.setPaymentList(new ArrayList<Payment>());
        }
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Orders orderno = shipping.getOrderno();
            if (orderno != null) {
                orderno = em.getReference(orderno.getClass(), orderno.getOrderno());
                shipping.setOrderno(orderno);
            }
            List<Payment> attachedPaymentList = new ArrayList<Payment>();
            for (Payment paymentListPaymentToAttach : shipping.getPaymentList()) {
                paymentListPaymentToAttach = em.getReference(paymentListPaymentToAttach.getClass(), paymentListPaymentToAttach.getPaymentPK());
                attachedPaymentList.add(paymentListPaymentToAttach);
            }
            shipping.setPaymentList(attachedPaymentList);
            em.persist(shipping);
            if (orderno != null) {
                orderno.getShippingList().add(shipping);
                orderno = em.merge(orderno);
            }
            for (Payment paymentListPayment : shipping.getPaymentList()) {
                Shipping oldShipnoOfPaymentListPayment = paymentListPayment.getShipno();
                paymentListPayment.setShipno(shipping);
                paymentListPayment = em.merge(paymentListPayment);
                if (oldShipnoOfPaymentListPayment != null) {
                    oldShipnoOfPaymentListPayment.getPaymentList().remove(paymentListPayment);
                    oldShipnoOfPaymentListPayment = em.merge(oldShipnoOfPaymentListPayment);
                }
            }
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            if (findShipping(shipping.getShipno()) != null) {
                throw new PreexistingEntityException("Shipping " + shipping + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Shipping shipping) throws IllegalOrphanException, NonexistentEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Shipping persistentShipping = em.find(Shipping.class, shipping.getShipno());
            Orders ordernoOld = persistentShipping.getOrderno();
            Orders ordernoNew = shipping.getOrderno();
            List<Payment> paymentListOld = persistentShipping.getPaymentList();
            List<Payment> paymentListNew = shipping.getPaymentList();
            List<String> illegalOrphanMessages = null;
            for (Payment paymentListOldPayment : paymentListOld) {
                if (!paymentListNew.contains(paymentListOldPayment)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain Payment " + paymentListOldPayment + " since its shipno field is not nullable.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            if (ordernoNew != null) {
                ordernoNew = em.getReference(ordernoNew.getClass(), ordernoNew.getOrderno());
                shipping.setOrderno(ordernoNew);
            }
            List<Payment> attachedPaymentListNew = new ArrayList<Payment>();
            for (Payment paymentListNewPaymentToAttach : paymentListNew) {
                paymentListNewPaymentToAttach = em.getReference(paymentListNewPaymentToAttach.getClass(), paymentListNewPaymentToAttach.getPaymentPK());
                attachedPaymentListNew.add(paymentListNewPaymentToAttach);
            }
            paymentListNew = attachedPaymentListNew;
            shipping.setPaymentList(paymentListNew);
            shipping = em.merge(shipping);
            if (ordernoOld != null && !ordernoOld.equals(ordernoNew)) {
                ordernoOld.getShippingList().remove(shipping);
                ordernoOld = em.merge(ordernoOld);
            }
            if (ordernoNew != null && !ordernoNew.equals(ordernoOld)) {
                ordernoNew.getShippingList().add(shipping);
                ordernoNew = em.merge(ordernoNew);
            }
            for (Payment paymentListNewPayment : paymentListNew) {
                if (!paymentListOld.contains(paymentListNewPayment)) {
                    Shipping oldShipnoOfPaymentListNewPayment = paymentListNewPayment.getShipno();
                    paymentListNewPayment.setShipno(shipping);
                    paymentListNewPayment = em.merge(paymentListNewPayment);
                    if (oldShipnoOfPaymentListNewPayment != null && !oldShipnoOfPaymentListNewPayment.equals(shipping)) {
                        oldShipnoOfPaymentListNewPayment.getPaymentList().remove(paymentListNewPayment);
                        oldShipnoOfPaymentListNewPayment = em.merge(oldShipnoOfPaymentListNewPayment);
                    }
                }
            }
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = shipping.getShipno();
                if (findShipping(id) == null) {
                    throw new NonexistentEntityException("The shipping with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws IllegalOrphanException, NonexistentEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Shipping shipping;
            try {
                shipping = em.getReference(Shipping.class, id);
                shipping.getShipno();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The shipping with id " + id + " no longer exists.", enfe);
            }
            List<String> illegalOrphanMessages = null;
            List<Payment> paymentListOrphanCheck = shipping.getPaymentList();
            for (Payment paymentListOrphanCheckPayment : paymentListOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Shipping (" + shipping + ") cannot be destroyed since the Payment " + paymentListOrphanCheckPayment + " in its paymentList field has a non-nullable shipno field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            Orders orderno = shipping.getOrderno();
            if (orderno != null) {
                orderno.getShippingList().remove(shipping);
                orderno = em.merge(orderno);
            }
            em.remove(shipping);
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Shipping> findShippingEntities() {
        return findShippingEntities(true, -1, -1);
    }

    public List<Shipping> findShippingEntities(int maxResults, int firstResult) {
        return findShippingEntities(false, maxResults, firstResult);
    }

    private List<Shipping> findShippingEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Shipping.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Shipping findShipping(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Shipping.class, id);
        } finally {
            em.close();
        }
    }

    public int getShippingCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Shipping> rt = cq.from(Shipping.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
