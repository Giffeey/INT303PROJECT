package book.model;

import book.model.Book;
import book.model.OrderdetailPK;
import book.model.Orders;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-11T21:21:15")
@StaticMetamodel(Orderdetail.class)
public class Orderdetail_ { 

    public static volatile SingularAttribute<Orderdetail, OrderdetailPK> orderdetailPK;
    public static volatile SingularAttribute<Orderdetail, Integer> quantity;
    public static volatile SingularAttribute<Orderdetail, Book> book;
    public static volatile SingularAttribute<Orderdetail, BigDecimal> priceeach;
    public static volatile SingularAttribute<Orderdetail, Orders> orders;
    public static volatile SingularAttribute<Orderdetail, Short> orderlinenumber;

}