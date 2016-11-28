package com.kuli.entities;

import com.kuli.entities.OfferProduct;
import com.kuli.entities.PerKu;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-28T11:04:37")
@StaticMetamodel(Offer.class)
public class Offer_ { 

    public static volatile SingularAttribute<Offer, Date> date;
    public static volatile SingularAttribute<Offer, PerKu> perId;
    public static volatile CollectionAttribute<Offer, OfferProduct> offerProductCollection;
    public static volatile SingularAttribute<Offer, Date> limitDate;
    public static volatile SingularAttribute<Offer, Integer> oId;

}