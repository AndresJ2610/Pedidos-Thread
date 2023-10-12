
package com.mycompany.practica2;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.time.LocalDateTime;

public class Hilo extends Thread{
    
    private JLabel etiqueta;
    private VisualizarPedido moto;
    private FrmPedido frmPedido;
    private Pedidos pedidos;

    public Hilo(JLabel etiqueta, VisualizarPedido moto) {
        this.etiqueta = etiqueta;
        this.moto = moto;
    }
    
    @Override
    public void run(){
        int moto1;
        int moto2;
        int moto3;
        
        while(true){
            try{
                
                sleep((int)(Math.random() * 1000));
                moto1 = moto.getPrimerMoto().getLocation().x;
                moto2 = moto.getSegundoMoto().getLocation().x;
                moto3 = moto.getTercerMoto().getLocation().x;
                
                if (moto1 < moto.getMeta().getLocation().x - 125 && moto2 < moto.getMeta().getLocation().x - 50 && moto3 < moto.getMeta().getLocation().x - 50) {
                    etiqueta.setLocation(etiqueta.getLocation().x + 10, etiqueta.getLocation().y);
                    moto.repaint();
                } else {
                    for (int i = 0; i < moto.fechasFinal.length; i++) {
                        moto.fechasFinal[i] = String.valueOf(LocalDateTime.now());
                        
                    }
                    break;
                }
                
            } catch (InterruptedException e) {
                JOptionPane.showMessageDialog(null, e);
            }
            
        }
    }
}
