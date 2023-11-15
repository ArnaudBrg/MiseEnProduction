package org.polytech.covid.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="centre_vaccination")
public class CentreVaccination {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;   
    @Column(name = "nom")
    private String nom;
    @Column(name = "ville")
    private String ville;
    
    // Autres propriétés et getters/setters
    public CentreVaccination(String nom, String ville) {
        this.nom = nom;
        this.ville = ville;
    }

    public CentreVaccination() {

    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getVille() {
        return ville;
    }
    public void setVille(String ville) {
        this.ville = ville;
    }
}