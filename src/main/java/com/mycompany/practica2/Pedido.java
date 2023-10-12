/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica2;

import java.io.*;
import java.util.*;

/**
 *
 * @author linux
 */
public class Pedido implements Serializable{
    private static Pedidos pedidos;
    private int index;
    private String nombre;
    private double precio;
    private int distancia;
    private String fechaInicio;
    private String fechaFinal;
    
    public Pedido(){
        this.index = 0;
        this.nombre = "";
        this.precio = 0.0;
        this.distancia = 0;
        this.fechaInicio = "";
        this.fechaFinal = "";
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
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

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }
    
    @Override
    public String toString(){
        return "Nombre="+nombre+", Distancia="+distancia+", Precio="+precio+", Fecha Salida="+fechaInicio;
    }
    
}
