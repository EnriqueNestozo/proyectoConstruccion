/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fernandomanuel
 */
public class MensajeConfirmacionBorrado extends javax.swing.JFrame {

    /**
     * Creates new form MensajeConfirmacionBorrado
     */
    public MensajeConfirmacionBorrado() {
        initComponents();
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MensajeBorrado = new javax.swing.JPanel();
        jBotonAceptar = new javax.swing.JButton();
        jLabelMensaje = new javax.swing.JLabel();
        jBotonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MensajeBorrado.setBackground(new java.awt.Color(0, 153, 204));

        jBotonAceptar.setBackground(new java.awt.Color(0, 153, 0));
        jBotonAceptar.setForeground(new java.awt.Color(255, 255, 255));
        jBotonAceptar.setText("Aceptar");
        jBotonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonAceptarActionPerformed(evt);
            }
        });

        jLabelMensaje.setText("¿Está seguro de que desea borrar la actividad?");

        jBotonCancelar.setBackground(new java.awt.Color(0, 153, 0));
        jBotonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jBotonCancelar.setText("Cancelar");
        jBotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MensajeBorradoLayout = new javax.swing.GroupLayout(MensajeBorrado);
        MensajeBorrado.setLayout(MensajeBorradoLayout);
        MensajeBorradoLayout.setHorizontalGroup(
            MensajeBorradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MensajeBorradoLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabelMensaje)
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(MensajeBorradoLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jBotonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBotonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        MensajeBorradoLayout.setVerticalGroup(
            MensajeBorradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MensajeBorradoLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabelMensaje)
                .addGap(18, 18, 18)
                .addGroup(MensajeBorradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBotonAceptar)
                    .addComponent(jBotonCancelar))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MensajeBorrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MensajeBorrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBotonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonAceptarActionPerformed
        // TODO add your handling code here:
        
        EliminarActividad eliminar = new EliminarActividad();
        try {
            eliminar.confirmacionBorrar(true);
        } catch (SQLException ex) {
            Logger.getLogger(MensajeConfirmacionBorrado.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_jBotonAceptarActionPerformed

    private void jBotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonCancelarActionPerformed
        // TODO add your handling code here:
        EliminarActividad eliminar = new EliminarActividad();
        try {
            eliminar.confirmacionBorrar(false);
        } catch (SQLException ex) {
            Logger.getLogger(MensajeConfirmacionBorrado.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_jBotonCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(MensajeConfirmacionBorrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MensajeConfirmacionBorrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MensajeConfirmacionBorrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MensajeConfirmacionBorrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MensajeConfirmacionBorrado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MensajeBorrado;
    private javax.swing.JButton jBotonAceptar;
    private javax.swing.JButton jBotonCancelar;
    private javax.swing.JLabel jLabelMensaje;
    // End of variables declaration//GEN-END:variables
}
