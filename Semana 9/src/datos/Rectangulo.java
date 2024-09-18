package datos;
public class Rectangulo extends Figura {
	public Rectangulo(double dim1, double dim2) {
		super(dim1, dim2);	
	}

	@Override
	public double area() {
	double area=dim1*dim2;
	return area;
	}
}