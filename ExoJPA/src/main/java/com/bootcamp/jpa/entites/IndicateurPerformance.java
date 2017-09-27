/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.jpa.entites;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
/**
 *
 * @author Orly
 */
@Entity(name = "tp_indicateur_performance")
public class IndicateurPerformance implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String nom;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "indicateurPerformance")
    private List<IndicateurQualitatif> indicateurQualitatifs;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "indicateurPerformance")
    private List<IndicateurQuantitatif> indicateurQuantitatifs;

    public IndicateurPerformance() {
    }

    
    public IndicateurPerformance(String kaka) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    

    public String getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}