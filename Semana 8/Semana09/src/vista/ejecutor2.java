package vista;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejecutor2 extends fibonacci {

	public static void main(String[] args) throws IOException {
		fibonacci f = new fibonacci();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Valor para la longitud de fibonacci: ");
		String n = br.readLine();
		n3 = Integer.parseInt(n);
		f.Imprimir();
	}
}