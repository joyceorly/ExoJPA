/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.jpa.repository;

import com.bootcamp.jpa.entites.Programme;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Orly
 */

    
     public class ProgrammeRepository extends Baserepository<Programme> {

    public ProgrammeRepository(String unitPersistence) {
        super(unitPersistence, Programme.class);
    }

    public List<Programme> findAll() throws SQLException {
        return null;
    }
    }
    

