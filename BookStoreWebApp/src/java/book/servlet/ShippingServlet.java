/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.servlet;

import book.jpa.controller.CustomerJpaController;
import book.jpa.controller.OrdersJpaController;
import book.jpa.controller.ShippingJpaController;
import book.jpa.controller.exceptions.RollbackFailureException;
import book.model.Customer;
import book.model.Orders;
import book.model.Shipping;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
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
public class ShippingServlet extends HttpServlet {

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
                String address = request.getParameter("shipAddress");
                String method = request.getParameter("shipMethod");
                String price = request.getParameter("shipPrice");
                double shipPrice = Double.valueOf(price);
                CustomerJpaController customerCtrl = new CustomerJpaController(utx, emf);
                Customer cust = customerCtrl.findCustomer(customer.getCustomerid());
                if (cust != null) {
                    cust.setAddress(address);
                    Orders order = (Orders) session.getAttribute("order");

                    ShippingJpaController shipCtrl = new ShippingJpaController(utx, emf);

                    Shipping shipping = new Shipping();
                    shipping.setShipno(shipCtrl.getShippingCount() + 1);
                    shipping.setShipaddress(address);
                    shipping.setShipmethod(method);
                    shipping.setOrderno(order);
                    shipping.setShipprice(BigDecimal.valueOf(shipPrice));
                    try {
                        customerCtrl.edit(cust);
                        shipCtrl.create(shipping);
                    } catch (RollbackFailureException ex) {
                        Logger.getLogger(ShippingServlet.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (Exception ex) {
                        Logger.getLogger(ShippingServlet.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    session.setAttribute("customer", cust);
                    session.setAttribute("shipping", shipping);
                    response.sendRedirect("payment");
                    return;
                }

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
