/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp;

import com.bootcamp.jpa.entites.Beneficiaire;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Orly
 */
public class testbeneficiaire {
     public  static  void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exo") ;

        EntityManager em = emf.createEntityManager() ;
        
        Beneficiaire idd=  new   Beneficiaire("1") ;
        Beneficiaire nomm =  new   Beneficiaire("Berenger") ;
        
        em.getTransaction().begin() ;
        em.persist(idd);
        em.persist(nomm) ;
        em.getTransaction().commit() ;
    }
}
