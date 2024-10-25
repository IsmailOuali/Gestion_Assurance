package com.assurance.repository.interfaces;

import com.assurance.model.Assurance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AssuranceRepository extends JpaRepository<Assurance, UUID> {
}
