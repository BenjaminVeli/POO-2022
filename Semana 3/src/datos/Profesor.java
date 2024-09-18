package datos;
public class Profesor{
	private int codigo;
	private String nombre;
	private int horas;
	private double tarifa;
	private static int cantidad=0;
	private static double suma=0;
	public Profesor(int codigo, String nombre,int horas,double tarifa) {
		this.codigo=codigo;
		this.nombre=nombre;
		this.horas=horas;
		this.tarifa=tarifa;
		cantidad=cantidad+1;
		suma=suma+horas*tarifa;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo=codigo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public double getTarifa() {
		return tarifa;
	}
	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}
	public static int getCantidad() {
		return cantidad;
	}
	public static void setCantidad(int cantidad) {
		Profesor.cantidad = cantidad;
	}
	public static double getSuma() {
		return suma;
	}
	public static void setSuma(double suma) {
		Profesor.suma = suma;
	}
	public double sueldo() {
		return horas*tarifa;
	}
}