package datos;
import java.util.Scanner;
import java.util.ArrayList;
public class Producto {
	ArrayList<Integer> lista=new ArrayList<Integer>();
	public void registro() {
		Scanner x = new Scanner(System.in);
		System.out.println("Cuántos números quiere ingresar");
		int nl = x.nextInt();
		for(int i=0; i< (nl); i++) {
			Scanner z = new Scanner(System.in);
			System.out.println("Ingrese un valor númerico " + (i+1) + ":");
			int v = z.nextInt();
			lista.add(v);
		}
	}
	public void imprimir() {
		for(Object y:lista) {
			System.out.println(y);
		}
	}
	public void actualizar(int x) {
		lista.set(1, x);
		System.out.println("Actualización realizada correctamente");
	}
	public void eliminar() {
		lista.remove(2);
		System.out.println("Eliminación realizada correctamente");
	}
}


