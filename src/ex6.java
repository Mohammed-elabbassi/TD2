package Td2;
public class ex6 {

    public static void main(String[] args) {
        banque b=new banque(1,5000.75,"AB 1200");

        String s=b.toString();
        System.out.println(s);

        double solde=b.gets();
        System.out.println("solde="+solde);
        System.out.println("_________________________________________________");
        b.diposer(500);
        s=b.toString();
        System.out.println(s);
        solde=b.gets();
        System.out.println("solde="+solde);
        System.out.println("_________________________________________________");
        b.retirer(200);
        s=b.toString();
        System.out.println(s);
        solde=b.gets();
        System.out.println("solde="+solde);


    }

}
class banque {

    int Ncompte;
    double solde;
    String CIN;

    public banque(int Ncpt,double sld,String C) {
        this.Ncompte=Ncpt;
        this.solde=sld;
        this.CIN=C;
    }
    public void diposer(float somme) {
        solde=solde+somme;

    }
    public double gets() {
        return solde;

    }

    public boolean retirer(float somme) {
        if((solde-somme)>=0){
            solde=solde-somme;
            return true;}
        else {
            return false;
        }
    }
    @Override
    public String toString() {
        return "banque{"+" Ncompte= "+Ncompte+"  solde= "+solde+"  CIN= "+CIN+'}';

    }




}
