package book.model;

import book.model.Book;
import java.io.Serializable;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-11T21:21:15")
@StaticMetamodel(Category.class)
public class Category_ { 

    public static volatile SingularAttribute<Category, Serializable> image;
    public static volatile SingularAttribute<Category, String> textdescription;
    public static volatile SingularAttribute<Category, String> category;
    public static volatile ListAttribute<Category, Book> bookList;

}