package vista;
import datos.Mantenimiento;
import java.sql.*;
import java.util.Scanner;
public class Registrar {
	public static void main(String[] args) {
		Mantenimiento m=new Mantenimiento();
		Scanner s=new Scanner(System.in);
		String dir, dis;
		System.out.println("Ingrese la direccion");
		dir=s.next();
		System.out.println("Ingrese el distrito");
		dis=s.next();
		boolean x = m.registro(dir, dis);
		if(x == true) {
			System.out.println("El almacen fue registrado correctamente");
		}
		else {
			System.out.println("Error al registrar ");
		}
	}
}