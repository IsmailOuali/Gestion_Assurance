package com.assurance.services.implementations;

import com.assurance.model.Client;
import com.assurance.repository.interfaces.ClientRepository;
import com.assurance.services.interfaces.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;

    @Autowired
    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }




    @Override
    public Client createClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client getClientById(UUID id) {
        Optional<Client> client = clientRepository.findById(id);
        return client.orElse(null);
    }

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public void deleteClient(UUID id) {
        clientRepository.deleteById(id);
    }

    @Override
    public Client updateClient(UUID id, Client clientDetails) {
        Client client = getClientById(id);

        if (client != null) {
            client.setName(clientDetails.getName());
            client.setEmail(clientDetails.getEmail());
            client.setPassword(clientDetails.getPassword());
            client.setTelephone(clientDetails.getTelephone());
            return clientRepository.save(client);
        }
        return null;
    }

    @Override
    public Client findByName(String name) {
        return null;
    }

    @Override
    public boolean authenticateUser(String username, String password) {
        Client client = clientRepository.findByName(username); // Assuming findByName returns a Client object

        // Check if client exists and if the password matches
        return client != null && client.getPassword().equals(password);
    }

}