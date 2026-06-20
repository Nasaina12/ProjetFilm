package com.example.Films;

public class Compte {
        private int id;
    private String mail;
    private TypeAbonnement typeAbonnement;
    private Date dateCreation;

    public Utilisateur(int id, String mail, TypeAbonnement typeAbonnement, Date dateCreation)
    {
        this.id = id;
        this.mail = mail;
        this.typeAbonnement = typeAbonnement;
        this.dateCreation = dateCreation;
    }

    public TypeAbonnement getType()
    {
        return type;
    }
}
