/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.jpa.entites;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author Orly
 */
@Entity(name = "tp_beneficiaire")
public class Beneficiaire extends Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idd;
    public String nomm;
    @ManyToMany(mappedBy = "beneficiaires")
    private final List<Programme> programmes = new ArrayList<Programme>();
    @ManyToMany(mappedBy = "beneficiaires")
    private final List<Projet> projets = new ArrayList<Projet>();


    
    /*public Beneficiaire(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    public Beneficiaire(String string) {
        super(string);
    }
}

