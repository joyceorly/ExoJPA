package com.bootcamp.jpa.entites;

import com.bootcamp.jpa.entites.Programme;
import com.bootcamp.jpa.entites.Projet;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2017-09-27T11:59:15")
@StaticMetamodel(Beneficiaire.class)
public class Beneficiaire_ extends Personne_ {

    public static volatile ListAttribute<Beneficiaire, Programme> programmes;
    public static volatile ListAttribute<Beneficiaire, Projet> projets;

}