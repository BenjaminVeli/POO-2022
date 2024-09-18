package vista;
import datos.Mantenimiento;
import java.sql.*;
import java.util.Scanner;
public class Registro {

    public static void main(String[] args)throws SQLException{
        Mantenimiento m=new Mantenimiento();
        Scanner s=new Scanner(System.in);
        String  ape, nom, dir, dis;
        int cod;
        System.out.println("Ingrese el Código:");
        cod=s.nextInt();
        System.out.println("Ingrese el Apellido:");
        ape=s.next();
        System.out.println("Ingrese el Nombre:");
        nom=s.next();
        System.out.println("Ingrese la Dirección:");
        dir=s.next();
        System.out.println("Ingrese su Distrito:");
        dis=s.next();
        m.registro(cod, ape, nom, dir, dis);
        System.out.println("Alumno registrado correctamnete");
    }

}