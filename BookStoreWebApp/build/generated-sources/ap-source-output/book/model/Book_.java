package book.model;

import book.model.Category;
import book.model.Orderdetail;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-11T21:21:15")
@StaticMetamodel(Book.class)
public class Book_ { 

    public static volatile SingularAttribute<Book, String> author;
    public static volatile SingularAttribute<Book, BigDecimal> price;
    public static volatile SingularAttribute<Book, Short> quantityinstock;
    public static volatile SingularAttribute<Book, String> isbn;
    public static volatile ListAttribute<Book, Orderdetail> orderdetailList;
    public static volatile SingularAttribute<Book, String> genre;
    public static volatile SingularAttribute<Book, Integer> numofpage;
    public static volatile SingularAttribute<Book, String> publisher;
    public static volatile SingularAttribute<Book, String> synopsis;
    public static volatile SingularAttribute<Book, String> bookname;
    public static volatile SingularAttribute<Book, Category> category;

}