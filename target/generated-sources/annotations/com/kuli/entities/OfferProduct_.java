package com.kuli.entities;

import com.kuli.entities.Invoice;
import com.kuli.entities.Leasing;
import com.kuli.entities.License;
import com.kuli.entities.Offer;
import com.kuli.entities.Product;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-28T11:04:37")
@StaticMetamodel(OfferProduct.class)
public class OfferProduct_ { 

    public static volatile SingularAttribute<OfferProduct, Integer> quantity;
    public static volatile SingularAttribute<OfferProduct, BigDecimal> salePrice;
    public static volatile SingularAttribute<OfferProduct, Invoice> iId;
    public static volatile SingularAttribute<OfferProduct, Leasing> leId;
    public static volatile SingularAttribute<OfferProduct, Integer> opId;
    public static volatile SingularAttribute<OfferProduct, Product> pId;
    public static volatile SingularAttribute<OfferProduct, Offer> oId;
    public static volatile CollectionAttribute<OfferProduct, License> licenseCollection;

}