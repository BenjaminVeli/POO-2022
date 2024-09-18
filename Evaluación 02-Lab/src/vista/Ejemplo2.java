package vista;
import java.util.Scanner;
import datos.Producto;
public class Ejemplo2 {
	public static void main(String[] args) {
		Producto x=new Producto();
		x.registro();
		System.out.println("----------------------");
		System.out.println("Lista de números registrados:");
		x.imprimir();
		while(true) {
			System.out.println("------------------------");
			System.out.println("Opciones");
			System.out.println("1. Mostrar los valores registrados");
			System.out.println("2. Modificar el valor de la posición 2");
			System.out.println("3. Eliminar el valor de la posición 2");
			
			Scanner s = new Scanner(System.in);
			System.out.println("4. Salir");
			int p = s.nextInt();
			System.out.println("----------------------------");
			
			if(p == 1) {
				System.out.println("Lista");
				x.imprimir();
			}
			if(p == 2) {
				Scanner m = new Scanner(System.in);
				System.out.println("Ingrese el nuevo valor");
				int a= m.nextInt();
				x.actualizar(a);
			}
			if(p == 3) {
				x.eliminar();
			}
		}
	}
}