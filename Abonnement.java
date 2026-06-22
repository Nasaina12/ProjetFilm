package com.example.Films;

public class Abonnement 
{

    private int id;
    private double prix;
    private TypeAbonnement typeAbonnement;
    private Paiement paiement;

    public Abonnement(int id, double prix,TypeAbonnement typeAbonnement,Paiement paiement) 
    {
        this.id = id;
        this.prix = prix;
        this.typeAbonnement = typeAbonnement;
        this.paiement = paiement;
    }

    public TypeAbonnement getType() {
        return typeAbonnement;
    }

    public void souscrireAbonnement(TypeAbonnement type)
    {
        this.typeAbonnement = type;
    }
}