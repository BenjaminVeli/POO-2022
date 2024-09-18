package vista;

import datos.postulante;

public class empleo {
	
	public static void main(String [] args ) {
		postulante p = new postulante("Martín Mendoza", "19415597" , "Av. Miguel Grau, Santa Anita", 17.5, 18.9 );
		System.out.println("--------------------------------");
		System.out.println();
		System.out.println("POSTULANTE");
		System.out.println("Código: " + p.codigo());
		System.out.println("Nota Promedio: " + p.nota());
		System.out.println("Estado: " + p.estado());
		System.out.println();
		System.out.println("--------------------------------");
	}
}