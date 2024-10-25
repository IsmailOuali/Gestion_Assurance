package com.assurance.repository.interfaces;

import com.assurance.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface ClientRepository extends JpaRepository<Client, UUID> {

    Client findByEmail(String email);
    Client findByName(String name);
}

