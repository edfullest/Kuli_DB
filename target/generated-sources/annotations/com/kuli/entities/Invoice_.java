package com.kuli.entities;

import com.kuli.entities.OfferProduct;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-28T11:04:37")
@StaticMetamodel(Invoice.class)
public class Invoice_ { 

    public static volatile SingularAttribute<Invoice, Boolean> isPaid;
    public static volatile SingularAttribute<Invoice, Integer> quantity;
    public static volatile CollectionAttribute<Invoice, OfferProduct> offerProductCollection;
    public static volatile SingularAttribute<Invoice, Integer> iId;
    public static volatile SingularAttribute<Invoice, BigDecimal> price;
    public static volatile SingularAttribute<Invoice, Date> invoiceDate;

}