package com.assurance.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "assurance_automobile")
public class AssuranceAutomobile extends Assurance {

    private int ageConducteur;
    private String typeVehicule; // luxe, utilitaire, etc.
    private String utilisation; // privée, professionnelle
    private boolean historiqueConduiteSansSinistre;

    public AssuranceAutomobile() {
        this.setTypeAssurance("Automobile");
    }


    // Getters et setters

    public int getAgeConducteur() { return ageConducteur; }
    public void setAgeConducteur(int ageConducteur) { this.ageConducteur = ageConducteur; }

    public String getTypeVehicule() { return typeVehicule; }
    public void setTypeVehicule(String typeVehicule) { this.typeVehicule = typeVehicule; }

    public String getUtilisation() { return utilisation; }
    public void setUtilisation(String utilisation) { this.utilisation = utilisation; }

    public boolean isHistoriqueConduiteSansSinistre() { return historiqueConduiteSansSinistre; }
    public void setHistoriqueConduiteSansSinistre(boolean historiqueConduiteSansSinistre) {
        this.historiqueConduiteSansSinistre = historiqueConduiteSansSinistre;
    }
}
