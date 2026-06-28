package com.example.Films;

import java.util.ArrayList;
import java.util.List;

public class Saison {
    private int numero;
    private List<Episode> episodes;

    public Saison(int numero) {
        this.numero = numero;
        this.episodes = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public List<Episode> getEpisodes() {
        return episodes;
    }

    public void ajouterEpisode(Episode episode) {
        this.episodes.add(episode);
    }
}