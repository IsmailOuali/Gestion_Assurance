package com.assurance;

import com.assurance.model.TestRepository;
import com.assurance.model.User;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class testController {
    @Autowired
    private TestRepository testRepository;

    @GetMapping("/register")
    @Transactional
    public ModelAndView home() {
        testRepository.addUser(new User());
        ModelAndView mav = new ModelAndView("register");
//        mav.addObject("message", "Welcome to Spring 6 MVC with JPA and JSP!");
        return mav;
    }
}