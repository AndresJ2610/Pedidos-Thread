
package com.mycompany.practica2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class RegistroProductos {
    private ArrayList<Producto> lista;
    
    public RegistroProductos(){
        lista = new ArrayList <Producto>();
    }
    
    public void addProducto(Producto miProducto){
        lista.add(miProducto);
    }
    
    public int getRegistros(){
        return lista.size();
    }
    
    public Producto getRegistroProducto(int posicion){
        try{
            Producto producto = lista.get(posicion);
            return producto;
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Posicion invalida");
            return new Producto();
        }
    }
    
}

