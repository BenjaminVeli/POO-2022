package datos;

public class persona {
	private String nombre;
	private String dni;
	private String dirección;
	public persona(String nombre, String dni, String dirección) {
		this.nombre = nombre;
		this.dni = dni;
		this.dirección = dirección;
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
	public String getDirección() {
		return dirección;
	}
	public void setDirección(String direccion) {
		this.dirección = direccion;
	}
}