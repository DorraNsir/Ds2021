package ds2021;

import com.sun.source.tree.BreakTree;

import java.util.Scanner;

public class Film {
    protected String titre;
    protected String realisateur;
    protected String pays_dorigine;
    protected int duree;
    protected int nb_places;
    public Film(String titre, String realisateur, String pays_dorigine, int duree) {
        this.titre = titre;
        this.realisateur = realisateur;
        this.pays_dorigine = pays_dorigine;
        this.duree = duree;
    }

    public int getNb_places() {
        return nb_places;
    }

    public void setNb_places(int nb_places) {
        this.nb_places = nb_places;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+" : "+
                titre + " de " +realisateur +
                " (" + pays_dorigine + ") " +
                " _ " + duree +"min";
    }


    public float totalVenteBillets (){
        float montantTotale=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("donner le nombre de places  des Etudiants");
        int nb_Etud=scan.nextInt();
        while (nb_Etud>nb_places){
            System.out.println(" le nombre de places  des Etudiants est tres eleves !!");
             nb_Etud=scan.nextInt();
        }
        montantTotale=nb_Etud*2+(nb_places-nb_Etud)*3;
        return montantTotale;
    }


}
