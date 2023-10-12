/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica2;

/**
 *
 * @author linux
 */
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Pedidos {
    private ArrayList<Pedido> pedidos;
    
    public Pedidos(){
        pedidos = new ArrayList <Pedido>();
    }
    
    public void addPedido(Pedido miPedido){
        pedidos.add(miPedido);
    }
    
    public int getSize(){
        return pedidos.size();
    }
    
    public Pedido getRegistroPedido(int posicion){
        try{
            Pedido pedido = pedidos.get(posicion);
            return pedido;
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Posicion invalida");
            return new Pedido();
        }
    }
    
}

