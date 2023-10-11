
package com.mycompany.practica2;

public class Producto {
    private static RegistroProductos productos;
    private String nombre;
    private double precio;

    public Producto() {
        this.nombre = "";
        this.precio = 0.0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
