package datos;
import java.sql.*;
public class Mantenimiento {
	public Connection conn;
    public Statement sen;
    public PreparedStatement sen2;
    public ResultSet res;
    public String driver="com.mysql.cj.jdbc.Driver";
    public String cadena="jdbc:mysql://localhost/Ventas";
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
    public boolean registro(String nombre,
    		int cantidad,double precio) {
        try {
        	String codigosql="insert into productos values(?,?,?)";
            sen2=conexion().prepareStatement(codigosql);
            sen2.setString(2, nombre);
            sen2.setInt(3, cantidad);
            sen2.setDouble(4, precio);
            sen2.executeUpdate();
        }catch(SQLException e4) {
            System.out.println("Error en el registro");
        }
        return true;
        }
	}