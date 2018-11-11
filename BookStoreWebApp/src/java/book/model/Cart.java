/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author GIFS
 */
public class Cart {

    private Map<String, LineItem> cart;

    public Cart() {
        cart = new HashMap();
    }

    public void add(Book b) {
        LineItem line = cart.get(b.getIsbn());
        if (line == null) {
            cart.put(b.getIsbn(), new LineItem(b));
        } else {
            line.setQuantity(line.getQuantity() + 1);
        }

    }

    public void remove(Book b) {
        this.remove(b.getIsbn());
    }

    public void remove(String isbn) {
        cart.remove(isbn);
    }

    public BigDecimal getTotalPrice() {
        BigDecimal sum;
        long value = (long) 0.00;
        sum = BigDecimal.valueOf(value);
        
        Collection<LineItem> lineItems = cart.values();
        for (LineItem lineItem : lineItems) {
            sum = lineItem.getTotalPrice().add(sum);
        }
        return sum;
    }

    public int getTotalQuantity() {
        int sum = 0;
        Collection<LineItem> lineItems = cart.values();
        for (LineItem lineItem : lineItems) {
            sum += lineItem.getQuantity();
        }
        return sum;
    }

    public List<LineItem> getLineItems() {
        return new ArrayList(cart.values());
    }
}
