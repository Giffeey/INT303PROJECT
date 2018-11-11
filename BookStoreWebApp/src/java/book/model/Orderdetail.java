/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author GIFS
 */
@Entity
@Table(name = "ORDERDETAIL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Orderdetail.findAll", query = "SELECT o FROM Orderdetail o")
    , @NamedQuery(name = "Orderdetail.findByOrderno", query = "SELECT o FROM Orderdetail o WHERE o.orderdetailPK.orderno = :orderno")
    , @NamedQuery(name = "Orderdetail.findByIsbn", query = "SELECT o FROM Orderdetail o WHERE o.orderdetailPK.isbn = :isbn")
    , @NamedQuery(name = "Orderdetail.findByQuantity", query = "SELECT o FROM Orderdetail o WHERE o.quantity = :quantity")
    , @NamedQuery(name = "Orderdetail.findByPriceeach", query = "SELECT o FROM Orderdetail o WHERE o.priceeach = :priceeach")
    , @NamedQuery(name = "Orderdetail.findByOrderlinenumber", query = "SELECT o FROM Orderdetail o WHERE o.orderlinenumber = :orderlinenumber")})
public class Orderdetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OrderdetailPK orderdetailPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "QUANTITY")
    private int quantity;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRICEEACH")
    private BigDecimal priceeach;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ORDERLINENUMBER")
    private short orderlinenumber;
    @JoinColumn(name = "ISBN", referencedColumnName = "ISBN", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Book book;
    @JoinColumn(name = "ORDERNO", referencedColumnName = "ORDERNO", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Orders orders;

    public Orderdetail() {
    }

    public Orderdetail(OrderdetailPK orderdetailPK) {
        this.orderdetailPK = orderdetailPK;
    }

    public Orderdetail(OrderdetailPK orderdetailPK, int quantity, BigDecimal priceeach, short orderlinenumber) {
        this.orderdetailPK = orderdetailPK;
        this.quantity = quantity;
        this.priceeach = priceeach;
        this.orderlinenumber = orderlinenumber;
    }

    public Orderdetail(int orderno, String isbn) {
        this.orderdetailPK = new OrderdetailPK(orderno, isbn);
    }

    public OrderdetailPK getOrderdetailPK() {
        return orderdetailPK;
    }

    public void setOrderdetailPK(OrderdetailPK orderdetailPK) {
        this.orderdetailPK = orderdetailPK;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPriceeach() {
        return priceeach;
    }

    public void setPriceeach(BigDecimal priceeach) {
        this.priceeach = priceeach;
    }

    public short getOrderlinenumber() {
        return orderlinenumber;
    }

    public void setOrderlinenumber(short orderlinenumber) {
        this.orderlinenumber = orderlinenumber;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderdetailPK != null ? orderdetailPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Orderdetail)) {
            return false;
        }
        Orderdetail other = (Orderdetail) object;
        if ((this.orderdetailPK == null && other.orderdetailPK != null) || (this.orderdetailPK != null && !this.orderdetailPK.equals(other.orderdetailPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "book.model.Orderdetail[ orderdetailPK=" + orderdetailPK + " ]";
    }
    
}
