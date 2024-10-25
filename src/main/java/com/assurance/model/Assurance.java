package com.assurance.model;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "assurances")
public abstract class Assurance {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    private String typeAssurance;

    // Getters et setters

    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public Client getClient() { return client; }
    public void setClient(Client client) { this.client = client; }

    public String getTypeAssurance() { return typeAssurance; }
    public void setTypeAssurance(String typeAssurance) { this.typeAssurance = typeAssurance; }
}
