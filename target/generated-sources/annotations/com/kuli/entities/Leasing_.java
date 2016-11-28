package com.kuli.entities;

import com.kuli.entities.OfferProduct;
import com.kuli.entities.PerKu;
import com.kuli.entities.Product;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-28T11:04:37")
@StaticMetamodel(Leasing.class)
public class Leasing_ { 

    public static volatile SingularAttribute<Leasing, Date> lateInvoice;
    public static volatile SingularAttribute<Leasing, PerKu> perId;
    public static volatile SingularAttribute<Leasing, Date> firstInvoice;
    public static volatile SingularAttribute<Leasing, Date> nextInvoice;
    public static volatile CollectionAttribute<Leasing, OfferProduct> offerProductCollection;
    public static volatile SingularAttribute<Leasing, Integer> leId;
    public static volatile SingularAttribute<Leasing, Product> pId;
    public static volatile SingularAttribute<Leasing, Date> expirationDate;

}