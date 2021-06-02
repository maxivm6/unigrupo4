/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo4.vistas;

import java.util.List;
import javax.swing.JOptionPane;
import universidadgrupo4.control.AlumnoData;
import universidadgrupo4.control.CursadaData;
import universidadgrupo4.control.MateriaData;
import universidadgrupo4.modelos.Conexion;
import universidadgrupo4.modelos.Cursada;

/**
 *
 * @author Maxi
 */
public class ViewInscripciones extends javax.swing.JInternalFrame {

    Conexion conexion;
    public ViewInscripciones(Conexion conexion) {
        this.conexion=conexion;
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

        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtIdAlumno = new javax.swing.JTextField();
        jtIdMateria = new javax.swing.JTextField();
        jbAlta = new javax.swing.JButton();
        jbBaja = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 102, 255));
        jLabel4.setText("Inscripciones");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setText("ID ALUMNO");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setText("ID MATERIA");

        jtIdAlumno.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jtIdAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtIdAlumnoActionPerformed(evt);
            }
        });

        jtIdMateria.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jtIdMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtIdMateriaActionPerformed(evt);
            }
        });

        jbAlta.setBackground(new java.awt.Color(51, 102, 255));
        jbAlta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbAlta.setText("Alta");
        jbAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAltaActionPerformed(evt);
            }
        });

        jbBaja.setBackground(new java.awt.Color(51, 102, 255));
        jbBaja.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbBaja.setText("Baja");
        jbBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBajaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(93, 93, 93)
                                .addComponent(jtIdMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(95, 95, 95)
                                .addComponent(jtIdAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jbAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jbBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtIdAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtIdMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtIdAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtIdAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtIdAlumnoActionPerformed

    private void jtIdMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtIdMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtIdMateriaActionPerformed

    private void jbAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAltaActionPerformed
        int idAlumno=0,idMateria=0;
        boolean val=false;
        AlumnoData al = new AlumnoData(conexion);
        MateriaData mat = new MateriaData(conexion); 
        
        CursadaData nuevo = new CursadaData(conexion);
        try {
            idAlumno = Integer.parseInt(jtIdAlumno.getText());
            idMateria = Integer.parseInt(jtIdMateria.getText());
            val=true;
        
        Cursada cursada = new Cursada();
        cursada.setAlumno(nuevo.buscarAlumno(idAlumno));
        cursada.setMateria(nuevo.buscarMateria(idMateria));       
        
        try{
            if (al.buscarAlumno(idAlumno)==null){
               JOptionPane.showMessageDialog(this, "No existe alumno con ID: "+idAlumno+" en el sistema");
               jtIdAlumno.setText(null);
            }
            else if(mat.buscarMateria(idMateria)==null){
                   JOptionPane.showMessageDialog(this, "No existe materia con ID: "+idMateria+" en el sistema");
                   jtIdMateria.setText(null);
            }
            
        }catch(Exception e){}
        
        
        try{    
            if (nuevo.CheckCursada(idAlumno, idMateria)) {
                      JOptionPane.showMessageDialog(this, "Alumno ya inscripto en esta materia");               
            }
            else {
                   nuevo.guardarCursada(cursada);
                   JOptionPane.showMessageDialog(this, "Alta realizada");
            }
            
        }catch(NullPointerException e){}
        
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "ID alumno y materia deben ser numeros enteros. ");
            jtIdAlumno.setText(null);
            jtIdMateria.setText(null);
        }
            
        
    }//GEN-LAST:event_jbAltaActionPerformed

    private void jbBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBajaActionPerformed
        int idAlumno=0,idMateria=0;
        boolean val=false;
        AlumnoData al = new AlumnoData(conexion);
        MateriaData mat = new MateriaData(conexion); 
        
        CursadaData nuevo = new CursadaData(conexion);
        try {
            idAlumno = Integer.parseInt(jtIdAlumno.getText());
            idMateria = Integer.parseInt(jtIdMateria.getText());
            val=true;
        
        Cursada cursada = new Cursada();
        cursada.setAlumno(nuevo.buscarAlumno(idAlumno));
        cursada.setMateria(nuevo.buscarMateria(idMateria));
        
         try{
            if (al.buscarAlumno(idAlumno)==null){
               JOptionPane.showMessageDialog(this, "No existe alumno con ID: "+idAlumno+" en el sistema");
               jtIdAlumno.setText(null);
            }
            else if(mat.buscarMateria(idMateria)==null){
                   JOptionPane.showMessageDialog(this, "No existe materia con ID: "+idMateria+" en el sistema");
                   jtIdMateria.setText(null);
            }
        }catch(Exception e){}      
        try{    
            int opcion = JOptionPane.showConfirmDialog(this, "Atencion. Esta accion eliminara la inscripcion actual", "Baja", 2, JOptionPane.WARNING_MESSAGE);
        if (opcion==0) {
            if (!nuevo.CheckCursada(idAlumno, idMateria)) {
                      JOptionPane.showMessageDialog(this, "No se encuentra ninguna inscripcion");
                      jtIdAlumno.setText(null);
                      jtIdMateria.setText(null);
            }
            else {
                   nuevo.borrarCursadaMateriaDeunAlumno(idAlumno,idMateria);
                   JOptionPane.showMessageDialog(this, "Baja realizada");
                   jtIdAlumno.setText(null);
                   jtIdMateria.setText(null);
            }
        }          
        }catch(NullPointerException e){
            
        }}
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "ID alumno y materia deben ser numeros enteros. ");
            jtIdAlumno.setText(null);
            jtIdMateria.setText(null);
        }
        
    }//GEN-LAST:event_jbBajaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbAlta;
    private javax.swing.JButton jbBaja;
    private javax.swing.JTextField jtIdAlumno;
    private javax.swing.JTextField jtIdMateria;
    // End of variables declaration//GEN-END:variables
}
