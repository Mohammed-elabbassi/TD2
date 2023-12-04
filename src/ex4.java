package Td2;
import java.util.Scanner;
public class ex4 {


        public static void main(String[] args) {
            temps k=new temps(15,21,21);
            //avant
            String K =k.toString();
            System.out.println(K);

            k.ajouterM(400);
            k.ajouterS(3000);

            //apres
            K=k.toString();
            System.out.println(K);

        }

    }
 class temps {



    public int  H,M,S;


    public temps() {

    }
    public temps( int h) {
        this.H=h;;

    }
    public temps(int h,int m) {
        this.H=h;
        this.M=m;
    }
    public temps(int h,int m,int s) {
        this.H=h;
        this.M=m;
        this.S=s;

    }
    public temps(temps  tmp){
        this(tmp.getheure(),tmp.getmunite(),tmp.getseconde());
    }

    //heure
    public void setheure(int heure) {
        this.H=heure;
    }
    public int getheure() {
        return H;

    }
    //munite
    public void setminute(int munite ) {
        this.M=munite;
    }
    public int getmunite() {
        return M;

    }
    //sconde
    public void setseconde(int seconde) {
        this.S=seconde;
    }
    public int getseconde() {
        return S;

    }

    public String toString() {

        return H+"h"+M+"m"+S+"s";

    }

    public void ajouterH(int h){
        this.setheure(H+h);
    }
    public void ajouterM(int m){
        m=m+M;//m=m+getM();
        ajouterH(m/60);
        this.setminute(m%60);
        //M=m%60;
    }
    public void ajouterS(int s){
        s=s+S;//s=s+getS()
        ajouterM(s/60);
        this.setseconde(s%60);
        //S=s%60;
    }

}

