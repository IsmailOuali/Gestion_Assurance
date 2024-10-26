package com.assurance.services.implementations;

import com.assurance.model.*;
import com.assurance.repository.interfaces.*;
import com.assurance.services.interfaces.AssuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AssuranceServiceImpl implements AssuranceService {

    private  AssuranceRepository assuranceRepository;
    private  AssuranceSanteRepository assuranceSanteRepository;
    private  AssuranceAutomobileRepository assuranceAutomobileRepository;
    private  AssuranceHabitationRepository assuranceHabitationRepository;

    @Autowired
    public void AssuranceService(AssuranceRepository assuranceRepository,
                                 AssuranceSanteRepository assuranceSanteRepository,
                                 AssuranceAutomobileRepository assuranceAutomobileRepository,
                                 AssuranceHabitationRepository assuranceHabitationRepository) {
        this.assuranceRepository = assuranceRepository;
        this.assuranceSanteRepository = assuranceSanteRepository;
        this.assuranceAutomobileRepository = assuranceAutomobileRepository;
        this.assuranceHabitationRepository = assuranceHabitationRepository;
    }

    public Assurance addAssurance(Assurance assurance) {
        return assuranceRepository.save(assurance);
    }

    public List<Assurance> getAllAssurances() {
        return assuranceRepository.findAll();
    }

    public Assurance getAssuranceById(UUID id) {
        return assuranceRepository.findById(id).orElse(null);
    }

    public void deleteAssurance(UUID id) {
        assuranceRepository.deleteById(id);
    }

    // Methods for specific types
    public AssuranceSante addAssuranceSante(AssuranceSante assuranceSante) {
        return assuranceSanteRepository.save(assuranceSante);
    }

    public AssuranceAutomobile addAssuranceAutomobile(AssuranceAutomobile assuranceAutomobile) {
        return assuranceAutomobileRepository.save(assuranceAutomobile);
    }

    public AssuranceHabitation addAssuranceHabitation(AssuranceHabitation assuranceHabitation) {
        return assuranceHabitationRepository.save(assuranceHabitation);
    }
}
