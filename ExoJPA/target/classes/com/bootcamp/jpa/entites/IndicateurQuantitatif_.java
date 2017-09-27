package com.bootcamp.jpa.entites;

import com.bootcamp.jpa.entites.IndicateurPerformance;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2017-09-27T11:59:15")
@StaticMetamodel(IndicateurQuantitatif.class)
public class IndicateurQuantitatif_ { 

    public static volatile SingularAttribute<IndicateurQuantitatif, Integer> valeur;
    public static volatile SingularAttribute<IndicateurQuantitatif, Long> id;
    public static volatile SingularAttribute<IndicateurQuantitatif, String> propriete;
    public static volatile SingularAttribute<IndicateurQuantitatif, String> nom;
    public static volatile SingularAttribute<IndicateurQuantitatif, IndicateurPerformance> indicateurPerformance;

}