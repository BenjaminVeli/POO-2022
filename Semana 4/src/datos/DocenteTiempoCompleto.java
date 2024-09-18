package datos;
public class DocenteTiempoCompleto extends Docente{
	private int sueldo_basico;
	private int poc_bonificacion;
	public DocenteTiempoCompleto(String nombre, String apellido, String dni, int sueldo_basico, int poc_bonificacion) {
		super(nombre,apellido,dni);
		this.sueldo_basico=sueldo_basico;
		this.poc_bonificacion=poc_bonificacion;
	}
	public int getSueldo_basico() {
		return sueldo_basico;
	}
	public void setSueldo_basico(int sueldo_basico) {
		this.sueldo_basico = sueldo_basico;
	}
	public int getPoc_bonificacion() {
		return poc_bonificacion;
	}
	public void setPoc_bonificacion(int poc_bonificacion) {
		this.poc_bonificacion = poc_bonificacion;
	}
	public String obtenerDatos() {
		return 	"Nombre= " + getNombre()+  ", Apellido " +getApellido() +",Dni" +getDni() + ",Suieldo Básico" + getSueldo_basico()+ ",% de Bonificación " + getPoc_bonificacion();
	}
	public double bonisoles() {
		return  getSueldo_basico() * getPoc_bonificacion();
	} 	
	public int sbruto() {
		return getSueldo_basico() + getPoc_bonificacion();
	} 
}