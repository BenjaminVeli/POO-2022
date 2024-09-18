package datos;

public class resultado {

	public static void main(String[] args) {
		figuras f = new figuras(10, 10);
		Rectangulo r = new Rectangulo(8, 5);
		Triangulo t = new Triangulo(9, 8);
		figuras fig;
		fig = r;
		System.out.println(fig.area());
		fig = t;
		System.out.println(fig.area());
		fig = f;
		System.out.println(fig.area());
	}
}