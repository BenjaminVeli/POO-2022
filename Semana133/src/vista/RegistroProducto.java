package vista;
import datos.Mantenimiento;
import java.sql.*;
import java.util.Scanner;
public class RegistroProducto {

	public static void main(String[] args) {
		Mantenimiento m=new Mantenimiento();
		Scanner s=new Scanner(System.in);
		String nom;
		int stc, cd;
		double prc;
		System.out.println("Ingrese el nombre del producto");
		nom=s.next();
		System.out.println("Ingrese el stock del producto");
		stc=s.nextInt();
		System.out.println("Ingrese el precio del producto");
		prc=s.nextDouble();
		System.out.println("Ingrese el codigo de almacen del producto");
		cd=s.nextInt();
		boolean x = m.registroproducto(nom, stc, prc, cd);
		if(x == true) {
			System.out.println("Fue registrado correctamente");
		}
		else {
			System.out.println("Error al registrar ");
		}
	}
}