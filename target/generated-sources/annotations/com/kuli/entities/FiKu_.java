package com.kuli.entities;

import com.kuli.entities.Site;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-28T11:04:37")
@StaticMetamodel(FiKu.class)
public class FiKu_ { 

    public static volatile SingularAttribute<FiKu, Integer> fId;
    public static volatile CollectionAttribute<FiKu, Site> siteCollection;
    public static volatile SingularAttribute<FiKu, String> name;

}