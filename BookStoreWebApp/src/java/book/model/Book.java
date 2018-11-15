/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author GIFS
 */
@Entity
@Table(name = "BOOK")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Book.findAll", query = "SELECT b FROM Book b")
    , @NamedQuery(name = "Book.findByIsbn", query = "SELECT b FROM Book b WHERE b.isbn = :isbn")
    , @NamedQuery(name = "Book.findByBookname", query = "SELECT b FROM Book b WHERE b.bookname LIKE :bookname")
    , @NamedQuery(name = "Book.findByAuthor", query = "SELECT b FROM Book b WHERE b.author LIKE :author")
    , @NamedQuery(name = "Book.findByPublisher", query = "SELECT b FROM Book b WHERE b.publisher LIKE :publisher")
    , @NamedQuery(name = "Book.findByGenre", query = "SELECT b FROM Book b WHERE b.genre = :genre")
    , @NamedQuery(name = "Book.findByPrice", query = "SELECT b FROM Book b WHERE b.price = :price")
    , @NamedQuery(name = "Book.findByNumofpage", query = "SELECT b FROM Book b WHERE b.numofpage = :numofpage")
    , @NamedQuery(name = "Book.findByQuantityinstock", query = "SELECT b FROM Book b WHERE b.quantityinstock = :quantityinstock")})
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 13)
    @Column(name = "ISBN")
    private String isbn;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "BOOKNAME")
    private String bookname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "AUTHOR")
    private String author;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "PUBLISHER")
    private String publisher;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "GENRE")
    private String genre;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRICE")
    private BigDecimal price;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUMOFPAGE")
    private int numofpage;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "SYNOPSIS")
    private String synopsis;
    @Basic(optional = false)
    @NotNull
    @Column(name = "QUANTITYINSTOCK")
    private short quantityinstock;
    @JoinColumn(name = "CATEGORY", referencedColumnName = "CATEGORY")
    @ManyToOne(optional = false)
    private Category category;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "book")
    private List<Orderdetail> orderdetailList;

    public Book() {
    }

    public Book(String isbn) {
        this.isbn = isbn;
    }

    public Book(String isbn, String bookname, String author, String publisher, String genre, BigDecimal price, int numofpage, String synopsis, short quantityinstock) {
        this.isbn = isbn;
        this.bookname = bookname;
        this.author = author;
        this.publisher = publisher;
        this.genre = genre;
        this.price = price;
        this.numofpage = numofpage;
        this.synopsis = synopsis;
        this.quantityinstock = quantityinstock;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getNumofpage() {
        return numofpage;
    }

    public void setNumofpage(int numofpage) {
        this.numofpage = numofpage;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public short getQuantityinstock() {
        return quantityinstock;
    }

    public void setQuantityinstock(short quantityinstock) {
        this.quantityinstock = quantityinstock;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @XmlTransient
    public List<Orderdetail> getOrderdetailList() {
        return orderdetailList;
    }

    public void setOrderdetailList(List<Orderdetail> orderdetailList) {
        this.orderdetailList = orderdetailList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (isbn != null ? isbn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Book)) {
            return false;
        }
        Book other = (Book) object;
        if ((this.isbn == null && other.isbn != null) || (this.isbn != null && !this.isbn.equals(other.isbn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "book.model.Book[ isbn=" + isbn + " ]";
    }

}
