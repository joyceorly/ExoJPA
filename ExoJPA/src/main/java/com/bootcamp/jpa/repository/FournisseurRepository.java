/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.jpa.repository;

import com.bootcamp.jpa.entites.Fournisseur;
import java.sql.SQLException;
import java.util.List;



/**
 *
 * @author Orly
 */
public class FournisseurRepository extends Baserepository<Fournisseur> {

    public FournisseurRepository(String unitPersistence) {
        super(unitPersistence, Fournisseur.class);
    }

    public List<Fournisseur> findAll() throws SQLException {
        return null;
    }
}
