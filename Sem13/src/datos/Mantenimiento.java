package datos;
import java.sql.*;
import javax.swing.JOptionPane;

public class Mantenimiento {
    public String driver="com.mysql.cj.jdbc.Driver";
    public String cadena="jdbc:mysql://localhost/MATRICULA";
    public String usuario="root";
    public String clave="";
    public Connection conn;
    public Mantenimiento() throws SQLException{
    	try {
    		Class.forName(driver);
    		conn=DriverManager.getConnection(cadena,usuario,clave);
    	}catch(ClassNotFoundException e1) {
    	}catch(SQLException e1) {}}
    public void registro(int codigo,String apellido,String nombre,String direccion,
    		String distrito) { 
        try {
            CallableStatement cs=conn.prepareCall("call registrar(?,?,?,?,?)");
            cs.setInt("codigo", codigo);
            cs.setString("apellido", apellido);
            cs.setString("nombre", nombre);
            cs.setString("direccion", direccion);
            cs.setString("distrito", distrito);
            cs.execute();
        }catch(SQLException e2) {
        }}
    public ResultSet listado() {
    	ResultSet datos=null;
    	try {
    		Statement sen=conn.createStatement();
    		sen.executeQuery("call consulta()");
    		}catch(SQLException e3) {
    		}
    		return datos;
    }}