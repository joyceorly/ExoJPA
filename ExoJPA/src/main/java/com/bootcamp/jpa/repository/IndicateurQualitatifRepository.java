/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.jpa.repository;

import com.bootcamp.jpa.entites.IndicateurQualitatif;
import java.sql.SQLException;
import java.util.List;


/**
 *
 * @author Orly
 */

    
      public class IndicateurQualitatifRepository extends Baserepository<IndicateurQualitatif> {

            public IndicateurQualitatifRepository(String unitPersistence) {
        super(unitPersistence, IndicateurQualitatif.class);
    }

         public List<IndicateurQualitatif> findAll() throws SQLException {
        return null;
    }
    }
   
    

