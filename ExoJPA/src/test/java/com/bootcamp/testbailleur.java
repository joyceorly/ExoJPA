/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp;

import com.bootcamp.jpa.entites.Bailleur;
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
public class testbailleur {
    
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

    private static void setnomm(String berenger) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
     
     
     public void createJsonFile() throws SQLException, IOException {
       testbailleur  b = new testbailleur ();
        b.setnom("Berenger");
        b.settypebailleur("Prive");
        Gson gson = new Gson();
         Object testbailleur = null;
        String json = gson.toJson(testbailleur);
        System.out.println(json);
         Type writer = null;
        /*try (FileWriter writer = new FileWriter("TestPackages\com.bootcamp\testbailleur.json")) {
            */
            gson.toJson(testbailleur, writer);

        /*} catch (IOException e) {
        }*/
        
        gson.toJson(testbailleur, new FileWriter("TestPackages//com.bootcamp//testbailleur.json"));
    }

    private void setnom(String berenger) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void settypebailleur(String prive) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
