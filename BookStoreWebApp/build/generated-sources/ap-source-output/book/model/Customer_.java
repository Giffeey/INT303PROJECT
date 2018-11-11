package book.model;

import book.model.Orders;
import book.model.Payment;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-11T21:21:15")
@StaticMetamodel(Customer.class)
public class Customer_ { 

    public static volatile SingularAttribute<Customer, String> password;
    public static volatile SingularAttribute<Customer, String> firstname;
    public static volatile SingularAttribute<Customer, String> address;
    public static volatile SingularAttribute<Customer, String> phone;
    public static volatile SingularAttribute<Customer, Integer> customerid;
    public static volatile SingularAttribute<Customer, BigDecimal> creditlimit;
    public static volatile SingularAttribute<Customer, String> email;
    public static volatile ListAttribute<Customer, Orders> ordersList;
    public static volatile SingularAttribute<Customer, String> username;
    public static volatile SingularAttribute<Customer, String> lastname;
    public static volatile ListAttribute<Customer, Payment> paymentList;

}