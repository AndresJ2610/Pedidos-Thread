
package com.mycompany.practica2;

import javax.swing.JLabel;
import java.time.LocalDateTime;

public class VisualizarPedido extends javax.swing.JFrame {
    public static Pedidos pedidos;
    private FrmPedido pedido;
    String[] fechasInicio = new String[3];
    String[] fechasFinal = new String[3];
    int index = 0;
    public VisualizarPedido(Pedidos pedidos) {
        this.pedidos = pedidos;
        initComponents();
    }
    
    public JLabel getPrimerMoto(){
        return moto1;
    }
    
    public JLabel getSegundoMoto(){
        return moto2;
    }
    
    public JLabel getTercerMoto(){
        return moto3;
    }
    
    public JLabel getMeta(){
        return meta;
    }
    
    /**private void moverCarro(JLabel carro, int velocidad) {
        Timer timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x = carro.getX() + velocidad;
                if (x >= meta.getLocation().x) {
                    ((Timer) e.getSource()).stop(); // Detener el Timer cuando llega a la meta
                } else {
                    carro.setLocation(x, carro.getY());
                }
            }
        });
        timer.start();
    }*/

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblVehiculo1 = new javax.swing.JLabel();
        lblDistancia1 = new javax.swing.JLabel();
        btnEnviar1 = new javax.swing.JButton();
        lblVehiculo2 = new javax.swing.JLabel();
        lblDistancia2 = new javax.swing.JLabel();
        btnEnviar2 = new javax.swing.JButton();
        lblVehiculo3 = new javax.swing.JLabel();
        lblDistancia3 = new javax.swing.JLabel();
        btnEnviar3 = new javax.swing.JButton();
        btnEnviarTodos = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        moto1 = new javax.swing.JLabel();
        moto2 = new javax.swing.JLabel();
        moto3 = new javax.swing.JLabel();
        meta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setText("Visualización de Pedidos");

        lblVehiculo1.setText("Vehículo 1");

        lblDistancia1.setText("Distancia");

        btnEnviar1.setText("Enviar");
        btnEnviar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviar1ActionPerformed(evt);
            }
        });

        lblVehiculo2.setText("Vehículo 2");

        lblDistancia2.setText("Distancia");

        btnEnviar2.setText("Enviar");
        btnEnviar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviar2ActionPerformed(evt);
            }
        });

        lblVehiculo3.setText("Vehículo 3");

        lblDistancia3.setText("Distancia");

        btnEnviar3.setText("Enviar");
        btnEnviar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviar3ActionPerformed(evt);
            }
        });

        btnEnviarTodos.setBackground(new java.awt.Color(234, 234, 255));
        btnEnviarTodos.setText("Enviar Todos");
        btnEnviarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarTodosActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        moto1.setText("////////");

        moto2.setText("//////////");

        moto3.setText("//////////");

        meta.setBackground(new java.awt.Color(204, 0, 204));
        meta.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(moto1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(moto2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(moto3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 656, Short.MAX_VALUE)
                .addComponent(meta, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(moto1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(moto2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(moto3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(meta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDistancia2)
                            .addComponent(btnEnviar2)
                            .addComponent(lblVehiculo2)
                            .addComponent(lblDistancia3)
                            .addComponent(btnEnviar3)
                            .addComponent(lblVehiculo3)
                            .addComponent(lblDistancia1)
                            .addComponent(btnEnviar1)
                            .addComponent(lblVehiculo1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                        .addComponent(btnEnviarTodos)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnEnviarTodos))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(lblVehiculo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDistancia1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEnviar1)
                        .addGap(53, 53, 53)
                        .addComponent(lblVehiculo2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDistancia2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEnviar2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addComponent(lblVehiculo3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDistancia3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEnviar3)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviar1ActionPerformed
        // TODO add your handling code here:
        fechasInicio[0] = String.valueOf(LocalDateTime.now());
        moto1.setLocation(0,moto1.getLocation().y);
        Hilo vehiculo1 = new Hilo(moto1, this);
        vehiculo1.start();
    }//GEN-LAST:event_btnEnviar1ActionPerformed

    private void btnEnviar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviar2ActionPerformed
        // TODO add your handling code here:
        fechasInicio[1] = String.valueOf(LocalDateTime.now());
        moto2.setLocation(0,moto2.getLocation().y);
        Hilo vehiculo2 = new Hilo(moto2, this);
        vehiculo2.start();
    }//GEN-LAST:event_btnEnviar2ActionPerformed

    private void btnEnviar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviar3ActionPerformed
        // TODO add your handling code here:
        fechasInicio[2] = String.valueOf(LocalDateTime.now());
        moto3.setLocation(0,moto3.getLocation().y);
        Hilo vehiculo3 = new Hilo(moto3, this);
        vehiculo3.start();
    }//GEN-LAST:event_btnEnviar3ActionPerformed

    private void btnEnviarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarTodosActionPerformed
        // TODO add your handling code here:
        moto1.setLocation(0,moto1.getLocation().y);
        moto2.setLocation(0,moto2.getLocation().y);
        moto3.setLocation(0,moto3.getLocation().y);
        Hilo vehiculo1 = new Hilo(moto1, this);
        Hilo vehiculo2 = new Hilo(moto2, this);
        Hilo vehiculo3 = new Hilo(moto3, this);
        vehiculo1.start();
        vehiculo2.start();
        vehiculo3.start();
        
    }//GEN-LAST:event_btnEnviarTodosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VisualizarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualizarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualizarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualizarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisualizarPedido(pedidos).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar1;
    private javax.swing.JButton btnEnviar2;
    private javax.swing.JButton btnEnviar3;
    private javax.swing.JButton btnEnviarTodos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDistancia1;
    private javax.swing.JLabel lblDistancia2;
    private javax.swing.JLabel lblDistancia3;
    private javax.swing.JLabel lblVehiculo1;
    private javax.swing.JLabel lblVehiculo2;
    private javax.swing.JLabel lblVehiculo3;
    private javax.swing.JLabel meta;
    private javax.swing.JLabel moto1;
    private javax.swing.JLabel moto2;
    private javax.swing.JLabel moto3;
    // End of variables declaration//GEN-END:variables
}
