package vista;

public class fibonacci extends arreglos{
	arreglos a=new arreglos();
		int n1=0;
		int n2=1;
		int c= 0;
		static int n3;
		public void Imprimir() {
			for (int i=0; i<n3; i++) {
				System.out.println(n1);
				c=n1+n2;
				n1=n2;
				n2=c;
			}
		}
		
}
