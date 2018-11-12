/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.servlet;

import book.jpa.controller.OrderdetailJpaController;
import book.jpa.controller.OrdersJpaController;
import book.jpa.controller.exceptions.RollbackFailureException;
import book.model.Cart;
import book.model.Customer;
import book.model.LineItem;
import book.model.Orderdetail;
import book.model.OrderdetailPK;
import book.model.Orders;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.transaction.UserTransaction;

/**
 *
 * @author GIFS
 */
public class ShippingPageServlet extends HttpServlet {

    @Resource
    UserTransaction utx;

    @PersistenceUnit(unitName = "BookStoreWebAppPU")
    EntityManagerFactory emf;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(false);
        if (session != null) {
            Customer customer = (Customer) session.getAttribute("customer");

            if (customer != null) {
                Cart cart = (Cart) request.getAttribute("cart");
                OrdersJpaController orderCtrl = new OrdersJpaController(utx, emf);

                Orders order = new Orders();

                order.setCustomerid(customer);
                order.setOrderdate(new Date());
                order.setOrderno(orderCtrl.getOrdersCount() + 1);
                order.setNumofbook(cart.getTotalQuantity());
                order.setStatus("ยังไม่ชำระเงิน");

                OrderdetailJpaController detailCtrl = new OrderdetailJpaController(utx, emf);
                List<Orderdetail> detail = new ArrayList<>();
                OrderdetailPK detailPK;
                int i = 0;
                for (LineItem lineItem : cart.getLineItems()) {
                    detailPK = new OrderdetailPK(order.getOrderno(), lineItem.getBook().getIsbn());
                    Orderdetail de = new Orderdetail(detailPK, lineItem.getQuantity(), lineItem.getSalePrice(), (short) i++);
                    try {
                        detailCtrl.create(de);
                    } catch (RollbackFailureException ex) {
                        Logger.getLogger(ShippingPageServlet.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (Exception ex) {
                        Logger.getLogger(ShippingPageServlet.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    detail.add(de);
                }
                
                order.setOrderdetailList(detail);
                
                try {
                    orderCtrl.create(order);
                } catch (RollbackFailureException ex) {
                    Logger.getLogger(ShippingPageServlet.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(ShippingPageServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                if (customer.getAddress() != null) {
                    String address = customer.getAddress();
                    session.setAttribute("address", address);
                }

                session.setAttribute("order", order);
                session.setAttribute("orderDetail", detail);
                getServletContext().getRequestDispatcher("/Shipping.jsp").forward(request, response);
                return;
            }
        }

        getServletContext().getRequestDispatcher("/index.html").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
