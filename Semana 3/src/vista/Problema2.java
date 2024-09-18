package vista;
import datos.Asistente;
import java.util.Scanner;
public class Problema2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Asistente as = new Asistente(0,"",0,0);
		int cod;
		String nombre;
		int dni;
		double sueldo;
		System.out.println("Ingrese el codigo: ");
		cod=s.nextInt();
		cod=as.setCodigo(cod);
		System.out.println("Ingrese el nombre");
		nombre=s.next();
		nombre=as.setNombre(nombre);
		System.out.println("Ingrese el dni: ");
		dni=s.nextInt();
		dni=as.setDni(dni);
		System.out.println("Ingrese el sueldo: ");
		sueldo=s.nextDouble();
		sueldo=as.setSueldo(sueldo);
		System.out.println("El codigo es:"+cod);
		System.out.println("El nombre es:"+nombre);
		System.out.println("El dni es:"+dni);
		System.out.println("El sueldo es:"+sueldo);
		
		System.out.println("Numero de asistentes: "+Asistente.getCantidad());
	}
	
	public void listado(Asistente p) {
		System.out.println("Codigo: "+p.getCodigo());
		System.out.println("Nonmbre: "+p.getNombre());
		System.out.println("Dni: "+p.getDni());
		System.out.println("Sueldo: "+p.getSueldo());
		System.out.println("-------------------------------");
	}
}