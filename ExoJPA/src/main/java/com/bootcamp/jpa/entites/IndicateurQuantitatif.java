/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.jpa.entites;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Orly
 */
@Entity(name = "tp_indicateur_quantitatif")
public class IndicateurQuantitatif implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String nom;
    public String propriete;
    public int valeur;
    @ManyToOne
    @JoinColumn(name = "indicateurPerformance", referencedColumnName = "id")
    public IndicateurPerformance indicateurPerformance;

    public IndicateurQuantitatif() {
    }

    public IndicateurQuantitatif(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
