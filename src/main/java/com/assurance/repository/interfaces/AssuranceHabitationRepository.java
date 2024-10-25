package com.assurance.repository.interfaces;

import com.assurance.model.AssuranceHabitation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AssuranceHabitationRepository extends JpaRepository<AssuranceHabitation, UUID> {
}
