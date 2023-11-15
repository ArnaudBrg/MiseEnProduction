package org.polytech.covid.domain;
import java.time.LocalDate;

import jakarta.persistence.*;


@Entity
@Table
public class Inscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "email")
    private String email;
    @Column(name = "telephone")
    private String telephone;
    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "date")
    private LocalDate date;
    @Column(name = "centre_vaccination")
    private String centre;

    // Autres propriétés et getters/setters

    public Inscription(String centre, String email, String telephone, String nom, String prenom, LocalDate date) {
        this.email = email;
        this.telephone = telephone;
        this.nom = nom;
        this.prenom = prenom;
        this.date = date;
        this.centre = centre;
    }

    public Inscription() {

    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public String getCentre() {
        return centre;
    }
    public void setCentre(String centre) {
        this.centre = centre;
    }
}