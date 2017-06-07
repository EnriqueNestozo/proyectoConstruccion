/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 *
 * @author Enrique
 */
public class MenuCoordinador extends javax.swing.JFrame {

    /**
     * Creates new form MenuCoordinator
     */
    public MenuCoordinador() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BotonCerrarSesion = new javax.swing.JButton();
        BotonSeccion = new javax.swing.JButton();
        BotonCurso = new javax.swing.JButton();
        BotonActividad = new javax.swing.JButton();
        BotonExperienciaEducativa = new javax.swing.JButton();
        BotonAvisos = new javax.swing.JButton();
        BotonIdioma = new javax.swing.JButton();
        BotonInscripcion = new javax.swing.JButton();
        BotonPerfil = new javax.swing.JButton();
        BotonRegistrarUsuario = new javax.swing.JButton();
        BotonReservaciones = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 418, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        BotonCerrarSesion.setBackground(new java.awt.Color(0, 153, 0));
        BotonCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        BotonCerrarSesion.setText("Cerrar sesion");
        BotonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCerrarSesionActionPerformed(evt);
            }
        });

        BotonSeccion.setBackground(new java.awt.Color(0, 153, 0));
        BotonSeccion.setForeground(new java.awt.Color(255, 255, 255));
        BotonSeccion.setText("Administrar Seccion");

        BotonCurso.setBackground(new java.awt.Color(0, 153, 0));
        BotonCurso.setForeground(new java.awt.Color(255, 255, 255));
        BotonCurso.setText("Administrar Curso");
        BotonCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCursoActionPerformed(evt);
            }
        });

        BotonActividad.setBackground(new java.awt.Color(0, 153, 0));
        BotonActividad.setForeground(new java.awt.Color(255, 255, 255));
        BotonActividad.setText("Administrar Actividad");
        BotonActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActividadActionPerformed(evt);
            }
        });

        BotonExperienciaEducativa.setBackground(new java.awt.Color(0, 153, 0));
        BotonExperienciaEducativa.setForeground(new java.awt.Color(255, 255, 255));
        BotonExperienciaEducativa.setText("Administrar E.E.");

        BotonAvisos.setBackground(new java.awt.Color(0, 153, 0));
        BotonAvisos.setForeground(new java.awt.Color(255, 255, 255));
        BotonAvisos.setText("Administrar Avisos");
        BotonAvisos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAvisosActionPerformed(evt);
            }
        });

        BotonIdioma.setBackground(new java.awt.Color(0, 153, 0));
        BotonIdioma.setForeground(new java.awt.Color(255, 255, 255));
        BotonIdioma.setText("Administrar Idioma");

        BotonInscripcion.setBackground(new java.awt.Color(0, 153, 0));
        BotonInscripcion.setForeground(new java.awt.Color(255, 255, 255));
        BotonInscripcion.setText("Administrar Inscripcion");

        BotonPerfil.setBackground(new java.awt.Color(0, 153, 0));
        BotonPerfil.setForeground(new java.awt.Color(255, 255, 255));
        BotonPerfil.setText("Editar Perfil");
        BotonPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPerfilActionPerformed(evt);
            }
        });

        BotonRegistrarUsuario.setBackground(new java.awt.Color(0, 153, 0));
        BotonRegistrarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        BotonRegistrarUsuario.setText("Registrar Usuario");

        BotonReservaciones.setBackground(new java.awt.Color(0, 153, 0));
        BotonReservaciones.setForeground(new java.awt.Color(255, 255, 255));
        BotonReservaciones.setText("Administrar Reservaciones");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonActividad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonExperienciaEducativa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonAvisos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonSeccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonIdioma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonInscripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonRegistrarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonReservaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotonActividad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonAvisos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonExperienciaEducativa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonCurso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonRegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonReservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonCerrarSesion)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCerrarSesionActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_BotonCerrarSesionActionPerformed

    private void BotonAvisosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAvisosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonAvisosActionPerformed

    private void BotonActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActividadActionPerformed
     new MenuActividad();
    }//GEN-LAST:event_BotonActividadActionPerformed

    private void BotonCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonCursoActionPerformed

    private void BotonPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonPerfilActionPerformed

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
            java.util.logging.Logger.getLogger(MenuCoordinador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCoordinador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCoordinador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCoordinador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuCoordinador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonActividad;
    private javax.swing.JButton BotonAvisos;
    private javax.swing.JButton BotonCerrarSesion;
    private javax.swing.JButton BotonCurso;
    private javax.swing.JButton BotonExperienciaEducativa;
    private javax.swing.JButton BotonIdioma;
    private javax.swing.JButton BotonInscripcion;
    private javax.swing.JButton BotonPerfil;
    private javax.swing.JButton BotonRegistrarUsuario;
    private javax.swing.JButton BotonReservaciones;
    private javax.swing.JButton BotonSeccion;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
