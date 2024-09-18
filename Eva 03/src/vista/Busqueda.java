package vista;
import java.sql.*;
import java.util.Scanner;
import datos.Mantenimiento;

public class Busqueda {

	public static void main(String[] args) {
		Mantenimiento m = new Mantenimiento();
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese el código: ");
		int cod = s.nextInt();
		ResultSet data=m.consulta("Select * from clientes where codigo = '" + cod + "'");
		try {
			while(data.next()) {
				System.out.print(data.getInt(1) + "  ");	
				System.out.print(data.getString(2) + "  ");
				System.out.print(data.getString(3) + "  ");
				System.out.print(data.getString(4) + "  ");
				System.out.println(data.getDouble(5));
				}
		}catch(SQLException e) {
			System.out.println("Error en la consulta");
		}
	}
}