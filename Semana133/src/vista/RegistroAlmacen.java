package vista;
import datos.Mantenimiento;
import java.sql.*;
import java.util.Scanner;
public class RegistroAlmacen {

	public static void main(String[] args) {
		Mantenimiento m=new Mantenimiento();
		Scanner s=new Scanner(System.in);
		String dir;
		String dis;
		System.out.println("Ingrese la direccion");
		dir=s.next();
		System.out.println("Ingrese el distrito");
		dis=s.next();
		boolean x = m.registroalmacen(dir, dis);
		if(x == true) {
			System.out.println("Fue registrado correctamente");
		}
		else {
			System.out.println("Error al registrar ");
		}
	}
}