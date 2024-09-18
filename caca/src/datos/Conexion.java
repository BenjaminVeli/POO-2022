package datos;
import java.sql.*;
public class Conexion {
	public Connection conn;
    public Statement sen;
    public PreparedStatement sen2;
    public ResultSet res;
    public String driver="com.mysql.cj.jdbc.Driver";
    public String cadena="jdbc:mysql://localhost/elpepe";
    public String usuario="root";
    public String clave = "";
	
    public Connection conexion() {
        try {
            Class.forName(driver);
            conn=DriverManager.getConnection(cadena,usuario,clave);
        }catch(ClassNotFoundException e1) {
            System.out.println("Error en el driver de mysql");
        }catch(SQLException e2) {
            System.out.println("Error en la conexion");
        }
        return conn;
    }
    public ResultSet consulta(String codigosql) {
        try {
            sen=conexion().createStatement();
            res=sen.executeQuery(codigosql);
        }catch(SQLException e3) {
            System.out.println("Error en la consulta");
        }return res;
    } 
    /*****************************************************/
	public boolean registroa(String direccion, String distrito) {
		try {
			String codigosql="insert into almacen values(?,?)";
			sen2=conexion().prepareStatement(codigosql);
			sen2.setString(2, direccion);
			sen2.setString(3, distrito);
		}
		catch(SQLException e4) {
			System.out.println("Error en el registro del almacen");
		}
		return true;
	}
	/*****************************************************/
	public boolean registrop(int codigo, String nombre, int stock, double precio, int codigo_almacen) {
		try {
			String codigosql = "insert into producto values(?,?,?,?,?)";
			sen2 = conexion().prepareStatement(codigosql);
			sen2.setInt(1, codigo);
			sen2.setString(2, nombre);
			sen2.setInt(3, stock);
			sen2.setDouble(4, precio);
			sen2.setInt(5, codigo_almacen);
		}
		catch(SQLException e4) {
			System.out.println("Error en el registro del producto.");
		}
		return true;
	}
}
