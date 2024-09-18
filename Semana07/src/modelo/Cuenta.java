package modelo;
public class Cuenta {
	public int numero;
	public String nombre;
	public String tipo;
	public double saldo;
	public Cuenta(int numero, String nombre, String tipo, double saldo) {
		this.numero = numero;
		this.nombre = nombre;
		this.tipo = tipo;
		this.saldo = saldo;
	}
}
