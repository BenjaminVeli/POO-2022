package datos;

public class postulante extends persona{
	private double nota1;
	private double nota2;
	public postulante(String nombre, String dni, String dirección, double nota1, double nota2) {
		super(nombre, dni, dirección);
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public String codigo() {
		String codigo = getNombre().charAt(0) + getDni();
		return codigo;
	}
	public double nota() {
		double nota = (nota1 + 2* nota2)/3;
		return nota;
	}
	public String estado() {
		if (nota()>=14) {
			return "ACEPTADO";
		}
		else {
			return "RECHAZADO";
		}
	}
}
