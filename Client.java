package com.example.Films;

import java.util.ArrayList;
import java.util.List;

public class Client extends Utilisateur 
{

    private Abonnement abonnement;
    private Paiement paiement;
    private List<Film> favoris;

    public Client(int id,String nom,String prenom,String mail,Abonnement abonnement)
    {
        super(id, nom, prenom, mail);

        this.abonnement = abonnement;
        this.favoris = new ArrayList<>();
    }

    public void regarderFilm(Film film)
    {
        System.out.println(nom + " regarde " + film.getTitre());
        film.incrementerVues();
    }

    public void effectuerPaiement(Paiement paiement)
    {
        this.paiement = paiement;
    }

    public void ajouterFavori(Film film)
    {
        favoris.add(film);
    }

    public Film chercherFilm(String titre, List<Film> films)
    {
        for (Film film : films)
        {
            if (film.getTitre().equalsIgnoreCase(titre))
            {
                return film;
            }
        }

        return null;
    }

    public Abonnement getAbonnement()
    {
        return abonnement;
    }
}