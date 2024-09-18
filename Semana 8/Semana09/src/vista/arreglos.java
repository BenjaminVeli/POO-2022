package vista;

public class arreglos implements constante {
	int Promedio = 0;
	int n1, n2;
	
	@Override
	public void mayor(int n1, int n2) {
		if ((n1 > n2)) {System.out.println(n1);}
		else {System.out.println(n2);}
	}
	
	@Override
	public void menor(int n1, int n2) {
		if ((n1 < n2)) {System.out.println(n1);}
		else {System.out.println(n2);}
	}
	
	@Override
	public void Promedio(int n1, int n2) {
		Promedio=(n1+n2)/2;
		System.out.println(Promedio);
	}
	
	public void setN1 (int n1) {
		this.n1 = n1;
	}
	
	public void setN2 (int n2) {
		this.n2 = n2;
	}
	
	public void Imprimir() {
		System.out.println("Valor: ");
	}
}