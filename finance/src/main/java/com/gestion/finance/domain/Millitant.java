package com.gestion.finance.domain;

import java.time.LocalDate;
import java.util.Date;

public class Millitant {
    private String m_nom;
    private String m_id;
    private String m_prenom;
    private LocalDate m_subscribtionDate;
    private String m_password;
    private String m_email;
    private String m_address;
    private int m_phone;


    public Millitant(String m_nom, String m_id, String m_prenom, LocalDate m_subscribtionDate, String m_password, String m_email,
                     String m_address, int m_phone) {
        this.m_nom = m_nom;
        this.m_id = m_id;
        this.m_prenom = m_prenom;
        this.m_subscribtionDate = m_subscribtionDate;
        this.m_password = m_password;
        this.m_email = m_email;
        this.m_address = m_address;
        this.m_phone = m_phone;
    }


     public String registerMillitant(){
        return "enregistrer avec succes";
    }

}
