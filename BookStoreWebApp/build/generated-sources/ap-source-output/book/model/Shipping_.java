package book.model;

import book.model.Orders;
import book.model.Payment;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-11T21:21:15")
@StaticMetamodel(Shipping.class)
public class Shipping_ { 

    public static volatile SingularAttribute<Shipping, Orders> orderno;
    public static volatile SingularAttribute<Shipping, Integer> shipno;
    public static volatile SingularAttribute<Shipping, String> trackingno;
    public static volatile SingularAttribute<Shipping, String> shipaddress;
    public static volatile SingularAttribute<Shipping, BigDecimal> shipprice;
    public static volatile SingularAttribute<Shipping, String> shipmethod;
    public static volatile SingularAttribute<Shipping, Date> shipdate;
    public static volatile ListAttribute<Shipping, Payment> paymentList;

}