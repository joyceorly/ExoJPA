/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp;

import com.bootcamp.jpa.entites.Programme;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Orly
 */
public class testprogramme {
    public  static  void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exo") ;

        EntityManager em = emf.createEntityManager() ;
        
        Programme id=  new   Programme("1") ;
        Programme nom =  new   Programme("climar") ;
        Programme objectif =  new   Programme("savoir le climar") ;
        Programme ProgrammeindicateurPerformance = new  Programme("1");
        
        em.getTransaction().begin() ;
        em.persist(id);
        em.persist(nom) ;
        em.persist(objectif) ;
        em.persist(ProgrammeindicateurPerformance) ;
        em.getTransaction().commit() ;
        
    }   
    
}
