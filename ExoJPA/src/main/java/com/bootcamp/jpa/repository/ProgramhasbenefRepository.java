/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.jpa.repository;

import com.bootcamp.jpa.entites.Beneficiaire;
import com.bootcamp.jpa.entites.Programme;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Orly
 */
public class ProgramhasbenefRepository {
    
     public  static  void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exo") ;

        EntityManager em = emf.createEntityManager() ;
        
        Programme id=  new  Programme("1") ;
        Beneficiaire idd ;
         idd = new   Beneficiaire("1");
        
        em.getTransaction().begin() ;
        em.persist(id);
        em.persist(idd) ;
        em.getTransaction().commit() ;
    }
    
}
