/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import businesslogic.Autenticacion;
import businesslogic.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author Enrique
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(this);
        
    }
    
    private String obtenerContrasena(){
        char [] contrasenia = txtContrasenia.getPassword();
        String contrasena = "";
        for(int x = 0; x< contrasenia.length; x++){
            contrasena += contrasenia[x]; 
        }
        return contrasena;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtContrasenia = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        BotonSalir = new javax.swing.JButton();
        BotonAccesar = new javax.swing.JButton();
        jLabel_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        txtNombre.setBackground(new java.awt.Color(0, 173, 79));
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setBorder(null);
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 140, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 235, 140, 10));

        txtContrasenia.setBackground(new java.awt.Color(0, 173, 79));
        txtContrasenia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtContrasenia.setForeground(new java.awt.Color(255, 255, 255));
        txtContrasenia.setBorder(null);
        txtContrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseniaActionPerformed(evt);
            }
        });
        getContentPane().add(txtContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 140, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 275, 140, 10));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/user.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        BotonSalir.setBackground(new java.awt.Color(0, 85, 37));
        BotonSalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BotonSalir.setForeground(new java.awt.Color(255, 255, 255));
        BotonSalir.setText("Salir");
        BotonSalir.setBorder(null);
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(BotonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 60, 20));

        BotonAccesar.setBackground(new java.awt.Color(0, 85, 37));
        BotonAccesar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BotonAccesar.setForeground(new java.awt.Color(255, 255, 255));
        BotonAccesar.setText("Accesar");
        BotonAccesar.setBorder(null);
        BotonAccesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAccesarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonAccesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 130, 30));

        jLabel_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/fondo_verde.jpg"))); // NOI18N
        getContentPane().add(jLabel_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 259, 342));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void BotonAccesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAccesarActionPerformed
        if(txtNombre.getText().length() == 0 || txtContrasenia.getPassword().length == 0 ){
            JOptionPane.showMessageDialog(null, "Porfavor introduzca nombre de usuario y/o contraseña");
        }else{
            try{
                Usuario usuario = new Usuario();
                usuario.setNombreUsuario(txtNombre.getText());               
                usuario.setContrasenia(obtenerContrasena());
                Autenticacion autenticacion = new Autenticacion();
                if(autenticacion.buscarUsuario(usuario)){
                    if(usuario.getTipo().equals("3")){
                        MenuRecepcionista menuRecepcionista = new MenuRecepcionista();
                        menuRecepcionista.setVisible(true);
                        dispose();
                    }else{
                        MenuCoordinador menuCoordinador = new MenuCoordinador();
                        menuCoordinador.setVisible(true);
                        dispose();
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Nombre de usuario y/o contraseña invalidos, intente nuevamente");
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        
    }//GEN-LAST:event_BotonAccesarActionPerformed

    private void txtContraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseniaActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAccesar;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_fondo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField txtContrasenia;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
