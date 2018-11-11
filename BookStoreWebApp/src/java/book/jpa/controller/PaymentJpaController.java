/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.jpa.controller;

import book.jpa.controller.exceptions.NonexistentEntityException;
import book.jpa.controller.exceptions.PreexistingEntityException;
import book.jpa.controller.exceptions.RollbackFailureException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import book.model.Customer;
import book.model.Orders;
import book.model.Payment;
import book.model.PaymentPK;
import book.model.Shipping;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.transaction.UserTransaction;

/**
 *
 * @author GIFS
 */
public class PaymentJpaController implements Serializable {

    public PaymentJpaController(UserTransaction utx, EntityManagerFactory emf) {
        this.utx = utx;
        this.emf = emf;
    }
    private UserTransaction utx = null;
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Payment payment) throws PreexistingEntityException, RollbackFailureException, Exception {
        if (payment.getPaymentPK() == null) {
            payment.setPaymentPK(new PaymentPK());
        }
        payment.getPaymentPK().setCustomerid(payment.getCustomer().getCustomerid());
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Customer customer = payment.getCustomer();
            if (customer != null) {
                customer = em.getReference(customer.getClass(), customer.getCustomerid());
                payment.setCustomer(customer);
            }
            Orders orderno = payment.getOrderno();
            if (orderno != null) {
                orderno = em.getReference(orderno.getClass(), orderno.getOrderno());
                payment.setOrderno(orderno);
            }
            Shipping shipno = payment.getShipno();
            if (shipno != null) {
                shipno = em.getReference(shipno.getClass(), shipno.getShipno());
                payment.setShipno(shipno);
            }
            em.persist(payment);
            if (customer != null) {
                customer.getPaymentList().add(payment);
                customer = em.merge(customer);
            }
            if (orderno != null) {
                orderno.getPaymentList().add(payment);
                orderno = em.merge(orderno);
            }
            if (shipno != null) {
                shipno.getPaymentList().add(payment);
                shipno = em.merge(shipno);
            }
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            if (findPayment(payment.getPaymentPK()) != null) {
                throw new PreexistingEntityException("Payment " + payment + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Payment payment) throws NonexistentEntityException, RollbackFailureException, Exception {
        payment.getPaymentPK().setCustomerid(payment.getCustomer().getCustomerid());
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Payment persistentPayment = em.find(Payment.class, payment.getPaymentPK());
            Customer customerOld = persistentPayment.getCustomer();
            Customer customerNew = payment.getCustomer();
            Orders ordernoOld = persistentPayment.getOrderno();
            Orders ordernoNew = payment.getOrderno();
            Shipping shipnoOld = persistentPayment.getShipno();
            Shipping shipnoNew = payment.getShipno();
            if (customerNew != null) {
                customerNew = em.getReference(customerNew.getClass(), customerNew.getCustomerid());
                payment.setCustomer(customerNew);
            }
            if (ordernoNew != null) {
                ordernoNew = em.getReference(ordernoNew.getClass(), ordernoNew.getOrderno());
                payment.setOrderno(ordernoNew);
            }
            if (shipnoNew != null) {
                shipnoNew = em.getReference(shipnoNew.getClass(), shipnoNew.getShipno());
                payment.setShipno(shipnoNew);
            }
            payment = em.merge(payment);
            if (customerOld != null && !customerOld.equals(customerNew)) {
                customerOld.getPaymentList().remove(payment);
                customerOld = em.merge(customerOld);
            }
            if (customerNew != null && !customerNew.equals(customerOld)) {
                customerNew.getPaymentList().add(payment);
                customerNew = em.merge(customerNew);
            }
            if (ordernoOld != null && !ordernoOld.equals(ordernoNew)) {
                ordernoOld.getPaymentList().remove(payment);
                ordernoOld = em.merge(ordernoOld);
            }
            if (ordernoNew != null && !ordernoNew.equals(ordernoOld)) {
                ordernoNew.getPaymentList().add(payment);
                ordernoNew = em.merge(ordernoNew);
            }
            if (shipnoOld != null && !shipnoOld.equals(shipnoNew)) {
                shipnoOld.getPaymentList().remove(payment);
                shipnoOld = em.merge(shipnoOld);
            }
            if (shipnoNew != null && !shipnoNew.equals(shipnoOld)) {
                shipnoNew.getPaymentList().add(payment);
                shipnoNew = em.merge(shipnoNew);
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
                PaymentPK id = payment.getPaymentPK();
                if (findPayment(id) == null) {
                    throw new NonexistentEntityException("The payment with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(PaymentPK id) throws NonexistentEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Payment payment;
            try {
                payment = em.getReference(Payment.class, id);
                payment.getPaymentPK();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The payment with id " + id + " no longer exists.", enfe);
            }
            Customer customer = payment.getCustomer();
            if (customer != null) {
                customer.getPaymentList().remove(payment);
                customer = em.merge(customer);
            }
            Orders orderno = payment.getOrderno();
            if (orderno != null) {
                orderno.getPaymentList().remove(payment);
                orderno = em.merge(orderno);
            }
            Shipping shipno = payment.getShipno();
            if (shipno != null) {
                shipno.getPaymentList().remove(payment);
                shipno = em.merge(shipno);
            }
            em.remove(payment);
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

    public List<Payment> findPaymentEntities() {
        return findPaymentEntities(true, -1, -1);
    }

    public List<Payment> findPaymentEntities(int maxResults, int firstResult) {
        return findPaymentEntities(false, maxResults, firstResult);
    }

    private List<Payment> findPaymentEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Payment.class));
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

    public Payment findPayment(PaymentPK id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Payment.class, id);
        } finally {
            em.close();
        }
    }

    public int getPaymentCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Payment> rt = cq.from(Payment.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
