package vista;
import datos.Mantenimiento;
import java.sql.*;

public class Listado {

	public static void main(String[] args) {
		Mantenimiento m = new Mantenimiento();
		ResultSet data = m.consulta("select * from clientes"); 
		try {
			while(data.next()) {
				System.out.print(data.getInt(1)+ "  ");
				System.out.print(data.getString(2)+ "  ");
				System.out.print(data.getString(3)+ "  ");
				System.out.print(data.getString(4)+ "  ");
				System.out.println(data.getDouble(5));
			}
		}catch(SQLException e){
			System.out.println("Error en la consulta de la tabla");
		}
	}
}