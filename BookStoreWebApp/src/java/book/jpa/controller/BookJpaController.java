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
import book.model.Book;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import book.model.Category;
import book.model.Orderdetail;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.transaction.UserTransaction;

/**
 *
 * @author GIFS
 */
public class BookJpaController implements Serializable {

    public BookJpaController(UserTransaction utx, EntityManagerFactory emf) {
        this.utx = utx;
        this.emf = emf;
    }
    private UserTransaction utx = null;
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Book book) throws PreexistingEntityException, RollbackFailureException, Exception {
        if (book.getOrderdetailList() == null) {
            book.setOrderdetailList(new ArrayList<Orderdetail>());
        }
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Category category = book.getCategory();
            if (category != null) {
                category = em.getReference(category.getClass(), category.getCategory());
                book.setCategory(category);
            }
            List<Orderdetail> attachedOrderdetailList = new ArrayList<Orderdetail>();
            for (Orderdetail orderdetailListOrderdetailToAttach : book.getOrderdetailList()) {
                orderdetailListOrderdetailToAttach = em.getReference(orderdetailListOrderdetailToAttach.getClass(), orderdetailListOrderdetailToAttach.getOrderdetailPK());
                attachedOrderdetailList.add(orderdetailListOrderdetailToAttach);
            }
            book.setOrderdetailList(attachedOrderdetailList);
            em.persist(book);
            if (category != null) {
                category.getBookList().add(book);
                category = em.merge(category);
            }
            for (Orderdetail orderdetailListOrderdetail : book.getOrderdetailList()) {
                Book oldBookOfOrderdetailListOrderdetail = orderdetailListOrderdetail.getBook();
                orderdetailListOrderdetail.setBook(book);
                orderdetailListOrderdetail = em.merge(orderdetailListOrderdetail);
                if (oldBookOfOrderdetailListOrderdetail != null) {
                    oldBookOfOrderdetailListOrderdetail.getOrderdetailList().remove(orderdetailListOrderdetail);
                    oldBookOfOrderdetailListOrderdetail = em.merge(oldBookOfOrderdetailListOrderdetail);
                }
            }
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            if (findBook(book.getIsbn()) != null) {
                throw new PreexistingEntityException("Book " + book + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Book book) throws IllegalOrphanException, NonexistentEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Book persistentBook = em.find(Book.class, book.getIsbn());
            Category categoryOld = persistentBook.getCategory();
            Category categoryNew = book.getCategory();
            List<Orderdetail> orderdetailListOld = persistentBook.getOrderdetailList();
            List<Orderdetail> orderdetailListNew = book.getOrderdetailList();
            List<String> illegalOrphanMessages = null;
            for (Orderdetail orderdetailListOldOrderdetail : orderdetailListOld) {
                if (!orderdetailListNew.contains(orderdetailListOldOrderdetail)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain Orderdetail " + orderdetailListOldOrderdetail + " since its book field is not nullable.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            if (categoryNew != null) {
                categoryNew = em.getReference(categoryNew.getClass(), categoryNew.getCategory());
                book.setCategory(categoryNew);
            }
            List<Orderdetail> attachedOrderdetailListNew = new ArrayList<Orderdetail>();
            for (Orderdetail orderdetailListNewOrderdetailToAttach : orderdetailListNew) {
                orderdetailListNewOrderdetailToAttach = em.getReference(orderdetailListNewOrderdetailToAttach.getClass(), orderdetailListNewOrderdetailToAttach.getOrderdetailPK());
                attachedOrderdetailListNew.add(orderdetailListNewOrderdetailToAttach);
            }
            orderdetailListNew = attachedOrderdetailListNew;
            book.setOrderdetailList(orderdetailListNew);
            book = em.merge(book);
            if (categoryOld != null && !categoryOld.equals(categoryNew)) {
                categoryOld.getBookList().remove(book);
                categoryOld = em.merge(categoryOld);
            }
            if (categoryNew != null && !categoryNew.equals(categoryOld)) {
                categoryNew.getBookList().add(book);
                categoryNew = em.merge(categoryNew);
            }
            for (Orderdetail orderdetailListNewOrderdetail : orderdetailListNew) {
                if (!orderdetailListOld.contains(orderdetailListNewOrderdetail)) {
                    Book oldBookOfOrderdetailListNewOrderdetail = orderdetailListNewOrderdetail.getBook();
                    orderdetailListNewOrderdetail.setBook(book);
                    orderdetailListNewOrderdetail = em.merge(orderdetailListNewOrderdetail);
                    if (oldBookOfOrderdetailListNewOrderdetail != null && !oldBookOfOrderdetailListNewOrderdetail.equals(book)) {
                        oldBookOfOrderdetailListNewOrderdetail.getOrderdetailList().remove(orderdetailListNewOrderdetail);
                        oldBookOfOrderdetailListNewOrderdetail = em.merge(oldBookOfOrderdetailListNewOrderdetail);
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
                String id = book.getIsbn();
                if (findBook(id) == null) {
                    throw new NonexistentEntityException("The book with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(String id) throws IllegalOrphanException, NonexistentEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Book book;
            try {
                book = em.getReference(Book.class, id);
                book.getIsbn();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The book with id " + id + " no longer exists.", enfe);
            }
            List<String> illegalOrphanMessages = null;
            List<Orderdetail> orderdetailListOrphanCheck = book.getOrderdetailList();
            for (Orderdetail orderdetailListOrphanCheckOrderdetail : orderdetailListOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Book (" + book + ") cannot be destroyed since the Orderdetail " + orderdetailListOrphanCheckOrderdetail + " in its orderdetailList field has a non-nullable book field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            Category category = book.getCategory();
            if (category != null) {
                category.getBookList().remove(book);
                category = em.merge(category);
            }
            em.remove(book);
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

    public List<Book> findBookEntities() {
        return findBookEntities(true, -1, -1);
    }

    public List<Book> findBookEntities(int maxResults, int firstResult) {
        return findBookEntities(false, maxResults, firstResult);
    }

    private List<Book> findBookEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Book.class));
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

    public Book findBook(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Book.class, id);
        } finally {
            em.close();
        }
    }

    public List<Book> findBookByName(String name) {
        EntityManager em = getEntityManager();
        try {
            Query query = em.createNamedQuery("Book.findByBookname");
            query.setParameter("bookname", "%" + name.toLowerCase() + "%");
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    public List<Book> findBookByAuthor(String author) {
        EntityManager em = getEntityManager();
        try {
            Query query = em.createNamedQuery("Book.findByAuthor");
            query.setParameter("author", "%" + author + "%");
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    public List<Book> findBookByPublisher(String publisher){
        EntityManager em = getEntityManager();
        try {
            Query query = em.createNamedQuery("Book.findByPublisher");
            query.setParameter("publisher", "%" + publisher + "%");
            return query.getResultList();
        } finally {
            em.close();
        }
    }
    
    public int getBookCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Book> rt = cq.from(Book.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
