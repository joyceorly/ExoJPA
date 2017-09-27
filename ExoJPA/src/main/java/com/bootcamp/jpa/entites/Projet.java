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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Orly
 */
@Entity(name = "tp_projet")
public class Projet implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String nom;
    
    @ManyToOne
    @JoinColumn(name = "programme", referencedColumnName = "id")
    public Programme programme;
    
   public String objectif;
    
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "projet")
    public List<Livrable> livrables;
    
    @OneToOne(fetch = FetchType.LAZY)
    public IndicateurPerformance indicateurPerformance;

    public Projet() {
    }

    public Projet(String kaka) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
