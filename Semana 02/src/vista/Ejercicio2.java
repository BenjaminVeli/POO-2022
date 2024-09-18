package vista;
import datos.Productos;
public class Ejercicio2{
	public static void main(String[] args) {
		Productos p = new Productos();
		
		p.setCodigo(12312);
		p.setDescripción("Apple watch");
		p.setCantidad(23);
		p.setPrecio_unitario(140);
		
		double preciot= p.precio();
		double igv= p.igv();
		double total= p.total();
		
		System.out.println("-------Productos-------");
		System.out.println("");
		System.out.println("Código: "+p.getCodigo());
		System.out.println("Descripción: "+p.getDescripción());
		System.out.println("Precio Unitario: " +p.getPrecio_unitario());
		System.out.println("Cantidad: "+p.getCantidad());
		System.out.println("");
		System.out.println("Precio total: "+preciot);
		System.out.println("IGV: "+igv);
		System.out.println("Total: "+total);
	}
}