package ds2021;

import td4.Magazine;

public class jcc {
    private Film[] competition;
    private int annee;
    private final int NBFMAX=30;
    private int nbF=0;

    public jcc( int annee,int taille) {
        if(taille>NBFMAX){
            System.out.println("le taille est non valide");
            return;
        }
        this.competition = new Film[taille];
        this.annee = annee;
    }
    public void ajoutFilm (Film f){
        if (nbF < NBFMAX) {
            competition[nbF] = f;
            nbF++;
        } else {
            System.out.println("La compétition est au complet");
        }
    }
    public void listeFilmsJCC (){
        for(int i=0;i<nbF;i++){
                System.out.println(competition[i].toString());
        }
    }
    public float totalVenteBilletsJCC (){
        float montantTotale=0;
        for(int i=0;i<nbF;i++){
            montantTotale+=competition[i].totalVenteBillets();
        }
        return montantTotale;
    }

}
