package com.bootcamp.jpa.entites;

import com.bootcamp.jpa.entites.IndicateurPerformance;
import com.bootcamp.jpa.entites.Livrable;
import com.bootcamp.jpa.entites.Programme;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2017-09-27T11:59:15")
@StaticMetamodel(Projet.class)
public class Projet_ { 

    public static volatile ListAttribute<Projet, Livrable> livrables;
    public static volatile SingularAttribute<Projet, String> objectif;
    public static volatile SingularAttribute<Projet, Long> id;
    public static volatile SingularAttribute<Projet, String> nom;
    public static volatile SingularAttribute<Projet, Programme> programme;
    public static volatile SingularAttribute<Projet, IndicateurPerformance> indicateurPerformance;

}