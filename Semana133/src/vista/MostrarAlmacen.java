package vista;
import datos.Mantenimiento;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MostrarAlmacen {
	public static void main(String[] args) {
		Mantenimiento m = new Mantenimiento();
		ResultSet data = m.mostraralmacen();
		try {
			while(data.next()) {
				System.out.println(data.getString("direccion") + " " + 
			data.getString("distrito") + "\n");
			}
		}
		catch(SQLException e) {
			System.out.println("Error en la consulta");
		}
	}
}	