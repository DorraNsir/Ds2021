package ds2021;

public class Documentaire extends Film {
    private String sujet;
    private final float tarif=2;

    public Documentaire(String titre, String realisateur, String pays_dorigine, int duree, String sujet) {
        super(titre, realisateur, pays_dorigine, duree);
        this.sujet = sujet;
    }

    @Override
    public String toString() {

         return super.toString()+" Sujet : "+sujet;

    }

    @Override
    public float totalVenteBillets() {
        return (float) (nb_places*2);

    }

}
