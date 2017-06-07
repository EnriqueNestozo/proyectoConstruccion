/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import businesslogic.Actividad;
import businesslogic.Area;
import businesslogic.Curso;
import businesslogic.DAOClasses.ActividadDAO;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;
import javax.swing.JTextField;
/**
 *
 * @author fernandomanuel
 */
public class AgregarActividad extends javax.swing.JFrame {
    ActividadDAO actividadDao = new ActividadDAO();
    String idActividad;
    String idCurso;
    /**
     * Creates new form AgregarActividad
     */
    public AgregarActividad() {
        try{
            this.idActividad = actividadDao.obtenerMaxIdActividad();
            initComponents();
            mostrarCursos();
            obtenerArea();
            recorrerHoraComboBo(0);
        }catch (SQLException ex) {
            Logger.getLogger(AgregarActividad.class.getName()).log(Level.SEVERE, null, ex);
        }
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

        jPanelAgregarACtividad = new javax.swing.JPanel();
        jLabelIDACtividad = new javax.swing.JLabel();
        TextFieldIDActividad = new javax.swing.JTextField();
        jLabelCurso = new javax.swing.JLabel();
        jLabelNombreActividad = new javax.swing.JLabel();
        jLabelDetalles = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDetalles = new javax.swing.JTextArea();
        jTextFieldNombreActividad = new javax.swing.JTextField();
        jLabelFecha = new javax.swing.JLabel();
        jLabelDia = new javax.swing.JLabel();
        jLabelMes = new javax.swing.JLabel();
        jComboBoxDia = new javax.swing.JComboBox();
        jComboBoxMes = new javax.swing.JComboBox();
        jLabelAño = new javax.swing.JLabel();
        jTextFieldAño = new javax.swing.JTextField();
        jLabelHoraInicio = new javax.swing.JLabel();
        jComboBoxInicioHora = new javax.swing.JComboBox();
        jLabelDosPuntos = new javax.swing.JLabel();
        jComboBoxInicioMinutos = new javax.swing.JComboBox();
        jLabelHoraFin = new javax.swing.JLabel();
        jComboBoxHoraFin = new javax.swing.JComboBox();
        jComboBoxMinutosFin = new javax.swing.JComboBox();
        jLabelDospuntosFin = new javax.swing.JLabel();
        jButtonGuardar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabelCupo = new javax.swing.JLabel();
        jComboBoxCupo = new javax.swing.JComboBox();
        jLabelArea = new javax.swing.JLabel();
        jComboBoxCurso = new javax.swing.JComboBox();
        jComboBoxArea = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanelAgregarACtividad.setBackground(new java.awt.Color(0, 153, 204));

        jLabelIDACtividad.setText("IdActividad:");

        TextFieldIDActividad.setEditable(false);
        TextFieldIDActividad.setText(idActividad);
        TextFieldIDActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldIDActividadActionPerformed(evt);
            }
        });

        jLabelCurso.setText("Curso:");

        jLabelNombreActividad.setText("Nombre de la Actividad:");

        jLabelDetalles.setText("Detalles:");

        jTextAreaDetalles.setColumns(20);
        jTextAreaDetalles.setRows(5);
        jTextAreaDetalles.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextAreaDetallesKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jTextAreaDetalles);

        jTextFieldNombreActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActividadActionPerformed(evt);
            }
        });
        jTextFieldNombreActividad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombreActividadKeyTyped(evt);
            }
        });

        jLabelFecha.setText("Fecha:");

        jLabelDia.setText("Dia:");

        jLabelMes.setText("Mes:");

        jComboBoxDia.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30" }));

        jComboBoxMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jComboBoxMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMesActionPerformed(evt);
            }
        });

        jLabelAño.setText("Año:");

        jTextFieldAño.setEditable(false);
        jTextFieldAño.setText("2017");
        jTextFieldAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAñoActionPerformed(evt);
            }
        });

        jLabelHoraInicio.setText("Hora inicio:");

        jComboBoxInicioHora.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "7","8","9","10","11","12","13","14","15","16","17","18","19","20" }));
        jComboBoxInicioHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxInicioHoraActionPerformed(evt);
            }
        });

        jLabelDosPuntos.setText(":");

        jComboBoxInicioMinutos.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"00","01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50","51","52","53","54","55","56","57","58","59",}));
        jComboBoxInicioMinutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxInicioMinutosActionPerformed(evt);
            }
        });

        jLabelHoraFin.setText("Hora Fin:");

        jComboBoxMinutosFin.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"00","01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50","51","52","53","54","55","56","57","58","59",}));

        jLabelDospuntosFin.setText(":");

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jLabelCupo.setText("Cupo:");

        jComboBoxCupo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"}));
        jComboBoxCupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCupoActionPerformed(evt);
            }
        });

        jLabelArea.setText("Area:");

        javax.swing.GroupLayout jPanelAgregarACtividadLayout = new javax.swing.GroupLayout(jPanelAgregarACtividad);
        jPanelAgregarACtividad.setLayout(jPanelAgregarACtividadLayout);
        jPanelAgregarACtividadLayout.setHorizontalGroup(
            jPanelAgregarACtividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAgregarACtividadLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAgregarACtividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAgregarACtividadLayout.createSequentialGroup()
                        .addGroup(jPanelAgregarACtividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelHoraFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelHoraInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelAgregarACtividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAgregarACtividadLayout.createSequentialGroup()
                                .addComponent(jComboBoxInicioHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelDosPuntos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxInicioMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelAgregarACtividadLayout.createSequentialGroup()
                                .addComponent(jComboBoxHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelDospuntosFin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxMinutosFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonGuardar))
                        .addGap(6, 6, Short.MAX_VALUE)
                        .addComponent(jButtonCancelar)
                        .addGap(89, 89, 89))
                    .addGroup(jPanelAgregarACtividadLayout.createSequentialGroup()
                        .addGroup(jPanelAgregarACtividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelFecha)
                            .addGroup(jPanelAgregarACtividadLayout.createSequentialGroup()
                                .addComponent(jLabelDia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxDia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelMes)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelAño)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldAño, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelAgregarACtividadLayout.createSequentialGroup()
                                .addGroup(jPanelAgregarACtividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelIDACtividad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelAgregarACtividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TextFieldIDActividad, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                    .addComponent(jComboBoxCurso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(50, 50, 50)
                                .addGroup(jPanelAgregarACtividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelAgregarACtividadLayout.createSequentialGroup()
                                        .addComponent(jLabelCupo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboBoxCupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelAgregarACtividadLayout.createSequentialGroup()
                                        .addComponent(jLabelArea)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboBoxArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelAgregarACtividadLayout.createSequentialGroup()
                        .addGroup(jPanelAgregarACtividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAgregarACtividadLayout.createSequentialGroup()
                                .addComponent(jLabelNombreActividad)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldNombreActividad))
                            .addGroup(jPanelAgregarACtividadLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabelDetalles)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1)))
                        .addContainerGap())))
        );
        jPanelAgregarACtividadLayout.setVerticalGroup(
            jPanelAgregarACtividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAgregarACtividadLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAgregarACtividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIDACtividad)
                    .addComponent(TextFieldIDActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCupo)
                    .addComponent(jComboBoxCupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelAgregarACtividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCurso)
                    .addComponent(jLabelArea)
                    .addComponent(jComboBoxCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelAgregarACtividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombreActividad)
                    .addComponent(jTextFieldNombreActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelAgregarACtividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDetalles)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabelFecha)
                .addGap(18, 18, 18)
                .addGroup(jPanelAgregarACtividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDia)
                    .addComponent(jLabelMes)
                    .addComponent(jComboBoxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAño)
                    .addComponent(jTextFieldAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelAgregarACtividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHoraInicio)
                    .addComponent(jComboBoxInicioHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDosPuntos)
                    .addComponent(jComboBoxInicioMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelAgregarACtividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHoraFin)
                    .addComponent(jComboBoxHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxMinutosFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDospuntosFin))
                .addGap(18, 18, 18)
                .addGroup(jPanelAgregarACtividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonGuardar)
                    .addComponent(jButtonCancelar))
                .addGap(4, 4, 4))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelAgregarACtividad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelAgregarACtividad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldIDActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldIDActividadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldIDActividadActionPerformed

    private void jTextFieldNombreActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActividadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActividadActionPerformed

    private void jComboBoxMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxMesActionPerformed

    private void jTextFieldAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAñoActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jComboBoxCupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCupoActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        // TODO add your handling code here:
        try {
            this.idCurso = actividadDao.obtenerIdCurso(jComboBoxCurso.getSelectedItem().toString());
            Actividad actividad = new Actividad(TextFieldIDActividad.getText(), 
                 jTextFieldNombreActividad.getText(),
                 jTextAreaDetalles.getText(), 
                 jComboBoxCupo.getSelectedItem().toString(),
                 jComboBoxInicioHora.getSelectedItem().toString()+":"+jComboBoxInicioMinutos.getSelectedItem().toString(),
                 jComboBoxHoraFin.getSelectedItem().toString()+":"+jComboBoxMinutosFin.getSelectedItem().toString(),
                 jTextFieldAño.getText()+"-"+jComboBoxMes.getSelectedItem().toString()+"-"+jComboBoxDia.getSelectedItem().toString()+" "+jComboBoxInicioHora.getSelectedItem().toString()+":"+jComboBoxInicioMinutos.getSelectedItem().toString(),
                 jComboBoxArea.getSelectedItem().toString());
            if(!actividadDao.validar(actividad)){
                 if(actividadDao.guardaActividad(actividad,idCurso)){
                     dispose();
                     new MensajeGuardado();
                 }
                 else{
                     new MensajeErrorGuardado();
                 }                 
             }
             else
                 new MensajeValidacion();
        } catch (SQLException ex) {
            Logger.getLogger(AgregarActividad.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
        
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jComboBoxInicioHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxInicioHoraActionPerformed
        // TODO add your handling code here:
        recorrerHoraComboBo(jComboBoxInicioHora.getSelectedIndex()); 
    }//GEN-LAST:event_jComboBoxInicioHoraActionPerformed
    private void jTextFieldNombreActividadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreActividadKeyTyped
        // TODO add your handling code here:
        numeroCaracteres(evt,jTextFieldNombreActividad,50);
    }//GEN-LAST:event_jTextFieldNombreActividadKeyTyped

    private void jTextAreaDetallesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextAreaDetallesKeyTyped
        // TODO add your handling code here:
        numeroCaracteresTextArea(evt, jTextAreaDetalles, 250);
    }//GEN-LAST:event_jTextAreaDetallesKeyTyped

    private void jComboBoxInicioMinutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxInicioMinutosActionPerformed
        // TODO add your handling code here:
        mismaHora(Integer.parseInt(jComboBoxInicioMinutos.getSelectedItem().toString()));
    }//GEN-LAST:event_jComboBoxInicioMinutosActionPerformed
    private void recorrerHoraComboBo(int index){
        if(index==13){
            jComboBoxHoraFin.removeAllItems();
            jComboBoxHoraFin.addItem(20);
            mismaHora(Integer.parseInt(jComboBoxInicioMinutos.getSelectedItem().toString()));
        }
        else{
            jComboBoxHoraFin.removeAllItems();
        for(int i=index+1; i<=13;i++){
            jComboBoxHoraFin.addItem(i+7);
            }
        mismaHora(-1);
        }
        jComboBoxHoraFin.updateUI();
    }
    public static void numeroCaracteres(java.awt.event.KeyEvent evt, JTextField campoDeseado, int numeroLimitar){
        if(campoDeseado.getText().length() >= numeroLimitar )
            evt.consume();
        
    }
    private void mostrarCursos() throws SQLException{
        List<Curso> listaCursos = new ArrayList();
        listaCursos=actividadDao.mostrarCursos();
        for(int i=0; i<listaCursos.size();i++){
           jComboBoxCurso.addItem(listaCursos.get(i).getNombreCurso());
        }
        jComboBoxCurso.updateUI();
        
    }
    private void obtenerArea() throws SQLException{
        List<Area> listaAreas = new ArrayList();
        listaAreas=actividadDao.mostrarAreas();
        for(int i=0; i<listaAreas.size(); i++){
            jComboBoxArea.addItem(listaAreas.get(i).getNumeroArea());

        }
        jComboBoxArea.updateUI();
        
    }
    private void mismaHora(int minuto){
        jComboBoxMinutosFin.removeAllItems();
        for(int i=minuto+1; i<60; i++){
            jComboBoxMinutosFin.addItem(i);
        }
        jComboBoxMinutosFin.updateUI();
    }
    private void numeroCaracteresTextArea(KeyEvent evt, JTextArea areaDeseada , int numeroLimitar) {
        if(areaDeseada.getText().length() >= numeroLimitar )
            evt.consume();
    }

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
            java.util.logging.Logger.getLogger(AgregarActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarActividad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextFieldIDActividad;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JComboBox jComboBoxArea;
    private javax.swing.JComboBox jComboBoxCupo;
    private javax.swing.JComboBox jComboBoxCurso;
    private javax.swing.JComboBox jComboBoxDia;
    private javax.swing.JComboBox jComboBoxHoraFin;
    private javax.swing.JComboBox jComboBoxInicioHora;
    private javax.swing.JComboBox jComboBoxInicioMinutos;
    private javax.swing.JComboBox jComboBoxMes;
    private javax.swing.JComboBox jComboBoxMinutosFin;
    private javax.swing.JLabel jLabelArea;
    private javax.swing.JLabel jLabelAño;
    private javax.swing.JLabel jLabelCupo;
    private javax.swing.JLabel jLabelCurso;
    private javax.swing.JLabel jLabelDetalles;
    private javax.swing.JLabel jLabelDia;
    private javax.swing.JLabel jLabelDosPuntos;
    private javax.swing.JLabel jLabelDospuntosFin;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelHoraFin;
    private javax.swing.JLabel jLabelHoraInicio;
    private javax.swing.JLabel jLabelIDACtividad;
    private javax.swing.JLabel jLabelMes;
    private javax.swing.JLabel jLabelNombreActividad;
    private javax.swing.JPanel jPanelAgregarACtividad;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDetalles;
    private javax.swing.JTextField jTextFieldAño;
    private javax.swing.JTextField jTextFieldNombreActividad;
    // End of variables declaration//GEN-END:variables

}
