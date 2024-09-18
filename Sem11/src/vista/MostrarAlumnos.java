package vista;
import java.sql.*;
import datos.Mantenimiento;

public class MostrarAlumnos {
	public static void main(String[] args) {
		Mantenimiento m=new Mantenimiento();
		ResultSet data=m.consulta("select * from alumnos");
		try {
			while(data.next()) {
				System.out.print(data.getInt(1)+" ");
                System.out.print(data.getString(2)+" ");
                System.out.print(data.getString(3)+" ");
                System.out.print(data.getString(4)+" ");
                System.out.println(data.getString(5));
				}
		}
		catch(SQLException e){
			System.out.println("Error en la consulta de la tabla");
		}
	}
}