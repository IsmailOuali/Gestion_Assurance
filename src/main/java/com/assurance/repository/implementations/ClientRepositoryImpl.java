package com.assurance.repository.implementations;

import com.assurance.model.Client;
import com.assurance.repository.interfaces.ClientRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

@Repository
abstract class ClientRepositoryImpl implements ClientRepository{
    @PersistenceContext
    private EntityManager entityManager;


    public Client findByEmail(String email) {
        TypedQuery<Client> query = entityManager.createQuery(
                "SELECT c FROM Client c WHERE c.email = :email", Client.class);
        query.setParameter("email", email);
        return query.getSingleResult();
    }

}
