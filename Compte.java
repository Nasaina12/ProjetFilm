
package com.example.Films;

import java.util.Date;

public class Compte 
{

    private int id;
    private String mail;
    private Abonnement abonnement;
    private Date dateCreation;

    public Compte(int id,String mail,Abonnement abonnement,Date dateCreation) 
    {

        this.id = id;
        this.mail = mail;
        this.abonnement = abonnement;
        this.dateCreation = dateCreation;
    }
}