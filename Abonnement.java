public class Abonnement
{
    private int id;
    private double prix;
    private TypeAbonnement typeAbonnement;

    public Abonnement(int id, double prix, TypeAbonnement typeAbonnement)
    {
        this.id = id;
        this.prix = prix;
        this.typeAbonnement = typeAbonnement;
    }

    public TypeAbonnement getType()
    {
        return type;
    }
}