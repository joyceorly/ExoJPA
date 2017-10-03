/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.jpa.repository;

import com.bootcamp.jpa.entites.IndicateurPerformance;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Orly
 */

    
   
          
      public class IndicateurPerformanceRepository extends Baserepository<IndicateurPerformance> {

            public IndicateurPerformanceRepository(String unitPersistence) {
        super(unitPersistence, IndicateurPerformance.class);
    }

         public List<IndicateurPerformance> findAll() throws SQLException {
        return null;
    }
    }
   
 
    
