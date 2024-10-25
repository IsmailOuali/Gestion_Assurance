package com.assurance.repository.interfaces;

import com.assurance.model.AssuranceAutomobile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AssuranceAutomobileRepository extends JpaRepository<AssuranceAutomobile, UUID> {
}