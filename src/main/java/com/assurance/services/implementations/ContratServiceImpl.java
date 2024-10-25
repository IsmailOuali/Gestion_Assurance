package com.assurance.services.implementations;

import com.assurance.model.Contrat;
import com.assurance.repository.interfaces.ContratRepository;
import com.assurance.services.interfaces.ContratService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContratServiceImpl implements ContratService {

    private final ContratRepository contratRepository;

    @Autowired
    public ContratServiceImpl(ContratRepository contratRepository) {
        this.contratRepository = contratRepository;
    }

    public List<Contrat> getAllContrats() {
        return contratRepository.findAll();
    }

    public Optional<Contrat> getContratById(Integer id) {
        return contratRepository.findById(id);
    }

    public Contrat createContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    public Contrat updateContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    public void deleteContrat(Integer id) {
        contratRepository.deleteById(id);
    }
}
