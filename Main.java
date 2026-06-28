package com.example.Films;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Paiement paiement = new Paiement(
                1,
                25000,
                new Date(),
                "Carte bancaire"
        );

        Abonnement abonnement = new Abonnement(
                1,
                25000,
                TypeAbonnement.PREMIUM,
                paiement
        );

        Utilisateur utilisateur = new Utilisateur(
                1,
                "Rakoto",
                "Jean",
                "jean@gmail.com",
                abonnement
        );

        Film avatar = new Film(
                1,
                "Avatar",
                TypeFilm.SCIENCE_FICTION,
                LocalDate.of(2009,12,18),
                "4K",
                162
        );

        Film titanic = new Film(
                2,
                "Titanic",
                TypeFilm.ROMANCE,
                LocalDate.of(1997,12,19),
                "HD",
                194
        );

        List<Film> films = new ArrayList<>();
        films.add(avatar);
        films.add(titanic);

        utilisateur.regarderFilm(avatar);
        utilisateur.regarderFilm(avatar);
        utilisateur.regarderFilm(titanic);

        Film trouve = utilisateur.chercherFilm("Avatar", films);

        if (trouve != null) {
            System.out.println("Film trouvé : " + trouve.getTitre());
        }

        Administrateur admin = new Administrateur(
                1,
                "Admin",
                "admin@gmail.com"
        );

        Film populaire = admin.filmLePlusPopulaire(films);

        System.out.println("Film le plus populaire : " + populaire.getTitre());

        List<Abonnement> abonnements = new ArrayList<>();
        abonnements.add(abonnement);

        double revenu = admin.revenuTotal(abonnements);

        System.out.println("Revenu total : " + revenu + " Ariary");
    }
}