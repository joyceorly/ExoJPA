/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp;

import com.bootcamp.jpa.entites.IndicateurQuantitatif;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Orly
 */
public class testindicquant {
    
     public  static  void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exo") ;

        EntityManager em = emf.createEntityManager() ;
        
        IndicateurQuantitatif id=  new   IndicateurQuantitatif("1") ;
        IndicateurQuantitatif nom =  new   IndicateurQuantitatif("kojo") ;
        IndicateurQuantitatif propriete=  new   IndicateurQuantitatif("Maison") ;
        IndicateurQuantitatif valeur =  new   IndicateurQuantitatif("1million") ;

        IndicateurQuantitatif  IndicateurPerformance= new IndicateurQuantitatif("1");
        
        em.getTransaction().begin() ;
        em.persist(id);
        em.persist(nom) ;
        em.persist(propriete);
        em.persist(valeur) ;
        em.persist(IndicateurPerformance);
        em.getTransaction().commit() ;
     
        
    }
    
}
