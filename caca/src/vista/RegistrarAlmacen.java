package vista;
import java.sql.*;
import java.util.Scanner;
import datos.Conexion;
public class RegistrarAlmacen {
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            Conexion c=new Conexion();
            String dir, dis;
            System.out.println("Ingrese la dirección: ");
            dir=s.next();
            System.out.println("Ingrese el distrito: ");
            dis=s.next();
            boolean x=c.registroa(dir, dis);
            if(x==true) {
                System.out.println("Almacen registrado correctamente");
            }else {
                System.out.println("Error, no se pudo registrar el almacén");
            }
        }
}