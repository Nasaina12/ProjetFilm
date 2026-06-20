public class Commentaire {
    private int id;
    private String contenu;
    private int filmId;
    private LocalDate dateCommentaire;

    public Commentaire(int id, String contenu, int filmId, LocalDate dateCommentaire)
    {
        this.id = id;
        this.contenu = contenu;
        this.filmId = filmId;
        this.dateCommentaire = dateCommentaire;
    }
}