package Td2;


import java.util.Scanner;
public class exo1 {

    public static void main(String[] args) {
        point k=new point(3,"pointA");

        System.out.println("saisire une point:");


        k.affichage();

        k.translation();

    }

}

class point {



    public int abs;
    public String nom;
    public Scanner scanner;

    public point(){
    }
    public point(int x, String y) {
        this.abs=x;
        this.nom=y;

    }
    public void  affichage() {

        System.out.println("le nom de votre point est :"+nom);
        System.out.println("l'abscice  de votre point est :"+abs);


    }

    public void translation() {

        this.scanner=new Scanner(System.in);
        System.out.println("entre votre langage: ");
        String ch=scanner.next();
        String f=null, a=null;
        if(ch==f)
            System.out.println("le nom de votre point est :"+nom);
        else
            System.out.println("name :"+nom);

    }

}


