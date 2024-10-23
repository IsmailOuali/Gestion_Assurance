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
    protected LocalDate date;
    protected Boolean status;


    public Contrat() {

    }
    public Contrat(LocalDate date, Boolean status) {
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
    public Boolean getStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }
}
