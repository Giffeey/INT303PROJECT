/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author GIFS
 */
@Entity
@Table(name = "PAYMENT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Payment.findAll", query = "SELECT p FROM Payment p")
    , @NamedQuery(name = "Payment.findByCustomerid", query = "SELECT p FROM Payment p WHERE p.paymentPK.customerid = :customerid")
    , @NamedQuery(name = "Payment.findByCardno", query = "SELECT p FROM Payment p WHERE p.paymentPK.cardno = :cardno")
    , @NamedQuery(name = "Payment.findByCardtype", query = "SELECT p FROM Payment p WHERE p.cardtype = :cardtype")
    , @NamedQuery(name = "Payment.findBySecuritycode", query = "SELECT p FROM Payment p WHERE p.securitycode = :securitycode")
    , @NamedQuery(name = "Payment.findByNameoncard", query = "SELECT p FROM Payment p WHERE p.nameoncard = :nameoncard")
    , @NamedQuery(name = "Payment.findByExpirydate", query = "SELECT p FROM Payment p WHERE p.expirydate = :expirydate")
    , @NamedQuery(name = "Payment.findByAmount", query = "SELECT p FROM Payment p WHERE p.amount = :amount")
    , @NamedQuery(name = "Payment.findByPaymentdate", query = "SELECT p FROM Payment p WHERE p.paymentdate = :paymentdate")})
public class Payment implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PaymentPK paymentPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CARDTYPE")
    private String cardtype;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SECURITYCODE")
    private int securitycode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NAMEONCARD")
    private String nameoncard;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EXPIRYDATE")
    @Temporal(TemporalType.DATE)
    private Date expirydate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "AMOUNT")
    private BigDecimal amount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PAYMENTDATE")
    @Temporal(TemporalType.DATE)
    private Date paymentdate;
    @JoinColumn(name = "CUSTOMERID", referencedColumnName = "CUSTOMERID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Customer customer;
    @JoinColumn(name = "ORDERNO", referencedColumnName = "ORDERNO")
    @ManyToOne(optional = false)
    private Orders orderno;
    @JoinColumn(name = "SHIPNO", referencedColumnName = "SHIPNO")
    @ManyToOne(optional = false)
    private Shipping shipno;

    public Payment() {
    }

    public Payment(PaymentPK paymentPK) {
        this.paymentPK = paymentPK;
    }

    public Payment(PaymentPK paymentPK, String cardtype, int securitycode, String nameoncard, Date expirydate, BigDecimal amount, Date paymentdate) {
        this.paymentPK = paymentPK;
        this.cardtype = cardtype;
        this.securitycode = securitycode;
        this.nameoncard = nameoncard;
        this.expirydate = expirydate;
        this.amount = amount;
        this.paymentdate = paymentdate;
    }

    public Payment(int customerid, String cardno) {
        this.paymentPK = new PaymentPK(customerid, cardno);
    }

    public PaymentPK getPaymentPK() {
        return paymentPK;
    }

    public void setPaymentPK(PaymentPK paymentPK) {
        this.paymentPK = paymentPK;
    }

    public String getCardtype() {
        return cardtype;
    }

    public void setCardtype(String cardtype) {
        this.cardtype = cardtype;
    }

    public int getSecuritycode() {
        return securitycode;
    }

    public void setSecuritycode(int securitycode) {
        this.securitycode = securitycode;
    }

    public String getNameoncard() {
        return nameoncard;
    }

    public void setNameoncard(String nameoncard) {
        this.nameoncard = nameoncard;
    }

    public Date getExpirydate() {
        return expirydate;
    }

    public void setExpirydate(Date expirydate) {
        this.expirydate = expirydate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getPaymentdate() {
        return paymentdate;
    }

    public void setPaymentdate(Date paymentdate) {
        this.paymentdate = paymentdate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Orders getOrderno() {
        return orderno;
    }

    public void setOrderno(Orders orderno) {
        this.orderno = orderno;
    }

    public Shipping getShipno() {
        return shipno;
    }

    public void setShipno(Shipping shipno) {
        this.shipno = shipno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paymentPK != null ? paymentPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Payment)) {
            return false;
        }
        Payment other = (Payment) object;
        if ((this.paymentPK == null && other.paymentPK != null) || (this.paymentPK != null && !this.paymentPK.equals(other.paymentPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "book.model.Payment[ paymentPK=" + paymentPK + " ]";
    }
    
}
