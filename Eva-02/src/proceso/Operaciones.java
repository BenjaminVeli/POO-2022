package proceso;
import modelo.Producto;
import java.util.ArrayList;

public class Operaciones {
	public ArrayList lista;
	public Operaciones() {
		lista = new ArrayList();
	}
	public void registro(Producto p) {
		lista.add(p);
	}
	public Producto leer(int indice) {
		return (Producto)lista.get(indice);
	}
	public int busqueda(int num) {
		int indice = -1;
		for (int i=0; i<lista.size();i++) {
			if (num == (leer(i).codigo)) {
				indice = i;
				break;
			}
		}
		return indice;
	}
	public void Imprimir(javax.swing.JTextArea caja) {
		caja.setText("Código\tNombre\tDescripción\tCategoría\tStock\tPrecio\n");
		for(int i=0; i<lista.size();i++) {
			caja.append("\n" + leer(i).codigo + 
					"\t" + leer(i).nombre + 
					"\t" + leer(i).descripcion + 
					"\t" + leer(i).categoria + 
					"\t" + leer(i).stock + 
					"\t" + leer(i).precio);
		}
	}
	public void elimina(int indice) {
		lista.remove(indice);
	}
}

