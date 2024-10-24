package com.assurance;

import com.assurance.model.AssuranceAutomobile;
import com.assurance.model.AssuranceHabitation;
import com.assurance.model.AssuranceSante;
import com.assurance.repository.interfaces.AssuranceAutomobileRepository;
import com.assurance.repository.interfaces.AssuranceHabitationRepository;
import com.assurance.repository.interfaces.AssuranceSanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AssuranceApplication implements CommandLineRunner {

    @Autowired
    private AssuranceAutomobileRepository assuranceAutomobileRepository;

    @Autowired
    private AssuranceHabitationRepository assuranceHabitationRepository;

    @Autowired
    private AssuranceSanteRepository assuranceSanteRepository;

    public static void main(String[] args) {
        SpringApplication.run(AssuranceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Insert Assurance Automobile
        AssuranceAutomobile auto = new AssuranceAutomobile();
        auto.setAgeConducteur(24);
        auto.setTypeVehicule("utilitaire");
        auto.setUtilisation("professionnelle");
        auto.setHistoriqueConduiteSansSinistre(false);

        assuranceAutomobileRepository.save(auto);
        System.out.println("Assurance Automobile saved: " + auto);

        // Insert Assurance Habitation
        AssuranceHabitation habitation = new AssuranceHabitation();
        habitation.setValeurBien(350000);
        habitation.setTypeLogement("appartement");
        habitation.setZoneRisque(false);
        habitation.setSystemeSecurite(true);

        assuranceHabitationRepository.save(habitation);
        System.out.println("Assurance Habitation saved: " + habitation);

        // Insert Assurance Santé
        AssuranceSante sante = new AssuranceSante();
        sante.setAge(45);
        sante.setAntecedentsMedicaux(true);
        sante.setTypeCouverture("premium");

        assuranceSanteRepository.save(sante);
        System.out.println("Assurance Santé saved: " + sante);
    }
}
