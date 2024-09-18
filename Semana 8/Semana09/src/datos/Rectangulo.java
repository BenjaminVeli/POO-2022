package datos;

public class Rectangulo extends figuras {
	Rectangulo(double a, double b) {
		super(a, b);
	}
	double area() {
		System.out.println("Area del rectangulo: ");
		return dim1 * dim2;
	}
}