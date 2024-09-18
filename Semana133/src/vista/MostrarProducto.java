package vista;
import datos.Mantenimiento;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MostrarProducto {
	public static void main(String[] args) {
		Mantenimiento m = new Mantenimiento();
		ResultSet data = m.mostrarproducto();
		try {
			while(data.next()) {
				System.out.println(data.getString("nombre") + " " +
			data.getInt("stock") + " " + data.getDouble("precio") + " "
			+ data.getInt("cod_almacen") + "\n");
			}
		}
		catch(SQLException e) {
			System.out.println("Error en la consulta");
		}
	}
}