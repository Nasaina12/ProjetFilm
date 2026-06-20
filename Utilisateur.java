public class Utilisateur
{
    private int id;
    private String nom;
    private String prenom;
    private String mail;
    private TypeAbonnement typeAbonnement;

    public Utilisateur(int id, String nom, String prenom, String mail, TypeAbonnement typeAbonnement)
    {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.typeAbonnement = typeAbonnement;
    }

    public TypeAbonnement getType()
    {
        return type;
    }
}