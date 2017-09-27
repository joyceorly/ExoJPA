/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.jpa.repository;

import com.bootcamp.jpa.entites.Personne;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Orly
 */
public class PersonneRepository {
    public  static  void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exo") ;

        EntityManager em = emf.createEntityManager() ;
        
        Personne id=  new   Personne("1") ;
        Personne nom =  new   Personne("Benef") ;
        
        em.getTransaction().begin() ;
        em.persist(id);
        em.persist(nom) ;
        em.getTransaction().commit() ;
    }
    
}
