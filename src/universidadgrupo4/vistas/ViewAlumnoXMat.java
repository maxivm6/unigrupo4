/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo4.vistas;

import javax.swing.JOptionPane;
import universidadgrupo4.control.CursadaData;
import universidadgrupo4.control.MateriaData;
import universidadgrupo4.modelos.Conexion;
import universidadgrupo4.modelos.Materia;

/**
 *
 * @author Maxi
 */
public class ViewAlumnoXMat extends javax.swing.JInternalFrame {

    Conexion conexion;
    public ViewAlumnoXMat(Conexion conexion) {
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

        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtIdMateria = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jbBuscar = new javax.swing.JButton();

        jLabel5.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 102, 255));
        jLabel5.setText("Consulta");

        setClosable(true);
        setIconifiable(true);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setText("ID MATERIA");

        jtIdMateria.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jtIdMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtIdMateriaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 102, 255));
        jLabel4.setText("Consulta");

        jbBuscar.setBackground(new java.awt.Color(51, 102, 255));
        jbBuscar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel3)
                        .addGap(64, 64, 64)
                        .addComponent(jtIdMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtIdMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtIdMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtIdMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtIdMateriaActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        int id=0;
        boolean val=false;
        CursadaData nuevo = new CursadaData(conexion);
        
        
        try {
            id = Integer.parseInt(jtIdMateria.getText()) ;
            val=true;
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Campo incorrecto"); 
        }
        
        try {
            if (nuevo.buscarMateria(id)==null){
                JOptionPane.showMessageDialog(this, "No se encuentra la materia");
            }else{
                Materia mat = nuevo.buscarMateria(id);
                if (nuevo.obtenerCursadas().contains(mat)){
                    JOptionPane.showMessageDialog(this, "No hay inscriptos actualmente");
                    
                }else{
                    JOptionPane.showMessageDialog(this, nuevo.obtenerAlumnosXMateria(id));
                }
            }
        }catch (NullPointerException e){
            JOptionPane.showMessageDialog(this, "No se encuentra la materia");
        }

    }//GEN-LAST:event_jbBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JTextField jtIdMateria;
    // End of variables declaration//GEN-END:variables
}
