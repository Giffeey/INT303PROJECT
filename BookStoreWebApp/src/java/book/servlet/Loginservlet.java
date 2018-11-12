/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.servlet;

import book.jpa.controller.CustomerJpaController;
import book.model.Customer;
import java.io.IOException;
import java.io.PrintWriter;
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
 * @author IAMIN
 */
public class Loginservlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @PersistenceUnit(unitName = "BookStoreWebAppPU")
    EntityManagerFactory emf;

    @Resource
    UserTransaction utx;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("username");
        String password = request.getParameter("password");
        HttpSession session = request.getSession();
        if (name != null && name.trim().length() > 0 && password != null && password.trim().length() > 0) {
            CustomerJpaController cpj = new CustomerJpaController(utx, emf);
            //Customer cumodel = cpj.findCustomerusername(name);
            List<Customer> customer = cpj.findCustomerEntities();
            Customer cumodel = new Customer();
            for (Customer cust : customer) {
                if (cust.getUsername().equalsIgnoreCase(name)) {
                    cumodel = cust;
                }
            }

            if (cumodel.getPassword().equals(password)) {
                session.setAttribute("customer", cumodel);
                getServletContext().getRequestDispatcher("/BookList.jsp").forward(request, response);
                return;
            } else {
                getServletContext().getRequestDispatcher("/Login.jsp").forward(request, response);
            }

        }
        getServletContext().getRequestDispatcher("/Login.jsp").forward(request, response);

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
