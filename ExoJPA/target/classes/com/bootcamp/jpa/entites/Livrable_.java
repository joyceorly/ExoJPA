package com.bootcamp.jpa.entites;

import com.bootcamp.jpa.entites.IndicateurPerformance;
import com.bootcamp.jpa.entites.Projet;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2017-09-27T11:59:15")
@StaticMetamodel(Livrable.class)
public class Livrable_ { 

    public static volatile SingularAttribute<Livrable, Projet> projet;
    public static volatile SingularAttribute<Livrable, Long> id;
    public static volatile SingularAttribute<Livrable, String> nom;
    public static volatile SingularAttribute<Livrable, IndicateurPerformance> indicateurPerformance;

}