package proceso;
import modelo.Cuenta;
import java.util.ArrayList;

public class operaciones {
	public ArrayList lista;
	public operaciones() {
		lista = new ArrayList();
	}
	
	public void registro(Cuenta c) {
		lista.add(c);
	}
	
	public Cuenta leer(int indice) {
		return (Cuenta)lista.get(indice);
	}
	
	public void Imprime(javax.swing.JTextArea caja) {
		caja.setText("Número\tNombre\tTipo\tSaldo\n");
		for(int i=0; i<lista.size();i++) {
			caja.append("\n" + leer(i).numero + "\t" + leer(i).nombre + "\t" + leer(i).tipo + "\t" + leer(i).saldo);
		}
	}
	
	public int busqueda(String nom) {
		int indice = -1;
		for (int i=0; i<lista.size();i++) {
			if (nom.equals(leer(i).nombre)) {
				indice = i;
				break;
			}
		}
		return indice;
	}
	
	public void elimina(int indice) {
		lista.remove(indice);
	}
}
