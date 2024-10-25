package com.assurance.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

@Entity
@Table(name="contrats")
public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client Client;

    @OneToOne
    @JoinColumn(name = "devis_id")
    private Devis devis;
    protected LocalDate date;
    protected LocalTime expirationDate;
    protected Boolean status;


    public Contrat() {

    }
    public Contrat(Client client, Devis devis ,LocalDate date, Boolean status) {
        this.date = date;
        this.status = status;
    }
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Client getClient() {
        return Client;
    }
    public void setClient(Client client) {
        Client = client;
    }
    public Devis getDevis() {
        return devis;
    }
    public void setDevis(Devis devis) {
        this.devis = devis;
    }
    public LocalTime getExpirationDate() {
        return expirationDate;
    }
    public void setExpirationDate(LocalTime expirationDate) {
        this.expirationDate = expirationDate;
    }


    public Boolean getStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }
}
