/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica2;

import java.io.*;

/**
 *
 * @author linux
 */
public class AñadirBInario extends ObjectOutputStream{
    
    public AñadirBInario(OutputStream out) throws IOException{
        super(out);
    }
    
    public AñadirBInario() throws IOException,SecurityException{
        
    }
    
    @Override
    protected void writeStreamHeader() throws IOException {
        reset();
    }
    
}
