/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.jpa.repository;

import com.bootcamp.jpa.entites.IndicateurPerformance;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Orly
 */
public class IndicateurPerformanceRepository {
    
    public  static  void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exo") ;

        EntityManager em = emf.createEntityManager() ;
        
        IndicateurPerformance id=  new   IndicateurPerformance("1") ;
        IndicateurPerformance nom =  new   IndicateurPerformance("kaka") ;
        
        em.getTransaction().begin() ;
        em.persist(id);
        em.persist(nom) ;
        em.getTransaction().commit() ;
        
        
        
        /*EntityManager ef = emf.createEntityManager() ;

        IndicateurPerformance nom1 =  new   IndicateurPerformance("koko") ;
        ef.getTransaction().begin() ;
        ef.persist(nom1) ;
        ef.getTransaction().commit() ;*/

        //System.out.println("Id = " + nom.getId()) ;
    }
    
}
