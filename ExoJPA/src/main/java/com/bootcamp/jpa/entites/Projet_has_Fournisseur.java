/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.jpa.entites;

import javax.persistence.OneToMany;

/**
 *
 * @author Orly
 */
public class Projet_has_Fournisseur {
   @OneToMany
     public Projet projet;
     @OneToMany
     public Fournisseur fournisseur;
    
    public String duree;
}
    

