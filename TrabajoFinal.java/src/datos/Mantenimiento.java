package datos;
import java.sql.*;
import javax.swing.JOptionPane;
public class Mantenimiento {
	public String driver="com.mysql.cj.jdbc.Driver";
	public String cadena="jdbc:mysql://localhost/inventario";
	public String usuario="root";
	public String clave="";
	public Connection conn;
	public Mantenimiento() {
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(cadena,usuario,clave);
		}catch(ClassNotFoundException e1) {
			JOptionPane.showMessageDialog(null, "Error en el driver");
		}catch(SQLException e2) {
			JOptionPane.showMessageDialog(null, "Error en la conexion");
		}
	}
	public boolean registro(String direccion, String distrito) {
		try {
			CallableStatement cs=conn.prepareCall("call reg_almacen(?,?)");
			cs.setString("direccion", direccion);
			cs.setString("distrito", distrito);
			cs.execute();
		}catch(SQLException e3) {
			JOptionPane.showMessageDialog(null, "Error en la conexion");
		}
		return true;
	}
	public ResultSet mostrar() {
		ResultSet data=null;
		try {
			Statement st=conn.createStatement();
			data=st.executeQuery("call mos_almacen");
		}catch(SQLException e4) {
			JOptionPane.showMessageDialog(null, "Error al mostrar datos");
		}
		return data;
	}
}