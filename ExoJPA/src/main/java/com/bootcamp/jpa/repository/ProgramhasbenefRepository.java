/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.jpa.repository;

import com.bootcamp.jpa.entites.Programme_has_Beneficiaire;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Orly
 */

    
      public class ProgramhasbenefRepository extends Baserepository<Programme_has_Beneficiaire> {

            public ProgramhasbenefRepository(String unitPersistence) {
        super(unitPersistence, Programme_has_Beneficiaire.class);
    }

         public List<Programme_has_Beneficiaire> findAll() throws SQLException {
        return null;
    }
    }
