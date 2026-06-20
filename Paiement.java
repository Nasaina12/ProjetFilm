public class Paiement
{
    private int id;
    private double montant;
    private Date dateDePaiement;
    private String modeDePaiement;

    public Paiement(int id, double montant, Date dateDePaiement, String modeDePaiement)
    {
        this.id = id;
        this.montant = montant;
        this.dateDePaiement = dateDePaiement;
        this.modeDePaiement = modeDePaiement;
    }
}