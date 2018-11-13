/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.servlet;

import book.jpa.controller.OrderdetailJpaController;
import book.jpa.controller.OrdersJpaController;
import book.model.Customer;
import book.model.Orders;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
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
public class HistoryServlet extends HttpServlet {
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
        if(session!=null){
            Customer customer = (Customer) session.getAttribute("customer");
            if(customer != null){
                
                OrdersJpaController ordersCtrl = new OrdersJpaController(utx, emf);
                List <Orders> orderList = ordersCtrl.findOrdersEntities();
                List <Orders> orders = new ArrayList<>();
                
                
                for(Orders order : orderList){
                    if(order.getCustomerid().getCustomerid().equals(customer.getCustomerid())){
                        orders.add(order);
                    }
                }
                
                session.setAttribute("orderHistory", orders);
                getServletContext().getRequestDispatcher("/History.jsp").forward(request, response);
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
