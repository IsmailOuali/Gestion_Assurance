package com.assurance.services.implementations;

import com.assurance.model.*;
import org.springframework.stereotype.Service;

@Service
public class CalculateurDevis {

    public Devis calculerDevis(AssuranceAutomobile auto){
        double montant = calculerDevisAutomobile(auto);
        return new Devis(montant);
    }
    public Devis calculerDevis(AssuranceSante sante){
        double montant = calculerDevisSante(sante);
        return new Devis(montant);
    }    public Devis calculerDevis(AssuranceHabitation habitation){
        double montant = calculerDevisHabitation(habitation);
        return new Devis(montant);
    }

    public double calculerDevisAutomobile(AssuranceAutomobile auto) {
        double montant = 500;
        if (auto.getAgeConducteur() < 25) {
            montant += montant * 0.10;
        }
        if (auto.getTypeVehicule().equals("luxe")) {
            montant += montant * 0.15;
        }
        if (auto.getUtilisation().equals("professionnelle")) {
            montant += montant * 0.10;
        }
        if (!auto.isHistoriqueConduiteSansSinistre()) {
            montant += montant * 0.10;
        } else {
            montant -= montant * 0.20;
        }
        return montant;
    }

    public double calculerDevisHabitation(AssuranceHabitation habitation) {
        double montant = 300;
        if (habitation.getTypeLogement().equals("maison")) {
            montant += montant * 0.02;
        }
        if (habitation.isZoneRisque()) {
            montant += montant * 0.05;
        }
        if (habitation.getValeurBien() > 200000) {
            montant += montant * 0.10;
        }
        if (!habitation.isSystemeSecurite()) {
            montant += montant * 0.15;
        } else {
            montant -= montant * 0.15;
        }
        return montant;
    }

    public double calculerDevisSante(AssuranceSante sante) {
        double montant = 150;
        if (sante.getAge() > 60) {
            montant += montant * 0.20;
        }
        if (sante.isAntecedentsMedicaux()) {
            montant += montant * 0.30;
        }
        if (sante.getTypeCouverture().equals("premium")) {
            montant += montant * 0.05;
        } else {
            montant -= montant * 0.10;
        }
        return montant;
    }
}
