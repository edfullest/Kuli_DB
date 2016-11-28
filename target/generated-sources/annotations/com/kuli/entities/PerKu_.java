package com.kuli.entities;

import com.kuli.entities.Leasing;
import com.kuli.entities.License;
import com.kuli.entities.Offer;
import com.kuli.entities.Site;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-28T11:04:37")
@StaticMetamodel(PerKu.class)
public class PerKu_ { 

    public static volatile SingularAttribute<PerKu, Integer> perId;
    public static volatile SingularAttribute<PerKu, String> firstName;
    public static volatile SingularAttribute<PerKu, String> lastName;
    public static volatile CollectionAttribute<PerKu, Offer> offerCollection;
    public static volatile SingularAttribute<PerKu, String> telephone;
    public static volatile SingularAttribute<PerKu, String> position;
    public static volatile CollectionAttribute<PerKu, License> licenseCollection;
    public static volatile CollectionAttribute<PerKu, Leasing> leasingCollection;
    public static volatile SingularAttribute<PerKu, String> email;
    public static volatile SingularAttribute<PerKu, Site> sId;

}