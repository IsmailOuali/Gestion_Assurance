package com.assurance.services.implementations;

import com.assurance.model.Client;
import com.assurance.repository.interfaces.ClientRepository;
import com.assurance.services.interfaces.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
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
        return client.orElse(null);  // Handle the case where the client might not exist
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
}