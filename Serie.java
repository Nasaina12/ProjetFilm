package com.example.Films;

import java.util.Date;

public class Serie 
{
    private int id;
    private String titre;
    private TypeFilm type;
    private Date anneeSortie;

    public Serie(int id,String titre,TypeFilm type,Date anneeSortie) 
    {
        this.id = id;
        this.titre = titre;
        this.type = type;
        this.anneeSortie = anneeSortie;
    }
}