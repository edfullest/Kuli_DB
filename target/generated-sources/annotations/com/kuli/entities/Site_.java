package com.kuli.entities;

import com.kuli.entities.FiKu;
import com.kuli.entities.PerKu;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-28T11:04:37")
@StaticMetamodel(Site.class)
public class Site_ { 

    public static volatile SingularAttribute<Site, String> zip;
    public static volatile SingularAttribute<Site, FiKu> fId;
    public static volatile SingularAttribute<Site, String> country;
    public static volatile SingularAttribute<Site, Boolean> isHQ;
    public static volatile SingularAttribute<Site, String> city;
    public static volatile SingularAttribute<Site, String> streetNo;
    public static volatile CollectionAttribute<Site, PerKu> perKuCollection;
    public static volatile SingularAttribute<Site, String> street;
    public static volatile SingularAttribute<Site, String> state;
    public static volatile SingularAttribute<Site, Integer> sId;

}