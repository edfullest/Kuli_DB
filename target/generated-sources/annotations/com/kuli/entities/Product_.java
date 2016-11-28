package com.kuli.entities;

import com.kuli.entities.Leasing;
import com.kuli.entities.License;
import com.kuli.entities.OfferProduct;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-28T11:04:37")
@StaticMetamodel(Product.class)
public class Product_ { 

    public static volatile SingularAttribute<Product, String> requirements;
    public static volatile SingularAttribute<Product, String> os;
    public static volatile CollectionAttribute<Product, OfferProduct> offerProductCollection;
    public static volatile SingularAttribute<Product, String> description;
    public static volatile SingularAttribute<Product, Integer> pId;
    public static volatile CollectionAttribute<Product, License> licenseCollection;
    public static volatile CollectionAttribute<Product, Leasing> leasingCollection;
    public static volatile SingularAttribute<Product, String> version;
    public static volatile SingularAttribute<Product, BigDecimal> listPrice;

}