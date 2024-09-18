package datos;

import java.util.Scanner;

public class Fibonacci {
	public void fibo() {
		System.out.println("----------------------------");
		System.out.println("Fibonaccci serie: \n");
		int puntos = 0;
		int n0 = 0;
		int nl = 1;
		String ciclo = "0 - 1";
		while(true) {
			Scanner x = new Scanner(System.in);
			System.out.println(ciclo + " -> (Siguiente número)");
			int n = x.nextInt ();
			if(n == (n0+nl)) {
				ciclo = ciclo + " - " + Integer.toString(n);
				n0 = nl;
				nl = n;
				puntos = puntos + 1;
			}
			else {
				System.out.println("Tus números son: " + puntos);
				break;
			}
		}
	}
}