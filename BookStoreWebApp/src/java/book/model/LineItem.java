/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.model;

import java.math.BigDecimal;

/**
 *
 * @author GIFS
 */
public class LineItem {

    private Book book;
    private BigDecimal salePrice;
    private int quantity;

    public LineItem() {
    }

    public LineItem(Book book) {
        this(book, 1);
    }

    public LineItem(Book book, int quantity) {
        this.book = book;
        this.quantity = quantity;
        this.salePrice = book.getPrice();
    }

    public BigDecimal getTotalPrice() {
        return this.salePrice.multiply(BigDecimal.valueOf(this.quantity));
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
