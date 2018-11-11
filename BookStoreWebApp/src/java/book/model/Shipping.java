/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author GIFS
 */
@Entity
@Table(name = "SHIPPING")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Shipping.findAll", query = "SELECT s FROM Shipping s")
    , @NamedQuery(name = "Shipping.findByShipno", query = "SELECT s FROM Shipping s WHERE s.shipno = :shipno")
    , @NamedQuery(name = "Shipping.findByShipdate", query = "SELECT s FROM Shipping s WHERE s.shipdate = :shipdate")
    , @NamedQuery(name = "Shipping.findByShipmethod", query = "SELECT s FROM Shipping s WHERE s.shipmethod = :shipmethod")
    , @NamedQuery(name = "Shipping.findByShipprice", query = "SELECT s FROM Shipping s WHERE s.shipprice = :shipprice")
    , @NamedQuery(name = "Shipping.findByShipaddress", query = "SELECT s FROM Shipping s WHERE s.shipaddress = :shipaddress")
    , @NamedQuery(name = "Shipping.findByTrackingno", query = "SELECT s FROM Shipping s WHERE s.trackingno = :trackingno")})
public class Shipping implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "SHIPNO")
    private Integer shipno;
    @Column(name = "SHIPDATE")
    @Temporal(TemporalType.DATE)
    private Date shipdate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "SHIPMETHOD")
    private String shipmethod;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "SHIPPRICE")
    private BigDecimal shipprice;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "SHIPADDRESS")
    private String shipaddress;
    @Size(max = 20)
    @Column(name = "TRACKINGNO")
    private String trackingno;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "shipno")
    private List<Payment> paymentList;
    @JoinColumn(name = "ORDERNO", referencedColumnName = "ORDERNO")
    @ManyToOne(optional = false)
    private Orders orderno;

    public Shipping() {
    }

    public Shipping(Integer shipno) {
        this.shipno = shipno;
    }

    public Shipping(Integer shipno, String shipmethod, BigDecimal shipprice, String shipaddress) {
        this.shipno = shipno;
        this.shipmethod = shipmethod;
        this.shipprice = shipprice;
        this.shipaddress = shipaddress;
    }

    public Integer getShipno() {
        return shipno;
    }

    public void setShipno(Integer shipno) {
        this.shipno = shipno;
    }

    public Date getShipdate() {
        return shipdate;
    }

    public void setShipdate(Date shipdate) {
        this.shipdate = shipdate;
    }

    public String getShipmethod() {
        return shipmethod;
    }

    public void setShipmethod(String shipmethod) {
        this.shipmethod = shipmethod;
    }

    public BigDecimal getShipprice() {
        return shipprice;
    }

    public void setShipprice(BigDecimal shipprice) {
        this.shipprice = shipprice;
    }

    public String getShipaddress() {
        return shipaddress;
    }

    public void setShipaddress(String shipaddress) {
        this.shipaddress = shipaddress;
    }

    public String getTrackingno() {
        return trackingno;
    }

    public void setTrackingno(String trackingno) {
        this.trackingno = trackingno;
    }

    @XmlTransient
    public List<Payment> getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(List<Payment> paymentList) {
        this.paymentList = paymentList;
    }

    public Orders getOrderno() {
        return orderno;
    }

    public void setOrderno(Orders orderno) {
        this.orderno = orderno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (shipno != null ? shipno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Shipping)) {
            return false;
        }
        Shipping other = (Shipping) object;
        if ((this.shipno == null && other.shipno != null) || (this.shipno != null && !this.shipno.equals(other.shipno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "book.model.Shipping[ shipno=" + shipno + " ]";
    }
    
}
