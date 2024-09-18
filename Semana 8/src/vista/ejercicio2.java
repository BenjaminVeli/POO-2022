package vista;
import datos.Encuesta;
import java.util.Scanner;

public class ejercicio2 {
	public static void main(String[] args) throws Exception {
		Encuesta e = new Encuesta();
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese el usuario: ");
		String a = s.nextLine();
		
		Scanner z = new Scanner(System.in);
		System.out.println("Ingrese el sexo: ");
		String b = s.nextLine();
		
		Scanner w = new Scanner(System.in);
		System.out.println("Ingrese el email: ");
		String c = s.nextLine();
		
		Scanner y = new Scanner(System.in);
		System.out.println("Ingrese el buscador: ");
		String d = s.nextLine();
		
		e.setUsuario(a);
		e.setSexo(b);
		e.setEmail(c);
		e.setBuscador(d);
		e.almacenar();
		e.imp();
		System.out.println("--------------------------------");
	}
}