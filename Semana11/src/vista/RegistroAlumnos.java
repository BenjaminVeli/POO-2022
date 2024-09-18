package vista;
import java.sql.*;
import java.util.Scanner;
import datos.Mantenimiento;
public class RegistroAlumnos {

        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            Mantenimiento m=new Mantenimiento();
            int cod;
            String apell, nom , dni, direc;
            System.out.println("Ingrese el código: ");
            cod=s.nextInt();
            System.out.println("Ingrese el apellido: ");
            apell=s.next();
            System.out.println("Ingrese el nombre: ");
            nom=s.next();
            System.out.println("Ingrese el dni: ");
            dni=s.next();
            System.out.println("Ingrese la dirección: ");
            direc=s.next();
            boolean x=m.registro(cod, apell, nom,dni, direc);
            if(x==true) {
                System.out.println("Alumno registrado correctamente");
            }else {
                System.out.println("Error, no se pudo registrar al alumno");
            }
        }
}