package com.gestion.finance.domain;

import java.time.LocalDate;
import java.util.Date;

public class Millitant {
    private String m_nom;
    private String m_id;
    private String m_prenom;
    private LocalDate m_subscribtionDate;

    public Millitant(String m_nom, String m_id, String m_prenom, LocalDate m_subscribtionDate) {
        this.m_nom = m_nom;
        this.m_id = m_id;
        this.m_prenom = m_prenom;
        this.m_subscribtionDate = m_subscribtionDate;
    }


     public String registerMillitant(){
        return "enregistrer avec succes";
    }
}
