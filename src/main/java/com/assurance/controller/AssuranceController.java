package com.assurance.controllers;

import com.assurance.model.AssuranceSante;
import com.assurance.model.AssuranceAutomobile;
import com.assurance.model.AssuranceHabitation;
import com.assurance.model.Devis;
import com.assurance.services.implementations.CalculateurDevis;
import com.assurance.services.interfaces.AssuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/assurance")
public class AssuranceController {

    private final AssuranceService assuranceService;

    @Autowired
    private CalculateurDevis calculateurDevis;

    @Autowired
    public AssuranceController(AssuranceService assuranceService) {
        this.assuranceService = assuranceService;
    }

    @GetMapping("/form")
    public String showForm(Model model) {
        return "assuranceForm";
    }

    @PostMapping("/sante")
    public ModelAndView addAssuranceSante(@ModelAttribute AssuranceSante assuranceSante) {
        assuranceService.addAssuranceSante(assuranceSante);
        Devis devis = calculateurDevis.calculerDevis(assuranceSante);
        ModelAndView mav = new ModelAndView("devis");
        mav.addObject("devis", devis);
        return mav;
    }

    @PostMapping("/habitation")
    public ModelAndView addAssuranceHabitation(@ModelAttribute AssuranceHabitation assuranceHabitation) {
        assuranceService.addAssuranceHabitation(assuranceHabitation);
        Devis devis = calculateurDevis.calculerDevis(assuranceHabitation);
        ModelAndView mav = new ModelAndView("devis");
        mav.addObject("devis", devis);
        return mav;
    }

    @PostMapping("/automobile")
    public ModelAndView addAssuranceAutomobile(@ModelAttribute AssuranceAutomobile assuranceAutomobile) {
        assuranceService.addAssuranceAutomobile(assuranceAutomobile);
        Devis devis = calculateurDevis.calculerDevis(assuranceAutomobile);
        ModelAndView mav = new ModelAndView("devis");
        mav.addObject("devis", devis);
        return mav;
    }
}
