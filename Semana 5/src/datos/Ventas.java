package datos;

public class Ventas {
	private int código;
	private String producto;
	private int cantidad;
	private int precio;
	private double subtotal;
	private double igv;
	private double total;
	
	public int getCódigo() {
		return código;
	}
	public void setCódigo(int código) {
		this.código = código;
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal ;
	}
	public double getIgv() {
		return igv;
	}
	public void setIgv(double igv) {
		this.igv = igv;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double calculo() {
		return precio * cantidad;
	}
	public double calculo(double subtotal) {
		return subtotal * 0.18;
	}
	public double calculo(double subtotal, double igv) {
		return subtotal + igv;
	}
}