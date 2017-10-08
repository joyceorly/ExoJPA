/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp;

import com.bootcamp.jpa.entites.Beneficiaire;
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
     
     
     public void createJsonFile() throws SQLException, IOException {
       testbeneficiaire  b = new testbeneficiaire ();
        b.setnom("Berenger");
       
        Gson gson = new Gson();
         Object testbeneficiaire = null;
        String json = gson.toJson(testbeneficiaire);
        System.out.println(json);
         Type writer = null;
        /*try (FileWriter writer = new FileWriter("TestPackages\com.bootcamp\testbailleur.json")) {
            */
            gson.toJson(testbeneficiaire, writer);

        /*} catch (IOException e) {
        }*/
        
        gson.toJson(testbeneficiaire, new FileWriter("TestPackages//com.bootcamp//testbeneficiaire.json"));
    }

    private void setnom(String berenger) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
