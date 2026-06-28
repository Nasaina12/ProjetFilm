package com.example.Films;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ProjetFilmTest {

    private Client client;
    private Film avatar;
    private Film titanic;
    private List<Film> listeFilms;
    private Administrateur admin;

    @BeforeEach
    void setUp() {
        Paiement paiement = new Paiement(1, 25000, new Date(), "Carte bancaire");

        Abonnement abonnement = new Abonnement(1, 25000, TypeAbonnement.PREMIUM, paiement);

        client = new Client(1, "Rakoto", "Jean", "jean@gmail.com", abonnement);

        avatar = new Film(1, "Avatar", TypeFilm.SCIENCE_FICTION, LocalDate.of(2009, 12, 18), "4K", 162);
        titanic = new Film(2, "Titanic", TypeFilm.ROMANCE, LocalDate.of(1997, 12, 19), "HD", 194);

        listeFilms = new ArrayList<>();
        listeFilms.add(avatar);
        listeFilms.add(titanic);

        admin = new Administrateur(1, "Admin", "Principal", "admin@gmail.com");
    }

    @Test
    void testChercherFilm_Trouve() {
        Film trouve = client.chercherFilm("avatar", listeFilms);
        assertNotNull(trouve, "Le film devrait être trouvé");
        assertEquals("Avatar", trouve.getTitre());
    }

    @Test
    void testChercherFilm_NonTrouve() {
        Film trouve = client.chercherFilm("Inception", listeFilms);
        assertNull(trouve, "Le film ne devrait pas être trouvé");
    }

    @Test
    void testRegarderFilm_IncrementeLesVues() {
        assertEquals(0, avatar.getNombreVues());

        client.regarderFilm(avatar);
        client.regarderFilm(avatar);

        assertEquals(2, avatar.getNombreVues(), "Le nombre de vues devrait être de 2");
    }

    @Test
    void testFilmLePlusPopulaire() {
        // On simule les vues
        client.regarderFilm(avatar);
        client.regarderFilm(avatar); // Avatar a 2 vues
        client.regarderFilm(titanic); // Titanic a 1 vue

        Film populaire = admin.filmLePlusPopulaire(listeFilms);

        assertNotNull(populaire);
        assertEquals("Avatar", populaire.getTitre(), "Avatar devrait être le plus populaire");
    }

    @Test
    void testRevenuTotal() {
        List<Abonnement> abonnements = new ArrayList<>();
        abonnements.add(client.getAbonnement());

        Abonnement secondAbonnement = new Abonnement(2, 15000, TypeAbonnement.BASIQUE, null);
        abonnements.add(secondAbonnement);

        double revenuTotal = admin.revenuTotal(abonnements);
        assertEquals(40000.0, revenuTotal, "Le revenu total devrait être de 40000.0");
    }
}