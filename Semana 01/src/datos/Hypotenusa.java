package datos;

public class Hypotenusa {
	public double hypo ;
	public double cateto1 ;
	public double cateto2 ;
	double hypo() {
		double h = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
		return h;
	}
	public void imprimir() {
		System.out.println("La hipotenusa es: "+hypo());
	}
	
}