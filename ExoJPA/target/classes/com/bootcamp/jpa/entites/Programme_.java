package com.bootcamp.jpa.entites;

import com.bootcamp.jpa.entites.IndicateurPerformance;
import com.bootcamp.jpa.entites.Projet;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2017-09-27T11:59:15")
@StaticMetamodel(Programme.class)
public class Programme_ { 

    public static volatile ListAttribute<Programme, Projet> projets;
    public static volatile SingularAttribute<Programme, String> objectif;
    public static volatile SingularAttribute<Programme, Long> id;
    public static volatile SingularAttribute<Programme, String> nom;
    public static volatile SingularAttribute<Programme, IndicateurPerformance> indicateurPerformance;

}