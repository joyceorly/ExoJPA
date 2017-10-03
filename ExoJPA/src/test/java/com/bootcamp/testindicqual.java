/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp;

import com.bootcamp.jpa.entites.IndicateurQualitatif;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Orly
 */
public class testindicqual {
    public  static  void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exo") ;

        EntityManager em = emf.createEntityManager() ;
        
        IndicateurQualitatif id=  new   IndicateurQualitatif("1") ;
        IndicateurQualitatif nom =  new   IndicateurQualitatif("kjojo") ;
        IndicateurQualitatif propriete=  new   IndicateurQualitatif("Maison") ;
        IndicateurQualitatif valeur =  new   IndicateurQualitatif("1million") ;

        IndicateurQualitatif  IndicateurPerformance= new IndicateurQualitatif("1");
        
        em.getTransaction().begin() ;
        em.persist(id);
        em.persist(nom) ;
        em.persist(propriete);
        em.persist(valeur) ;
        em.persist(IndicateurPerformance);
        em.getTransaction().commit() ;
     
        
    }
}
