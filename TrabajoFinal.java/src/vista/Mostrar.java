package vista;
import datos.Mantenimiento;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Mostrar {
	public static void main(String[] args) {
		Mantenimiento m = new Mantenimiento();
		ResultSet data = m.mostrar();
		try {
			while(data.next()) {
				System.out.println(data.getString("apellidos") + " " + 
			data.getString("nombres") + " " + data.getString("direccion") + " " + 
			data.getString("distrito") + "\n");
			}
		}
		
		catch(SQLException e) {
			System.out.println("Error en la consulta");
		}
	}
}	