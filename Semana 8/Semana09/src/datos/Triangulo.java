package datos;

public class Triangulo extends figuras {
	Triangulo(double a, double b) {
		super(a, b);
	}
	double area() {
		System.out.println("Area del triangulo: ");
		return dim1 * dim2 / 2;
	}
}