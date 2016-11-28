package com.kuli.entities;

import com.kuli.entities.Maintenance;
import com.kuli.entities.OfferProduct;
import com.kuli.entities.PerKu;
import com.kuli.entities.Product;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-28T11:04:37")
@StaticMetamodel(License.class)
public class License_ { 

    public static volatile SingularAttribute<License, PerKu> perId;
    public static volatile SingularAttribute<License, Integer> lId;
    public static volatile SingularAttribute<License, OfferProduct> opId;
    public static volatile SingularAttribute<License, Maintenance> mId;
    public static volatile SingularAttribute<License, Product> pId;
    public static volatile SingularAttribute<License, String> installationKey;
    public static volatile SingularAttribute<License, Date> expirationDate;

}