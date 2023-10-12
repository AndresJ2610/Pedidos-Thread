
package com.mycompany.practica2;

import java.io.Serializable;

public class Producto implements Serializable{
    private static RegistroProductos lista;
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
    
    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Precio: "+precio);
    }

}
