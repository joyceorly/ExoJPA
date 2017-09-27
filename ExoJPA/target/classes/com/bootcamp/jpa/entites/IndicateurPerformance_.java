package com.bootcamp.jpa.entites;

import com.bootcamp.jpa.entites.IndicateurQualitatif;
import com.bootcamp.jpa.entites.IndicateurQuantitatif;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2017-09-27T11:59:15")
@StaticMetamodel(IndicateurPerformance.class)
public class IndicateurPerformance_ { 

    public static volatile ListAttribute<IndicateurPerformance, IndicateurQualitatif> indicateurQualitatifs;
    public static volatile SingularAttribute<IndicateurPerformance, String> libelle;
    public static volatile SingularAttribute<IndicateurPerformance, Long> id;
    public static volatile ListAttribute<IndicateurPerformance, IndicateurQuantitatif> indicateurQuantitatifs;

}