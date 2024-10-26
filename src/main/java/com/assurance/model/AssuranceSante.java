package com.assurance.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "assurance_sante")
public class AssuranceSante extends Assurance {

    private int age;
    private boolean antecedentsMedicaux;
    private String typeCouverture; // de base, premium

    public AssuranceSante() {
        this.setTypeAssurance("Sante");
    }


    // Getters et setters

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public boolean isAntecedentsMedicaux() { return antecedentsMedicaux; }
    public void setAntecedentsMedicaux(boolean antecedentsMedicaux) { this.antecedentsMedicaux = antecedentsMedicaux; }

    public String getTypeCouverture() { return typeCouverture; }
    public void setTypeCouverture(String typeCouverture) { this.typeCouverture = typeCouverture; }
}
