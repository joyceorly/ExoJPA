/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.jpa.entites;


import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Orly
 */

    @Entity(name = "tp_indicateur_qualitatif")
public class IndicateurQualitatif implements Serializable {
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String nom;
    public String propriete;
   public String valeur;
    @ManyToOne
    @JoinColumn(name = "indicateurPerformance", referencedColumnName = "id")
    public IndicateurPerformance indicateurPerformance;

    public IndicateurQualitatif(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public IndicateurQualitatif() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

