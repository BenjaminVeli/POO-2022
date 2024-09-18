package datos;
public class DocenteTiempoParcial extends Docente{
	private int horas;
	private int tarifa;
	public DocenteTiempoParcial(String nombre, String apellido, String dni, int horas, int tarifa) {
		super(nombre, apellido, dni);
		this.horas = horas;
		this.tarifa = tarifa;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public int getTarifa() {
		return tarifa;
	}
	public void setTarifa(int tarifa) {
		this.tarifa = tarifa;
	}
	public String obetenerDatos() {
		return "Nombre = " + getNombre() + ", Apellido = " + getApellido() + ", Dni = " + getDni() + ", Horas/t = " + getHoras() + ", Tarifa = " + getTarifa();
	}
	public int sbruto() {
		return getHoras() * getTarifa();
	}
}

