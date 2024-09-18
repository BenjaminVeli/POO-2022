package vista;
import java.sql.*;
import java.util.Scanner;
import datos.Mantenimiento;
public class RegistrarProductos {

        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            Mantenimiento m=new Mantenimiento();
            String nom;
            int can;
            double pre;
            System.out.println("Ingrese el nombre: ");
            nom=s.next();
            System.out.println("Ingrese la cantidad: ");
            can=s.nextInt();
            System.out.println("Ingrese el precio: ");
            pre=s.nextDouble();
            boolean x=m.registro(nom, can, pre);
            if(x==true) {
                System.out.println("Producto registrado correctamente");
            }else {
                System.out.println("Error, no se pudo registrar el producto");
            }
        }
}