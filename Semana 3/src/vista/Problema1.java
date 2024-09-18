package vista;
import datos.Profesor;
public class Problema1 {
	public static void main(String [] args) {
		Problema1 el = new Problema1();
		Profesor x = new Profesor(1,"Max",20,20);
		el.listado(x);
		Profesor y = new Profesor(2,"Symond",23,11);
		el.listado(y);
		System.out.println("Numero de profesores: "+Profesor.getCantidad());
		System.out.println("Sueldos acumulados: "+Profesor.getSuma());
		System.out.println("Sueldo Total: "+Profesor.getSuma());
		
		}
	public void listado(Profesor p) {
		System.out.println("Codigo: "+p.getCodigo());
		System.out.println("Nombre: "+p.getNombre());
		System.out.println("Horas Trabajadas: "+p.getHoras());
		System.out.println("Tarifa: "+p.getTarifa());
		System.out.println("Sueldo: "+p.sueldo());
		System.out.println("------------------------------------");
	} 

}