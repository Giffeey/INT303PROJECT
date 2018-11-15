/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.servlet;

import book.jpa.controller.OrdersJpaController;
import book.jpa.controller.PaymentJpaController;
import book.jpa.controller.exceptions.RollbackFailureException;
import book.model.Customer;
import book.model.Orders;
import book.model.Payment;
import book.model.PaymentPK;
import book.model.Shipping;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class PaymentServlet extends HttpServlet {

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
                String cardNo = request.getParameter("cardNo");
                String cardType;

                String visa = "^4[0-9]{12}(?:[0-9]{3})?$";
                String masterCard = "^5[1-5][0-9]{14}$";
                String express = "^3[47][0-9]{13}$";
                String jcb = "^(?:2131|1800|35\\d{3})\\d{11}$";
                
                
                if(cardNo.matches(visa)){
                    cardType = "Visa";
                }else if(cardNo.matches(masterCard)){
                    cardType = "MasterCard";
                }else if(cardNo.matches(express)){
                    cardType = "American Express";
                }else if(cardNo.matches(jcb)){
                    cardType = "JCB";
                }else{
                    request.setAttribute("invalid", "invalid card number");
                    getServletContext().getRequestDispatcher("/Payment.jsp").forward(request, response);
                    return;
                }

                String securityCode = request.getParameter("securityCode");
                String nameOnCard = request.getParameter("nameOnCard");

                String date = request.getParameter("expDate");
                SimpleDateFormat sDate = new SimpleDateFormat("dd-MMM-yyyy");
                Date expDate = null;
                try {
                    expDate = sDate.parse(date);
                } catch (ParseException ex) {
                    Logger.getLogger(PaymentServlet.class.getName()).log(Level.SEVERE, null, ex);
                }

                BigDecimal amount = (BigDecimal) session.getAttribute("amount");
                Orders order = (Orders) session.getAttribute("order");
                Shipping shipping = (Shipping) session.getAttribute("shipping");
                Date paymentDate = new Date();

                PaymentJpaController paymentCtrl = new PaymentJpaController(utx, emf);
                Payment payment = new Payment();
                PaymentPK paymentPK = new PaymentPK();
                paymentPK.setCardno(cardNo);
                paymentPK.setCustomerid(customer.getCustomerid());
                payment.setPaymentPK(paymentPK);
                payment.setPaymentdate(paymentDate);
                payment.setCustomer(customer);
                payment.setNameoncard(nameOnCard);
                payment.setSecuritycode(Integer.valueOf(securityCode));
                payment.setShipno(shipping);
                payment.setOrderno(order);
                payment.setAmount(amount);
                payment.setExpirydate(expDate);
                payment.setCardtype(cardType);
                
                OrdersJpaController orderCtrl = new OrdersJpaController(utx, emf);
                order.setStatus("ชำระเงินเรียบร้อยแล้ว กำลังดำเนินการจัดส่ง");
                order.setPaymentList(payment);
                order.setShippingList(shipping);
                
                try {
                    paymentCtrl.create(payment);
                    orderCtrl.edit(order);
                } catch (RollbackFailureException ex) {
                    Logger.getLogger(PaymentServlet.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(PaymentServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                getServletContext().getRequestDispatcher("/index.html").forward(request, response);
            }
        }
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
