
package com.mycompany.practica2;

import java.util.ArrayList;
import java.util.List;

public class RegistroProductos {
    private List<Producto> productos;

    public RegistroProductos() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public List<Producto> obtenerProductos() {
        return productos;
    }
}

