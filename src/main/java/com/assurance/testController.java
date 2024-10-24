package com.assurance;

import com.assurance.model.Client;
import com.assurance.services.interfaces.ClientService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class testController {
    @Autowired
    private ClientService clientService;


    @GetMapping("/register")
    @Transactional
    public ModelAndView home() {
//        testRepository.addUser(new User());
        clientService.createClient(new Client("Ismail Ouali", "ismail@ismail.com", "password", "087827821"));

        ModelAndView mav = new ModelAndView("register");
//        mav.addObject("message", "Welcome to Spring 6 MVC with JPA and JSP!");
        return mav;
    }
}