package com.gestion.finance.web.controller;

import com.gestion.finance.service.GestionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GestionController {
    private GestionService gestionService;
    @RequestMapping(value="/gestions", method= RequestMethod.GET)
    public String listeProduits() {
        return "Un exemple d'enregistrement";
    }
}
