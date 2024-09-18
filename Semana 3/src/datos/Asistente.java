package datos;

public class Asistente{
	private int codigo;
	private String nombre;
	private int dni;
	private double sueldo;
	static int cantidad=0;
	public Asistente(int codigo, String nombre, int dni, double sueldo) {
		this.codigo=codigo;
		this.nombre=nombre;
		this.dni=dni;
		this.sueldo=sueldo;
		cantidad=cantidad+1;
	}
	public int getCodigo() {
		return codigo;
	}
	public int setCodigo(int codigo) {
		return this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public String setNombre (String nombre) {
		return this.nombre = nombre;
	}
	public int getDni () {
		return dni;
	}
	public int setDni(int dni) {
		return this.dni = dni;
	}
	public double getSueldo() {
		return sueldo;
	}
	public double setSueldo(double sueldo) {
		return this.sueldo = sueldo;
	}
	public static int getCantidad() {
		return cantidad;
	}
	public static int setCantidad(int cantidad) {
		return Asistente.cantidad = cantidad;
	}
}