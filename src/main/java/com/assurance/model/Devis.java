package com.assurance.model;


import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "devis")
public class Devis {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    private String typeAssurance; // Automobile, Habitation, Santé
    private double montantEstime;
    private LocalDate dateDemande;

    private String etat; // "En attente", "Accepté", "Refusé"

    // Getters et setters
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public Client getClient() { return client; }
    public void setClient(Client client) { this.client = client; }

    public String getTypeAssurance() { return typeAssurance; }
    public void setTypeAssurance(String typeAssurance) { this.typeAssurance = typeAssurance; }

    public double getMontantEstime() { return montantEstime; }
    public void setMontantEstime(double montantEstime) { this.montantEstime = montantEstime; }

    public LocalDate getDateDemande() { return dateDemande; }
    public void setDateDemande(LocalDate dateDemande) { this.dateDemande = dateDemande; }

    public String getEtat() { return etat; }
    public void setEtat(String etat) { this.etat = etat; }
}

