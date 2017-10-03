/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.jpa.repository;

import com.bootcamp.jpa.entites.Projet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Orly
 */

        public class ProjetRepository extends Baserepository<Projet> {

            public ProjetRepository(String unitPersistence) {
        super(unitPersistence, Projet.class);
    }

         public List<Projet> findAll() throws SQLException {
        return null;
    }
    }
    
    

