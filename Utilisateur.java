package com.example.Films;

import java.util.ArrayList;
import java.util.List;

public class Utilisateur {

    private int id;
    private String nom;
    private String prenom;
    private String mail;
    private TypeAbonnement typeAbonnement;
    private Paiement paiement;
    private List<Film> favoris;

    public Utilisateur(int id,String nom,String prenom,String mail,TypeAbonnement typeAbonnement) {

        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.typeAbonnement = typeAbonnement;
        this.favoris = new ArrayList<>();
    }

    public TypeAbonnement getType() {
        return typeAbonnement;
    }

    public void regarderFilm(Film film)
    {
        System.out.println(nom + " regarde " + film.getTitre());
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
}