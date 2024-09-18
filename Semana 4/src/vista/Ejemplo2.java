package vista;
import datos.DocenteTiempoCompleto;
import datos.DocenteTiempoParcial;

public class Ejemplo2 {
	public static void main(String  [] args) {
		DocenteTiempoParcial dtp= new DocenteTiempoParcial("Benjamín","Veli","73375051",60,70);
		DocenteTiempoCompleto dtc= new DocenteTiempoCompleto("Benjamín","Veli","73375051",30,70);
		
		System.out.println("---------------------------------");
		System.out.println();
		System.out.println("Docente Tiempo Parcial");
		System.out.println("Datos: " + dtp.obtenerDatos());
		System.out.println("Sueldo Bruto "+ dtp.sbruto());
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println();
		System.out.println("Docente Tiempo Completo");
		System.out.println("Datos: "+dtc.obtenerDatos());
		System.out.println("Bonificación: "+dtc.bonisoles());
		System.out.println("Sueldo Bruto: "+dtc.sbruto());
		System.out.println();
		System.out.println("---------------------------------");
	}
}