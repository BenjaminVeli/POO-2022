package vista;

import java.util.Scanner;
import datos.Pedidos;

public class RegistrodeVentas{
	
	public static void main(String[] args) {
		Scanner cod = new Scanner(System.in);
		System.out.println("INGRESE EL CÓDIGO: ");
		int code = cod.nextInt();
		
		Scanner pro = new Scanner(System.in);
		System.out.println("NOMBRE DEL PRODUCTO: ");
		String prod = pro.nextLine();
		
		Scanner can = new Scanner(System.in);
		System.out.println("INGRESE LA CANTIDAD: ");
		int cant = can.nextInt();
		
		Scanner pre = new Scanner(System.in);
		System.out.println("INGRESE EL PRECIO: ");
		int prec = pre.nextInt();
		
		Pedidos p = new Pedidos();
		p.setCódigo(code);
		p.setProducto(prod);
		p.setCantidad(cant);
		p.setPrecio(prec);
		p.setSubtotal(p.calculo());
		double sbl = p.getSubtotal();
		p.setTotal(p.calculo(sbl));
		
		System.out.println("--------------------------------");
		System.out.println();
		System.out.println("PRODUCTO");
		System.out.println("CÓDIGO: " + p.getCódigo());
		System.out.println("NOMBRE: " + p.getProducto());
		System.out.println("CANTIDAD: " + p.getCantidad());
		System.out.println("PRECIO: " + p.getPrecio());
		System.out.println("SUBTOTAL: " + sbl);
		System.out.println("TOTAL: " + p.getTotal());
		System.out.println();
		System.out.println("--------------------------------");
		
		
	}
	
}