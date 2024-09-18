package sem05;
public class Calculadora {
	
	static int sumarENTEROS(int a, int b) {
		return a+b;
	}
	
	static double sumarDOUBLE (double a, double b) {
		return a+b;
	}
	
	static int restarENTEROS(int a, int b) {
		return a-b;
	}
	
	static double restarDOUBLE(double a, double b) {
		return a-b;
	}
	
	static int multiplicarENTEROS(int a, int b) {
		return a*b;
	}
	
	static double multiplicarDOUBLE(double a, double b) {
		return a*b;
	}
	
	static int dividirENTEROS(int a , int b) {
		return a/b;
	}
	
	static double dividirDOUBLE(double a, double b) {
		return a/b;
	}
	
	public static void main(String[] args) {
		System.out.println("Suma de enteros: " + sumarENTEROS(10,5));
		System.out.println("Suma de enteros: " + sumarDOUBLE(10.5,5.0));
		System.out.println("Restar de enteros: " + restarENTEROS(10,5));
		System.out.println("Restar de enteros: " + restarDOUBLE(10.5,5.0));
		System.out.println("Multiplicar de enteros: " + multiplicarENTEROS(10,5));
		System.out.println("Multiplicar de enteros: " + multiplicarDOUBLE(10.5,5.0));
		System.out.println("Dividir de enteros: " + dividirENTEROS(10,5));
		System.out.println("Dividir de enteros: " + dividirDOUBLE(10.5,5.0));
	}
}