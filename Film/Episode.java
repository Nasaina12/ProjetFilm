package com.example.Films;

public class Episode {

    private int numero;
    private String titre;
    private int duree;

    public Episode(int numero, String titre, int duree) {
        this.numero = numero;
        this.titre = titre;
        this.duree = duree;
    }

    public int getNumero() {
        return numero;
    }
    public String getTitre() {
        return titre;
    }
    public int getDuree() {
        return duree;
    }
}