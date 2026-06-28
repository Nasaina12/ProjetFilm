package com.example.Films;

import java.util.List;

public class Administrateur extends Utilisateur {

    public Administrateur(int id,String nom,String prenom,String mail)
    {
        super(id, nom, prenom, mail);
    }

    public Film filmLePlusPopulaire(List<Film> films)
    {
        if (films.isEmpty())
        {
            return null;
        }

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

    public double revenuTotal(List<Abonnement> abonnements)
    {
        double total = 0;

        for (Abonnement abonnement : abonnements)
        {
            total += abonnement.getPrix();
        }

        return total;
    }
}