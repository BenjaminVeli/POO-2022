package datos;

public class Hipotenusa {
	double hypo = 0;
	double cateto1 = 2;
	double cateto2 = 3;
	double hypo() {
		double h = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
		return h; 
	}
	public void imprimir() {
		System.out.println("La hipotenusa es: "+hypo());
	}
}