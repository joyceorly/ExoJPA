/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp;

import com.bootcamp.jpa.entites.IndicateurPerformance;
import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.sql.SQLException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Orly
 */
public class testindicperfo {
    
     public  static  void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exo") ;

        EntityManager em = emf.createEntityManager() ;
        
        IndicateurPerformance id=  new   IndicateurPerformance("1") ;
        IndicateurPerformance nom =  new   IndicateurPerformance("kaka") ;
        
        em.getTransaction().begin() ;
        em.persist(id);
        em.persist(nom) ;
        em.getTransaction().commit() ;
        
     }
    public void createJsonFile() throws SQLException, IOException {
       testindicperfo  b = new testindicperfo ();
        b.setnom("kaka");
        
        Gson gson = new Gson();
         Object testindicperfo = null;
        String json = gson.toJson(testindicperfo);
        System.out.println(json);
         Type writer = null;
        /*try (FileWriter writer = new FileWriter("TestPackages\com.bootcamp\testbailleur.json")) {
            */
            gson.toJson(testindicperfo, writer);

        /*} catch (IOException e) {
        }*/
        
        gson.toJson(testindicperfo, new FileWriter("TestPackages//com.bootcamp//testindicper.json"));
    }

    private void setnom(String kaka) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
