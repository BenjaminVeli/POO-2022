package vista;
import java.sql.*;
import java.util.Scanner;
import datos.Mantenimiento;
public class RegistroAlumnos {

        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            Mantenimiento m=new Mantenimiento();
            int cod, can;
            String nom;
			double pre;
            System.out.println("Ingrese el código: ");
            cod=s.nextInt();
            System.out.println("Ingrese el nombre: ");
            nom=s.next();
            System.out.println("Ingrese la cantidad: ");
            can=s.nextInt();
            System.out.println("Ingrese el precio: ");
            pre=s.nextDouble();
            boolean x=m.registro(cod, nom,can, pre);
            if(x==true) {
                System.out.println("Producto registrado correctamente");
            }else {
                System.out.println("Error, no se pudo registrar al producto");
            }
        }
}