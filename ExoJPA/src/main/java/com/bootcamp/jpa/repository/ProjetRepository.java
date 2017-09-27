/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.jpa.repository;

import com.bootcamp.jpa.entites.Projet;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Orly
 */
public class ProjetRepository {
    
    public  static  void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exo") ;

        EntityManager em = emf.createEntityManager() ;
        
        Projet id=  new   Projet("1") ;
        Projet nom =  new   Projet("climar") ;
        Projet programme= new Projet("1");
        Projet objectif =  new   Projet("savoir le climar") ;
        Projet ProgrammeindicateurPerformance = new  Projet("1");
        
        em.getTransaction().begin() ;
        em.persist(id);
        em.persist(nom) ;
        em.persist(programme) ;
        em.persist(objectif) ;
        em.persist(ProgrammeindicateurPerformance) ;
        em.getTransaction().commit() ;
        
    }   
}
