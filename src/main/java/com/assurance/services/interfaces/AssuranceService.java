package com.assurance.services.interfaces;

import com.assurance.model.Assurance;
import com.assurance.model.AssuranceAutomobile;
import com.assurance.model.AssuranceHabitation;
import com.assurance.model.AssuranceSante;

import java.util.List;
import java.util.UUID;

public interface AssuranceService {
    public Assurance addAssurance(Assurance assurance);
    public List<Assurance> getAllAssurances();
    public Assurance getAssuranceById(UUID id);
    public void deleteAssurance(UUID id);
    public AssuranceSante addAssuranceSante(AssuranceSante assuranceSante);
    public AssuranceAutomobile addAssuranceAutomobile(AssuranceAutomobile assuranceAutomobile);
    public AssuranceHabitation addAssuranceHabitation(AssuranceHabitation assuranceHabitation);


}
