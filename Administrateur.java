package com.example.Films;

import java.util.List;

public class Administrateur {

    private int id;
    private String nom;
    private String email;

    public Administrateur(int id, String nom, String email) {
        this.id = id;
        this.nom = nom;
        this.email = email;
    }

    public Film filmLePlusPopulaire(List<Film> films)
    {
        Film populaire = films.get(0);

        for (Film film : films)
        {
            if (film.getNombreVues() > populaire.getNombreVues())
            {
                populaire = film;
            }
        }

        return populaire;
    }

    import java.util.List;

    public int nombreAbonnes(List<Utilisateur> utilisateurs,
                            TypeAbonnement type)
    {
        int compteur = 0;

        for (Utilisateur u : utilisateurs)
        {
            if (u.getType() == type)
            {
                compteur++;
            }
        }

        return compteur;
    }

    public double revenuTotal(List<Abonnement> abonnements)
    {
        double somme = 0;

        for (Abonnement a : abonnements)
        {
            somme += a.getPrix();
        }

        return somme;
    }

    public void afficherAbonnements(List<Utilisateur> utilisateurs)
    {
        for (Utilisateur u : utilisateurs)
        {
            System.out.println(u.getType());
        }
    }
}

