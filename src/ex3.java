package Td2;

public class ex3 {
    public static void main(String[] args) {

        Livre k1 = new Livre();
        Livre k2 = new Livre("one piece");
        Livre k3 = new Livre("one piece", "oda");
        Livre k4 = new Livre("one pice", "oda", 10000);
        Livre k5 = new Livre("one pice", "oda", 10000, 1999);

        //affichage par tostring

        String K1= k1.toString();
        String K2=k2.toString();
        String K3=k3.toString();
        String K4=k4.toString();
        String K5=k5.toString();

        System.out.println("______________________________________________________________");

        System.out.println(K1);
        System.out.println(K2);
        System.out.println(K3);
        System.out.println(K4);
        System.out.println(K5);

    }
}
class Livre {

    private String titre, auteur;
    private double prix;
    private int annee ;
    public final int top;
    //constructor
    public Livre() {
        this.top=27;
    }
    public Livre( String titre) {
        this();
        this.titre=titre ;

    }
    public Livre(String titre,String auteur) {
        this();
        this.titre=titre ;
        this. auteur= auteur ;
    }
    public Livre(String titre,String auteur,double prix) {
        this();
        this.titre=titre ;
        this. auteur= auteur ;
        this. prix= prix;
    }
    public Livre(Livre l) {

        this(l.gettitre(),l.getauteur(),l.getprix(),l.getannee());
    }

    public Livre(String titre,String auteur,double prix,int annee ) {
        this();
        this.titre=titre ;
        this. auteur= auteur ;
        this. prix= prix;
        this.annee=annee;

    }

    //titre
    public void settitre(String titre) {
        this.titre=titre;
    }
    public String gettitre() {
        return titre;

    }
    //auteur
    public void setauteur(String auteur) {
        this.auteur=auteur;
    }
    public String getauteur() {
        return auteur;

    }
    //prix
    public void setprix(double prix) {
        this.prix=prix;
    }
    public double getprix() {
        return prix;

    }
    //annee
    public void setannee(int annee) {
        this.annee=annee;
    }
    public int getannee() {
        return annee;

    }

    //represontation avec toString
    public String toString() {
        return   "l'auteur: "+auteur+", titre: "+titre+ ", prix "+prix+" DH"+" ,annee: "+annee+", top="+top ;





    }




}

