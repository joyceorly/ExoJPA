/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.jpa.repository;

import com.bootcamp.jpa.entites.Bailleur;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Orly
 */
public class BailleurRepository {
    
    public  static  void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exo") ;

        EntityManager em = emf.createEntityManager() ;
        
        Bailleur idd=  new   Bailleur("1") ;
        Bailleur nomm =  new   Bailleur("Berenger") ;
        Bailleur typeBailleur=new Bailleur("Prive");
        
        em.getTransaction().begin() ;
        em.persist(idd);
        em.persist(nomm) ;
        em.persist(typeBailleur);
        em.getTransaction().commit() ;
    }
    
}
