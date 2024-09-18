package vista;
import java.util.Scanner;
import datos.ejercicio;
public class hipotenusa {
    Scanner sc = new Scanner(System.in);
    double cat1,cat2 , hipotenusa;
    public void leerCATETO1() {
         System.out.println("Ingrese el cateto 1: ");
         cat1 = sc.nextDouble();

     }
     public void leerCATETO2() {
         System.out.println("Ingrese el cateto 2: ");
         cat2 = sc.nextDouble();

     }
     public void hipotenusaT() {
         hipotenusa=Math.sqrt((Math.pow(this.cat1,2)) + Math.pow(this.cat2,2));
         System.out.println("la hipotenusa de los catetos es :" + this.hipotenusa);
     }
}