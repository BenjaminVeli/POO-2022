package datos;
import java.sql.*;

public class Alumnos  {
	public Connection conn;
	public Statement sen;
	public ResultSet datos;
	public String mysql="com.mysql.cj.jdbc.Driver";
	public String base="jdbc:mysql://localhost/alumnos";
	public String usuario="root";
	public String clave = "";
	
	public void conectar() throws Exception{
		Class.forName(mysql);
		conn=DriverManager.getConnection(base,usuario,clave);
		sen=conn.createStatement();
		System.out.println("Conexión OK");
	}
	public ResultSet consulta() throws Exception{
		datos=sen.executeQuery("Select * from Alumnos");
		return datos;
	}
	
}