/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author GIFS
 */
@Embeddable
public class PaymentPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "CUSTOMERID")
    private int customerid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CARDNO")
    private String cardno;

    public PaymentPK() {
    }

    public PaymentPK(int customerid, String cardno) {
        this.customerid = customerid;
        this.cardno = cardno;
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) customerid;
        hash += (cardno != null ? cardno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaymentPK)) {
            return false;
        }
        PaymentPK other = (PaymentPK) object;
        if (this.customerid != other.customerid) {
            return false;
        }
        if ((this.cardno == null && other.cardno != null) || (this.cardno != null && !this.cardno.equals(other.cardno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "book.model.PaymentPK[ customerid=" + customerid + ", cardno=" + cardno + " ]";
    }
    
}
