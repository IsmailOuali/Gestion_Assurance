


package com.assurance;

import com.assurance.model.Client;
import com.assurance.services.implementations.ContratServiceImpl;

import com.assurance.services.interfaces.ClientService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

    public static void main(String[] args) {
        // Load the application context from the XML configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/webapp/WEB-INF/application-datasource.xml");

        // Retrieve the ClientService bean from the context
        ClientService clientService = context.getBean(ClientService.class);

        // Create a new Client instance
        Client newClient = new Client("John Doe", "123 Main St", "00292920", "0003200");

        // Use the service to save the client to the database
        clientService.createClient(newClient);

        System.out.println("Client added: " + newClient.getName() + ", Email : " + newClient.getEmail());

        // Close the application context
        ((ClassPathXmlApplicationContext) context).close();
    }


}
