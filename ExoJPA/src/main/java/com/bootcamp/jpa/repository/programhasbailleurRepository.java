/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.jpa.repository;

import com.bootcamp.jpa.entites.Programme_has_Bailleur;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Orly
 */

    
      public class programhasbailleurRepository extends Baserepository<Programme_has_Bailleur> {

            public programhasbailleurRepository(String unitPersistence) {
        super(unitPersistence, Programme_has_Bailleur.class);
    }

         public List<Programme_has_Bailleur> findAll() throws SQLException {
        return null;
    }
    }

