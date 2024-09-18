package datos;

public class Persona {
	private String nombre;
	private String dni;
	private String direccion;
	public Persona (String nombre, String dni, String direccion) {
		this.setNombre(nombre);
		this.setDni(dni);
		this.setDireccion(direccion);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
}