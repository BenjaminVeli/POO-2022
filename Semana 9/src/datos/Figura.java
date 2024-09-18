package datos;
public abstract class Figura {
	public double dim1;
	public double dim2;
	public Figura(double dim1, double dim2) {
		super();
		this.dim1 = dim1;
		this.dim2 = dim2;
	}
	public abstract double area();
	}
