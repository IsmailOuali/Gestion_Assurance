package com.assurance.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "assurance_habitation")
public class AssuranceHabitation extends Assurance {

    private double valeurBien;
    private String typeLogement; // appartement, maison, etc.
    private boolean zoneRisque;
    private boolean systemeSecurite;

    public AssuranceHabitation() {
        this.setTypeAssurance("Habitation");
    }

    // Getters et setters

    public double getValeurBien() { return valeurBien; }
    public void setValeurBien(double valeurBien) { this.valeurBien = valeurBien; }

    public String getTypeLogement() { return typeLogement; }
    public void setTypeLogement(String typeLogement) { this.typeLogement = typeLogement; }

    public boolean isZoneRisque() { return zoneRisque; }
    public void setZoneRisque(boolean zoneRisque) { this.zoneRisque = zoneRisque; }

    public boolean isSystemeSecurite() { return systemeSecurite; }
    public void setSystemeSecurite(boolean systemeSecurite) { this.systemeSecurite = systemeSecurite; }
}

