/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.jpa.repository;

import com.bootcamp.jpa.entites.Livrable;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Orly
 */    
       public class LivrableRepository extends Baserepository<Livrable> {

            public LivrableRepository(String unitPersistence) {
        super(unitPersistence, Livrable.class);
    }

         public List<Livrable> findAll() throws SQLException {
        return null;
    }
    }
    
   
    

