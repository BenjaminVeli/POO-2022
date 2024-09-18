package datos;

import java.sql.*;

public class Conexion {
	public String driver="com.mysql.cj.jdbc.Driver";
	public String cadena="jdbc:mysql://localhost/inventario";
	public String usuario="root";
	public String clave="";
	public Connection conn;
	public PreparedStatement pr; 
	public Statement st;
	public ResultSet res;
	public Connection conexion() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(cadena, usuario, clave);
		}
		catch(ClassNotFoundException e1) {
			System.out.println("Error en el driver de mysql");
		}
		catch(SQLException e2) {
			System.out.println("Error en la conexión");
		}
		return conn;
	}
	public boolean registroalmacen( String direccion, String distrito) {
		try {
			String reg = "insert into almacen values(?,?)";
			pr = conexion().prepareStatement(reg);
			pr.setString(2, direccion);
			pr.setString(3, distrito);
		}
		catch(SQLException e3) {
			System.out.println("Error en el registro del almacén.");
		}
		return true;
	}
	
	public boolean registroproducto(String nombre, int stock, double precio, int codigo_almacen) {
		try {
			String reg = "insert into producto values(?,?,?,?)";
			pr = conexion().prepareStatement(reg);
			pr.setString(2, nombre);
			pr.setInt(3, stock);
			pr.setDouble(4, precio);
			pr.setInt(5, codigo_almacen);
		}
		catch(SQLException e3) {
			System.out.println("Error en el registro del producto.");
		}
		return true;
	}
	
	public ResultSet consulta(String codsql) {
		try {
			st=conexion().createStatement();
			res=st.executeQuery(codsql);
		}
		catch(SQLException e3){
			System.out.println("Error en la consulta");
		}
		return res;
	}
}
