package com.assurance.services.interfaces;

import com.assurance.model.Client;

import java.util.List;
import java.util.UUID;

public interface ClientService {
    Client createClient(Client client);
    Client getClientById(UUID id);
    List<Client> getAllClients();
    void deleteClient(UUID id);
    Client updateClient(UUID id, Client client);
}
