package book.model;

import book.model.Customer;
import book.model.Orders;
import book.model.PaymentPK;
import book.model.Shipping;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-11T21:21:15")
@StaticMetamodel(Payment.class)
public class Payment_ { 

    public static volatile SingularAttribute<Payment, Date> expirydate;
    public static volatile SingularAttribute<Payment, String> nameoncard;
    public static volatile SingularAttribute<Payment, BigDecimal> amount;
    public static volatile SingularAttribute<Payment, Date> paymentdate;
    public static volatile SingularAttribute<Payment, Orders> orderno;
    public static volatile SingularAttribute<Payment, Shipping> shipno;
    public static volatile SingularAttribute<Payment, PaymentPK> paymentPK;
    public static volatile SingularAttribute<Payment, String> cardtype;
    public static volatile SingularAttribute<Payment, Integer> securitycode;
    public static volatile SingularAttribute<Payment, Customer> customer;

}