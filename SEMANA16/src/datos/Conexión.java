package datos;
import java.sql.*;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
public class Conexión {
	public Connection conn;
	public String driver="com.mysql.cj.jdbc.Driver";
	public String cadena="jdbc:mysql://localhost/inventario";
	public String usuario="root";
	public String clave="";
	public Connection obtener_conexion() {
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(cadena,usuario,clave);
		}catch(ClassNotFoundException e1) {
			System.out.println("Error en el driver");
		}catch(SQLException e2) {
			System.out.println("Error en la conexion");
		}
		return conn;
	}
	public void reporte1(String reporte,String consulta) {
		try {
			conn=obtener_conexion();
			String sql=consulta;
			String ruta="src/reportes/"+reporte+".jrxml";
			JasperDesign jd=JRXmlLoader.load(ruta);
			JRDesignQuery jrdq=new JRDesignQuery();
			jrdq.setText(sql);
			jd.setQuery(jrdq);
			JasperReport jr=JasperCompileManager.compileReport(jd);
			JasperPrint jp=JasperFillManager.fillReport(jr,null,conn);
			JasperViewer.viewReport(jp,false);
		}catch(Exception e3) {
			System.out.println("Error en el reporte");
		}
	}

public void reporte2(String reporte,String consulta) {
	try {
		conn=obtener_conexion();
		String sql=consulta;
		String ruta="src/reportes/"+reporte+".jrxml";
		JasperDesign jd=JRXmlLoader.load(ruta);
		JRDesignQuery jrdq=new JRDesignQuery();
		jrdq.setText(sql);
		jd.setQuery(jrdq);
		JasperReport jr=JasperCompileManager.compileReport(jd);
		JasperPrint jp=JasperFillManager.fillReport(jr,null,conn);
		JasperViewer.viewReport(jp,false);
	}catch(Exception e3) {
		System.out.println("Error en el reporte");
	}
}
}