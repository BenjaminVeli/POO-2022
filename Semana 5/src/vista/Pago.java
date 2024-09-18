package vista;

import datos.DocenteTiempoCompleto;
import datos.DocenteTiempoParcial;

public class Pago {
	public static void main(String [] args) {
		DocenteTiempoParcial dtp = new DocenteTiempoParcial("Benjamín", "Veli", "985463123", 65, 95);
		DocenteTiempoCompleto dtc = new DocenteTiempoCompleto("Jhosep", "Mariano", "785563423", 45, 70);
		
		System.out.println("---------------------------------------------");
		System.out.println();
		System.out.println("Docente de tiempo parcial");
		System.out.println("Datos: " + dtp.obetenerDatos());
		System.out.println("Sueldo Bruto: " + dtp.sbruto());
		System.out.println("---------------------------------------------");
		System.out.println("Docente de tiempo completo");
		System.out.println("Datos: " + dtc.obetenerDatos());
		System.out.println("Bonificación: " + dtc.bonisoles());
		System.out.println("Sueldo Bruto: " + dtc.sbruto());
		System.out.println();
		System.out.println("---------------------------------------------");
	}
}