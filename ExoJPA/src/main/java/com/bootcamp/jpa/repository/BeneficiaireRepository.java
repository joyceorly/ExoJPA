/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.jpa.repository;

import com.bootcamp.jpa.entites.Beneficiaire;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Orly
 */
public class BeneficiaireRepository extends Baserepository<Beneficiaire> {

    public BeneficiaireRepository(String unitPersistence) {
        super(unitPersistence, Beneficiaire.class);
    }

    public List<Beneficiaire> findAll() throws SQLException {
        return null;
    }
}