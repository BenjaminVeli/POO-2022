package datos;

public class Productos {
	private int codigo;
	private String descripción;
	private int cantidad;
	private int precio_unitario;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescripción() {
		return descripción;
	}
	public void setDescripción(String descripción) {
		this.descripción = descripción;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getPrecio_unitario() {
		return precio_unitario;
	}
	public void setPrecio_unitario(int precio_unitario) {
		this.precio_unitario = precio_unitario;
	}
	public double precio() {
		int pt=precio_unitario*cantidad;
		return pt;
	}
	public double igv() {
		double ig = precio_unitario*0.18;
		return ig;
	}
	public double total () {
		double total = (precio_unitario+igv())*cantidad;
		return total;
	}
	
}