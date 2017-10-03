/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.jpa.repository;

import com.bootcamp.jpa.entites.IndicateurQuantitatif;
import java.sql.SQLException;
import java.util.List;



/**
 *
 * @author Orly
 */

        public class IndicateurQuantitatifRepository extends Baserepository<IndicateurQuantitatif> {

            public IndicateurQuantitatifRepository(String unitPersistence) {
        super(unitPersistence, IndicateurQuantitatif.class);
    }

         public List<IndicateurQuantitatif> findAll() throws SQLException {
        return null;
    }
    }
   
    

