package com.assurance.controller;

import com.assurance.services.interfaces.ClientService;
import com.assurance.model.Client;
import jakarta.enterprise.inject.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
        Client client = new Client();
        client.setName(name);
        client.setEmail(email);
        client.setPassword(password);
        client.setTelephone(phone);


        clientService.createClient(client);

        return new ModelAndView("registrationSuccess");
    }

    @PostMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Model model) {
        // Logic to authenticate the user
        if (clientService.authenticateUser(username, password)) {
            // Redirect to the dashboard or success page
            return "redirect:/registrationSuccess";
        } else {
            return "login"; // Return to the login page with an error
        }
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login"; // Return the login JSP
    }

}
