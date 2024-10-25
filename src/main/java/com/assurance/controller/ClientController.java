package com.assurance.controller;

import com.assurance.services.interfaces.ClientService;
import com.assurance.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClientController {

    @Autowired
    private ClientService clientService; // Autowire your client service

    @PostMapping("/registerClient")
    public ModelAndView registerClient(@RequestParam("name") String name,
                                       @RequestParam("email") String email,
                                       @RequestParam("password") String password,
                                       @RequestParam("phone") String phone) {
        // Create a new client object
        Client client = new Client();
        client.setName(name);
        client.setEmail(email);
        client.setPassword(password);
        client.setTelephone(phone);


        // Call the service to save the client
        clientService.createClient(client); // Implement this method in your service

        // Return a success view or redirect
        return new ModelAndView("registrationSuccess"); // Create a JSP page for success
    }
}
