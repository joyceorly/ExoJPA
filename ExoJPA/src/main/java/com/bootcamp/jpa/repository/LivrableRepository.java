/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.jpa.repository;

import com.bootcamp.jpa.entites.Livrable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Orly
 */
public class LivrableRepository {
    
    public  static  void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exo") ;

        EntityManager em = emf.createEntityManager() ;
        
        Livrable id=  new   Livrable("1") ;
        Livrable nom =  new   Livrable("kaka") ;
        Livrable projet=  new   Livrable("1") ;
        Livrable indicateurPerformance =  new   Livrable("1") ;
        
        
        em.getTransaction().begin() ;
        em.persist(id);
        em.persist(nom) ;
        em.persist(projet);
        em.persist(indicateurPerformance) ;
        em.getTransaction().commit() ;
        
    }
    
}
