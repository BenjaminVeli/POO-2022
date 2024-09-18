package datos;

public class Triangulo extends Figura{
	public Triangulo(double dim1, double dim2) {
		super(dim1, dim2);
	}
	@Override
	public double area() {
		double area=dim1*dim2/2;
		return area;
	}
}