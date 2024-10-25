package com.assurance.controllers;

import com.assurance.model.AssuranceSante;
import com.assurance.model.AssuranceAutomobile;
import com.assurance.model.AssuranceHabitation;
import com.assurance.services.interfaces.AssuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/assurance")
public class AssuranceController {

    private final AssuranceService assuranceService;

    @Autowired
    public AssuranceController(AssuranceService assuranceService) {
        this.assuranceService = assuranceService;
    }

    @GetMapping("/form")
    public String showForm(Model model) {
        return "assuranceForm";
    }

    @PostMapping("/sante")
    public String addAssuranceSante(@ModelAttribute AssuranceSante assuranceSante) {
        assuranceService.addAssuranceSante(assuranceSante);
        return "redirect:/assurance/form"; // Redirect back to the form after submission
    }

    @PostMapping("/habitation")
    public String addAssuranceHabitation(@ModelAttribute AssuranceHabitation assuranceHabitation) {
        assuranceService.addAssuranceHabitation(assuranceHabitation);
        return "redirect:/assurance/form"; // Redirect back to the form after submission
    }

    @PostMapping("/automobile")
    public String addAssuranceAutomobile(@ModelAttribute AssuranceAutomobile assuranceAutomobile) {
        assuranceService.addAssuranceAutomobile(assuranceAutomobile);
        return "redirect:/assurance/form"; // Redirect back to the form after submission
    }
}
