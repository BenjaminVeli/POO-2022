package datos;

public class Triangulo {
	public double radio;
	public double base;
	public double altura;
	double area() {
		double a=(base*altura)/2;
		return a;	
	}
	public void imprimir() {
		System.out.println("El area es: "+area());
	}
}
