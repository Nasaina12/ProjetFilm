package com.example.Films;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Serie extends Film {
    private List<Saison> saisons;

    public Serie(int id, String titre, TypeFilm type, LocalDate dateSortie, String qualiteVideo, int dureeInitiale) {
        super(id, titre, type, dateSortie, qualiteVideo, dureeInitiale);
        this.saisons = new ArrayList<>();
    }

    public List<Saison> getSaisons() {
        return saisons;
    }

    public void ajouterSaison(Saison saison) {
        this.saisons.add(saison);
    }

    public int getNombreSaisons() {
        return saisons.size();
    }
}