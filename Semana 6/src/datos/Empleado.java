package datos;
import java.util.ArrayList;
public class Empleado {
	ArrayList lista = new ArrayList();
	public void registro() {
		lista.add(65);
		lista.add("Veli");
		lista.add("Mariano");
		lista.add(4000);
		lista.add(18);
		lista.add(true);
	}
	public void imprimir() {
		for(int i=0;i<lista.size();i++) {
			System.out.println(lista.get(i));
		}
		System.out.println("-----------------------");
		for(Object x:lista) {
				System.out.println(x);	
		}
	}
}