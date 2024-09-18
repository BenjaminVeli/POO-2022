package vista;
import java.sql.*;
import java.util.Scanner;

import datos.Conexion;
public class Busqueda_Producto {
	public static void main(String[] args) {
		Conexion c=new Conexion();
		Scanner s=new Scanner(System.in);
		System.out.println("Ingrese el código del Producto: ");
		String cod=s.next();
		ResultSet data=c.consulta("select * from inventario where cod = '" +cod+ "'");
		try {
			while(data.next()) {
				System.out.print(data.getInt(1)+" ");
                System.out.print(data.getString(2)+" ");
                System.out.print(data.getInt(3)+" ");
                System.out.print(data.getDouble(4)+" ");
                System.out.print(data.getInt(5));
			}
		}catch(SQLException e){
			System.out.println("Error en la consulta");
		}
	}
}