/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp;

import com.bootcamp.jpa.entites.Fournisseur;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Orly
 */
public class testfournisseur {
    public  static  void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exo") ;

        EntityManager em = emf.createEntityManager() ;
        
        Fournisseur idd=  new   Fournisseur("1") ;
        Fournisseur nomm =  new   Fournisseur("Berenger") ;
        
        em.getTransaction().begin() ;
        em.persist(idd);
        em.persist(nomm) ;
        em.getTransaction().commit() ;
    }
}
