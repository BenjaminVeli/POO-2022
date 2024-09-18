package datos;
import java.util.Scanner;
import vista.ecuación;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        ecuación y= new ecuación();
        double v1, v2, v3;

        System.out.println("Para la cuadrática: AX+Bx+C");
        System.out.println("Escriba el valor de A: ");
        v1=x.nextDouble();
        System.out.println("Escriba el valor de B: ");
        v2=x.nextDouble();
        System.out.println("Escriba el valor de C: ");
        v3=x.nextDouble();

        y.setA(v1);
        y.setB(v2);
        y.setC(v3);

        y.imprimir();
    }
}