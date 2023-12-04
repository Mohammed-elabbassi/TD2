package Td2;
import java.util.Scanner;
public class ex5 {

    public static void main(String[] args) {
        rectangel k=new rectangel(2,4);
        //on imprime directement k
        System.out.println(k);

        System.out.println("____________________________________________________________");
        //2eme method si on utilise scanner
        Scanner scanner=new Scanner(System.in);
        System.out.println("entrer langeure: ");

        k.Ln=scanner.nextInt();

        System.out.println("entrer largeur: ");

        k.Lr=scanner.nextInt();
        k.toString();



    }
}

class rectangel {

    public int  Ln,Lr;


    public rectangel() {

    }
    public rectangel( int ln) {
        this.Ln=ln;
    }
    public rectangel(int ln,int lr) {
        this.Ln=ln;
        this.Lr=lr;
    }
    public rectangel(rectangel rctgl) {
        this.Lr=rctgl.Lr;
        this.Ln=rctgl.Ln;
    }
    public int perimetre(){
        return 2*(Lr+Ln);
    }
    public int aire(){
        return Lr*Ln;
    }
    //iscarre 1er methode
//	    public void iscarre(){
//	    	if(Lr==Ln)
//	    		 System.out.println("carre!");
//	    	else
//	    		 System.out.println(" non carre!");
//
//	    }
    //iscarre 2eme  methode
    public boolean iscarre(){
        return  Lr==Ln;
    }
    // //toSring 1er methode

    public String toString() {

        System.out.println("langeur est "+Ln);
        System.out.println("largeur est "+Lr);
        System.out.println("perimetre  est "+perimetre());
        System.out.println("aire  est "+aire());
        System.out.println(iscarre()?"carree":"non carree");

        return null;

    }



}



