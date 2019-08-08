package com.gestion.finance.web.controller;

import com.gestion.finance.domain.Millitant;
import com.gestion.finance.service.GestionService;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@RestController
public class GestionController {
    private GestionService gestionService;
    @RequestMapping(value="/gestions", method= RequestMethod.POST)
    public ModelAndView ajouterUtilisateur(HttpServletRequest request, HttpServletResponse response,
                                           @ModelAttribute("utilisateur") Millitant utilisateur) {
        gestionService.register(utilisateur);
        return new ModelAndView("Enregistrement", "m_nom", utilisateur.registerMillitant());
    }
    public String listeProduits() { return "Un exemple d'enregistrement"; }
}


