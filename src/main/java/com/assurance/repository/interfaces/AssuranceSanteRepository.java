package com.assurance.repository.interfaces;

import com.assurance.model.AssuranceSante;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AssuranceSanteRepository extends JpaRepository<AssuranceSante, UUID> {
}
