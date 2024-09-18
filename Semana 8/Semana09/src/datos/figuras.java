package datos;

public abstract class figuras {
	double dim1;
	double dim2;
	
	figuras(double a, double b) {
		dim1 = a;
		dim2 = b;
	}
	double area() {
		System.out.println("Area sin definir");
		return 0;
	}
}