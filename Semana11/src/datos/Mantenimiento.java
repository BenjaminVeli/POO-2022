package datos;
import java.sql.*;
public class Mantenimiento {
    public Connection conn;
    public Statement sen;
    public PreparedStatement sen2;
    public ResultSet res;
    public String driver="com.mysql.cj.jdbc.Driver";
    public String cadena="jdbc:mysql://localhost/alumnosTecsup";
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
    public ResultSet consulta(String dn) {
        try {
        	String dni = "select * from alumnos where dni='"+dn+"'";
            sen=conexion().createStatement();
            res=sen.executeQuery(dni);
        }
        catch(SQLException e3) {
            System.out.println("Error en la consulta");
        }
        return res;
    }
    public boolean registro(int codigo,String apellido,String nombre,
    		String dni,String direccion) {
        try {
            String sql="insert into alumnos values(?,?,?,?,?)";
            sen2=conexion().prepareStatement(sql);
            sen2.setInt(1, codigo);
            sen2.setString(2, apellido);
            sen2.setString(3, nombre);
            sen2.setString(4, dni);
            sen2.setString(5, direccion);
            sen2.executeUpdate();
        }catch(SQLException e4) {
            System.out.println("Error en el registro");
        }
        return true;
        }
    }