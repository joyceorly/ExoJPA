/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp;

import com.bootcamp.jpa.entites.Fournisseur;
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
    
    public void createJsonFile() throws SQLException, IOException {
       testfournisseur  f = new testfournisseur ();
        f.setnom("Berenger");
       
        Gson gson = new Gson();
         Object testfournisseur= null;
        String json = gson.toJson(testfournisseur);
        System.out.println(json);
         Type writer = null;
        /*try (FileWriter writer = new FileWriter("TestPackages\com.bootcamp\testbailleur.json")) {
            */
            gson.toJson(testfournisseur, writer);

        /*} catch (IOException e) {
        }*/
        
        gson.toJson(testfournisseur, new FileWriter("TestPackages//com.bootcamp//testfournisseur.json"));
    }

    private void setnom(String berenger) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
