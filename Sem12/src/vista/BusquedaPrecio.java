package vista;
import java.sql.*;
import java.util.Scanner;

import datos.Mantenimiento;
public class BusquedaPrecio {
	public static void main(String[] args) {
		Mantenimiento m=new Mantenimiento();
		Scanner s=new Scanner(System.in);
		System.out.println("Ingrese el precio del producto: ");
		String pre=s.next();
		ResultSet data=m.consulta("select * from productos where precio = '" +pre+ "'");
		try {
			while(data.next()) {
				System.out.print(data.getInt(1)+" ");
                System.out.print(data.getString(2)+" ");
                System.out.print(data.getInt(3)+" ");
                System.out.print(data.getDouble(4));
			}
		}catch(SQLException e){
			System.out.println("Error en la consulta");
		}
	}
}