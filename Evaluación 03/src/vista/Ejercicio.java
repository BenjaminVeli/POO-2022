package vista;
import java.sql.*;
import datos.Alumnos;

public class Ejercicio {
	public static void main(String[] args )throws Exception {
		Alumnos m = new Alumnos();
		m.conectar();
		m.consulta();
		ResultSet data = m.consulta();
		while(data.next()==true) {
			System.out.print(data.getInt("codigo") + " ");
			System.out.print(data.getString(2) + " ");
			System.out.print(data.getString(3) + " ");
			System.out.print(data.getString(4) + " ");
			System.out.println(data.getString(5));
		}
		data.close();
	}
}