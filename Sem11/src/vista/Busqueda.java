package vista;
import java.sql.*;
import java.util.Scanner;

import datos.Mantenimiento;
public class Busqueda {
	public static void main(String[] args) {
		Mantenimiento m=new Mantenimiento();
		Scanner s=new Scanner(System.in);
		System.out.println("Ingrese el dni del alumno: ");
		String dni=s.next();
		ResultSet data=m.consulta("select * from alumnos where dni = '" +dni+ "'");
		try {
			while(data.next()) {
				System.out.print(data.getInt(1)+" ");
                System.out.print(data.getString(2)+" ");
                System.out.print(data.getString(3)+" ");
                System.out.print(data.getString(4)+" ");
                System.out.println(data.getString(5));
			}
		}catch(SQLException e){
			System.out.println("Error en la consulta");
		}
	}
}