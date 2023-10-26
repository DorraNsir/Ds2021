package ds2021;

public class Main {
    public static void main(String[] args) {
        jcc JCC=new jcc(2021,12);
        Film f1=new Documentaire("le dernier refuge","ousman","Mali",68,"La guerre civile");
        f1.setNb_places(30);
        Film f2=new Film("Insurrection","Jilani Saadi","Tunisie",105);
        f2.setNb_places(45);
        JCC.ajoutFilm(f1);
        JCC.ajoutFilm(f2);
        JCC.listeFilmsJCC();
        float res=JCC.totalVenteBilletsJCC();
        System.out.println("le montant des ventes de billets pour les JCC : "+res+" dt");
    }
}
