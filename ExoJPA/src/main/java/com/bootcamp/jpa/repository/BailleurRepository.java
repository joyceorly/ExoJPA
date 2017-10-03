/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.jpa.repository;

/*import com.bootcamp.jpa.entites.Bailleur;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;*/

import com.bootcamp.jpa.entites.Bailleur;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Orly
 */
/*public class BailleurRepository {
    
   
    
}*/





public class BailleurRepository extends Baserepository<Bailleur> {

    public BailleurRepository(String unitPersistence) {
        super(unitPersistence, Bailleur.class);
    }

    public List<Bailleur> findAll() throws SQLException {
        return null;
    }
}