package org.polytech.covid.domain;

import jakarta.persistence.*;


@Entity
@Table
public class Personne {


    public enum Role {
        SUPERADMIN(0),
        ADMIN(1),
        MEDECIN(2);
        private int valeur;
        Role(int valeur) {
            this.valeur = valeur;
        }
        public int getValeur() {
            return valeur;
        }
    }
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
    @Column
    private Role role;
    public Personne() {}
    public Personne(Long id, String email, String telephone, String nom, String prenom, int role) {
        this.id = id;
        this.email = email;
        this.telephone = telephone;
        this.nom = nom;
        this.prenom = prenom;
        if (role == Role.SUPERADMIN.getValeur()) {
            this.role = Role.SUPERADMIN;
        } else if (role == Role.ADMIN.getValeur()) {
            this.role = Role.ADMIN;
        } else if (role == Role.MEDECIN.getValeur()) {
            this.role = Role.MEDECIN;
        } else {
            // Gestion de cas d'erreur ou de valeur inconnue
            throw new IllegalArgumentException("Valeur de rôle invalide : " + role);
        }
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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    public void setRole(int role) {
        if (role == Role.SUPERADMIN.getValeur()) {
            this.role = Role.SUPERADMIN;
        } else if (role == Role.ADMIN.getValeur()) {
            this.role = Role.ADMIN;
        } else if (role == Role.MEDECIN.getValeur()) {
            this.role = Role.MEDECIN;
        }
    }
}
