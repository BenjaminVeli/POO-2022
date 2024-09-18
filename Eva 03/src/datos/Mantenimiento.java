package datos;
import java.sql.*;

public class Mantenimiento {
	public String driver = "com.mysql.cj.jdbc.Driver";
	public String cadena = "jdbc:mysql://localhost/empresaXYZ";
	public String usuario = "root";
	public String clave = "";
	public Connection conn;
	public Statement sen;
	public PreparedStatement sen2;
	public ResultSet res;
	
	public Connection conexion() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(cadena , usuario, clave);
		} catch (ClassNotFoundException e1) {
			System.out.println("Error en el driver de mysql");
		} catch (SQLException e2) {
			System.out.println("Error en la conexion");
		}
		return conn;
	}
	
	public ResultSet consulta(String sql) {
		try {
			sen = conexion().createStatement();
			res = sen.executeQuery(sql);
		} catch(SQLException e3) {
			System.out.println("Error en la consulta");
		}
		return res;
	}
	
	public boolean registro(int codigo, String apellidos, String nombres, 
			String ruc, double linea_de_credito) {
		try {
			String codigosql = "insert into clientes values(?,?,?,?,?)";
			sen2 = conexion().prepareStatement(codigosql);
			sen2.setInt(1, codigo);
			sen2.setString(2, apellidos);
			sen2.setString(3, nombres);
			sen2.setString(4, ruc);
			sen2.setDouble(5, linea_de_credito);
			sen2.executeUpdate();
		}catch(SQLException e4) {
			System.out.println("Error en el registro");
		}
		return true;
	}
}