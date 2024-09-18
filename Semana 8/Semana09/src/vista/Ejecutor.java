package vista;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Ejecutor {
	public static void main(String[] args) {
		arreglos a = new arreglos();
		Scanner n = new Scanner(System.in);
		System.out.println("Ingrese el numero");
	int n1 = n.nextInt();
	System.out.println("Ingrese otro numero");
	int n2 = n.nextInt();
		a.n1=n1;
		a.n2=n2;
		a.Imprimir();
		System.out.println("Numero mayor: ");
		a.mayor(n1, n2);
		System.out.println("Numero menor: ");
		a.menor(n1, n2);
		System.out.println("El promedio es: ");
		a.Promedio(n1, n2);
		try {
			FileOutputStream fout = new FileOutputStream("");
			fout.write(n1);
			fout.write(n2);
			fout.close();
			System.out.println("Finalizado");
		} catch(Exception e) {System.out.println(e);}

	}

}
