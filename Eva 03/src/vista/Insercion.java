package vista;
import java.sql.*;
import java.util.Scanner;
import datos.Mantenimiento;

public class Insercion {

	public static void main(String[] args) {
		Mantenimiento m = new Mantenimiento();
		Scanner s =  new Scanner(System.in);
		int cod;
		String ape, nom, ruc;
		double ldc;
		
		System.out.println("Ingrese el código porfavor: ");
		cod=s.nextInt();
		System.out.println("Ingrese el apellido porfavor: ");
		ape = s.next();
		System.out.println("Ingrese el nombre porfavor: ");
		nom = s.next();
		System.out.println("Ingrese el RUC porfavor: ");
		ruc = s.next();
		System.out.println("Ingrese la línea de crédito porfavor: ");
		ldc = s.nextDouble();
		
		boolean x=m.registro(cod, ape, nom, ruc, ldc);
		if(x==true) {
			System.out.println("Alumno registrado correctamente");
		} else {
			System.out.println("Error en el registro");
		}
	}
}
