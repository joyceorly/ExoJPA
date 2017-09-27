/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.jpa.entites;

import java.io.Serializable;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Orly
 */
@Entity(name = "tp_programme")
public class Programme implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String nom;
    public String objectif;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "programme")
    public List<Projet> projets;
    @OneToOne(fetch = FetchType.LAZY)
    public IndicateurPerformance indicateurPerformance;

    public Programme() {
    }

    public Programme(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
