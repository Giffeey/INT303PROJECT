package book.model;

import book.model.Customer;
import book.model.Orderdetail;
import book.model.Payment;
import book.model.Shipping;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-11T21:21:15")
@StaticMetamodel(Orders.class)
public class Orders_ { 

    public static volatile ListAttribute<Orders, Shipping> shippingList;
    public static volatile SingularAttribute<Orders, Integer> orderno;
    public static volatile ListAttribute<Orders, Orderdetail> orderdetailList;
    public static volatile SingularAttribute<Orders, Customer> customerid;
    public static volatile SingularAttribute<Orders, Integer> numofbook;
    public static volatile SingularAttribute<Orders, Date> shippeddate;
    public static volatile SingularAttribute<Orders, Date> orderdate;
    public static volatile SingularAttribute<Orders, String> status;
    public static volatile ListAttribute<Orders, Payment> paymentList;

}