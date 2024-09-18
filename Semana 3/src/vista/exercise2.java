package vista;
import datos.Asistente;
import datos.Personal;
import java.util.Scanner;

public class exercise2{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Personal pe = new Personal(0,"",0,0);
		int cod;
		String nom;
		int dni;
		double sueldo;
		System.out.println("Ingrese el codigo: ");
		cod=s.nextInt();
		cod=pe.setCodigo(cod);
		System.out.println("Ingrese el nombre: ");
		nom=s.next();
		nom=pe.setNombre(nom);
		System.out.println("Ingrese el dni: ");
		dni=s.nextInt();
		dni=pe.setDni(dni);
		System.out.println("Ingrese el sueldo: ");
		sueldo=s.nextDouble();
		sueldo=pe.setSueldo(sueldo);
		System.out.println("El Codigo es: "+cod);
		System.out.println("El Nombre es: "+nom);
		System.out.println("El Dni es : "+dni);
		System.out.println("El Sueldo es: "+sueldo);
		
		System.out.println("Numero de asistentes: "+Asistente.getCantidad());
		
	}
	public void listado(Personal p) {
		System.out.println("Codigo: "+p.getCodigo());
		System.out.println("Nombre: "+p.getNombre());
		System.out.println("Dni: "+p.getDni());
		System.out.println("Sueldo: "+p.getSueldo());
		System.out.println("-------------------------------------- ");
	} 
}