/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.jpa.repository;

import com.bootcamp.jpa.entites.Personne;
import java.sql.SQLException;
import java.util.List;


/**
 *
 * @author Orly
 */

    
    public class PersonneRepository extends Baserepository<Personne> {

    public PersonneRepository(String unitPersistence) {
        super(unitPersistence, Personne.class);
    }

    public List<Personne> findAll() throws SQLException {
        return null;
    }
    }
