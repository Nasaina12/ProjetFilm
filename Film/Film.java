package com.example.Films;

import java.time.LocalDate;

public class Film
{
    private int id;
    private String titre;
    private TypeFilm type;
    private LocalDate dateSortie;
    private String qualiteVideo;
    private int duree;

    public Film(int id,String titre,TypeFilm type,LocalDate dateSortie,
    String qualiteVideo,int duree) 
    {
        this.id = id;
        this.titre = titre;
        this.type = type;
        this.dateSortie = dateSortie;
        this.qualiteVideo = qualiteVideo;
        this.duree = duree;
    }

    public TypeFilm getType() {
        return type;
    }

    public String getTitre()
    {
        return titre;
    }

    /*public void ajouterFavori(Film film)
    {
        favoris.add(film);
    }*/

    private int nombreVues = 0;

    public void incrementerVues()
    {
        nombreVues++;
    }

    public int getNombreVues()
    {
        return nombreVues;
    }

}