package com.kuli.entities;

import com.kuli.entities.License;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-28T11:04:37")
@StaticMetamodel(Maintenance.class)
public class Maintenance_ { 

    public static volatile SingularAttribute<Maintenance, Date> paidUntil;
    public static volatile SingularAttribute<Maintenance, BigDecimal> price;
    public static volatile SingularAttribute<Maintenance, Integer> mId;
    public static volatile CollectionAttribute<Maintenance, License> licenseCollection;
    public static volatile SingularAttribute<Maintenance, Date> startDate;
    public static volatile SingularAttribute<Maintenance, Date> expirationDate;

}