package vista;
import datos.Postulante;
public class Ejemplo1 {
	public static void main(String[] args) {
		Postulante x=new Postulante("Diego","7337312","Villa Maria",15,16);
		String cod=x.codigoautogenerado();
		double prom=x.promedio();
		String e=x.estado();
		System.out.println("Codigo: "+cod);
		System.out.println("Promedio: "+prom);
		System.out.println("Estado: "+e);
	}
}