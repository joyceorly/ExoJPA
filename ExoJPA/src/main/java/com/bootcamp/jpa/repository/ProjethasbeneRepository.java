/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.jpa.repository;

import com.bootcamp.jpa.entites.Projet_has_Beneficiaire;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Orly
 */

    public class ProjethasbeneRepository extends Baserepository<Projet_has_Beneficiaire> {

            public ProjethasbeneRepository(String unitPersistence) {
        super(unitPersistence, Projet_has_Beneficiaire.class);
    }

         public List<Projet_has_Beneficiaire> findAll() throws SQLException {
        return null;
    }
    }
