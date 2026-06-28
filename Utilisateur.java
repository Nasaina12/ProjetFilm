package com.example.Films;

public class Utilisateur {

    protected int id;
    protected String nom;
    protected String prenom;
    protected String mail;

    public Utilisateur(int id, String nom, String prenom, String mail)
    {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
    }

    public String getNom()
    {
        return nom;
    }

    public String getPrenom()
    {
        return prenom;
    }

    public String getMail()
    {
        return mail;
    }
}