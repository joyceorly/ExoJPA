/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.jpa.repository;

import com.bootcamp.jpa.entites.Projet_has_Bailleur;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Orly
 */    
    public class ProjethasbailleurRepository extends Baserepository<Projet_has_Bailleur> {

            public ProjethasbailleurRepository(String unitPersistence) {
        super(unitPersistence, Projet_has_Bailleur.class);
    }

         public List<Projet_has_Bailleur> findAll() throws SQLException {
        return null;
    }
    }
    

