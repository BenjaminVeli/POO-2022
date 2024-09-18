package vista;
import java.util.Scanner;
import datos.Triangulo;

public class Ejercicio2{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
			Triangulo t=new Triangulo();
			
			System.out.println("Ingrese la base");
			t.base=s.nextDouble();
			
			System.out.println("Ingrese la altura");
			t.altura=s.nextDouble();
			t.imprimir();
	}
}