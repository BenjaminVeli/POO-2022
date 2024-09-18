package vista;
import java.util.Scanner;
import datos.Hypotenusa;

public class Ejercicio{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Hypotenusa h=new Hypotenusa();
			
		System.out.println("Ingrese el cateto1");
		h.cateto1=s.nextDouble();
		
		System.out.println("Ingrese el cateto2");
		h.cateto2=s.nextDouble();
		
		h.imprimir();
		
	}
}

