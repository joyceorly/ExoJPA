/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp;

import com.bootcamp.jpa.entites.Livrable;
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
public class testlivrable {
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
    public void createJsonFile() throws SQLException, IOException {
       testlivrable l = new testlivrable ();
        l.setnom("kaka");
        
        Gson gson = new Gson();
         Object testlivrable = null;
        String json = gson.toJson(testlivrable);
        System.out.println(json);
         Type writer = null;
        /*try (FileWriter writer = new FileWriter("TestPackages\com.bootcamp\testbailleur.json")) {
            */
            gson.toJson(testlivrable, writer);

        /*} catch (IOException e) {
        }*/
        
        gson.toJson(testlivrable, new FileWriter("TestPackages//com.bootcamp//testlivrable.json"));
    }

    private void setnom(String kaka) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
