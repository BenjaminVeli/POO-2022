package vista;

import java.util.Scanner;
import datos.Ventas;

public class RegistrodeCompras {
	public static void main(String[] args) {
		Scanner cod= new Scanner(System.in);
		System.out.println("INGRESE EL CÓDIGO: ");
		int code = cod.nextInt();
		
		Scanner pro = new Scanner(System.in);
		System.out.println("NOMBRE DEL PRODUCTO: ");
		String prod = pro.nextLine();
		
		Scanner can = new Scanner(System.in);
		System.out.println("INGRESE LA CANTIDAD: ");
		int cant = can.nextInt();
		
		Scanner pre= new Scanner(System.in);
		System.out.println("INGRESE EL PRECIO: ");
		int prec = pre.nextInt();
		
		Ventas v = new Ventas();
		v.setCódigo(code);
		v.setProducto(prod);
		v.setCantidad(cant);
		v.setPrecio(prec);
		v.setSubtotal(v.calculo());
		double sub = v.getSubtotal();
		v.setIgv(v.calculo(sub));
		double igv = v.getIgv();
		v.setTotal(v.calculo(sub, igv));
		double tot = v.getTotal();
		
		System.out.println("-------------------------------");
		System.out.println();
		System.out.println("PRODUCTO");
		System.out.println("CÓDIGO: " + v.getCódigo());
		System.out.println("NOMBRE: " + v.getProducto());
		System.out.println("CANTIDAD: " + v.getCantidad());
		System.out.println("PRECIO: " + v.getPrecio());
		System.out.println("SUBTOTAL: " + sub);
		System.out.println("IGV: " + igv);
		System.out.println("TOTAL: " + tot);
		System.out.println();
		System.out.println("-------------------------------");
	}
}