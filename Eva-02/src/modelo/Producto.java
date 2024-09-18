package modelo;

public class Producto {
    public int codigo;
    public String nombre;
    public String descripcion;
    public String categoria;
    public int stock;
    public Double precio;

    public Producto(int codigo, String nombre, String descripcion, String categoria, int stock, Double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.stock = stock;
        this.precio = precio;
    }
}
