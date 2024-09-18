package datos;
import java.util.Scanner;
import vista.hipotenusa;
public class ejercicio {
    

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	hipotenusa hipo = new hipotenusa();

        hipo.leerCATETO1();
        hipo.leerCATETO2();
        hipo.hipotenusaT();
    }

}