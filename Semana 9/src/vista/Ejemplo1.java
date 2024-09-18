package vista;
import datos.*;
public class Ejemplo1 {
	public static void main(String[] args) {
		Rectangulo r=new Rectangulo(12,30);
		Triangulo t=new Triangulo(30,12);
		double resultado;
		Figura fig;
		fig=r; 
		resultado=fig.area();
		System.out.println("El área del rectángulo es: "+resultado);
		fig=t; 
		resultado=fig.area();
		System.out.println("El área del tríangulo es: "+resultado);
		
	}
}