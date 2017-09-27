/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.jpa.entites;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 *
 * @author Orly
 */
public class Programme_has_Beneficiaire {
    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "tp_programme_beneficiaire",
            joinColumns = @JoinColumn(name = "programme_id"),
            inverseJoinColumns = @JoinColumn(name = "beneficiaire_id")
    )
    private final List<Beneficiaire> beneficiaires = new ArrayList<Beneficiaire>();
    
    private String duree;
    
}
