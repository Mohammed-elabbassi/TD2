
package Td2;
import java.util.Scanner;
public class exo2 {
    public static void main(String[] args) {
        pointexo2 k=new pointexo2();
        k.setx(5);
        k.sety(3);
        k.setnom('A');
//		System.out.println(k);
        double i=k.getx();
        double ii=k.gety();
        char iii=k.getnom();
//
        System.out.println("affichage de chaque prametre :");
        System.out.println("x= "+i);
        System.out.println("y= "+ii);
        System.out.println("nom= "+iii);


        double d=k.Norme();

        System.out.println(" la distance = "+d);

        System.out.println("voila!");

        String a=k.toString();
        System.out.println(a);

    }


}


class pointexo2 {




    private  double  x,y;
    private char nom ;


    public pointexo2() {

    }
    public pointexo2(int a, int b,char nom) {
        this.x=a;
        this.y=b;
        this.nom=nom;

    }
    public void setx(double a) {
        this.x=a;

    }


    public double  getx() {

        return x;

    }
    public void sety(double b) {
        this.y=b;

    }


    public double gety() {

        return y;


    }
    public void setnom(char nom) {
        this.nom=nom;

    }


    public char getnom() {

        return nom;


    }

    public double Norme() {

        return Math.sqrt(x*x+Math.pow(this.gety(),2));
    }
    @Override
    public String toString() {

        return "pointexo2{ "+" x= "+x+" y= "+y+" nom= "+nom+" norme= "+this.Norme()+"'}'";
    }





}

