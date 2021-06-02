/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo4.vistas;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadgrupo4.control.AlumnoData;
import universidadgrupo4.control.CursadaData;
import universidadgrupo4.control.MateriaData;
import universidadgrupo4.modelos.Alumno;
import universidadgrupo4.modelos.Conexion;
import universidadgrupo4.modelos.Cursada;
import universidadgrupo4.modelos.Materia;
import javax.swing.table.DefaultTableModel;
public class ViewMatXAlumno extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo;
    private MateriaData materia;
    private AlumnoData alumno;
    private CursadaData cursada;
    private ArrayList <Materia> materias;    
    private ArrayList <Alumno> alumnos; 
    private ArrayList <Cursada> cursadas;
    private Conexion conexion;
    private Connection aux;
    
    public ViewMatXAlumno() {
        initComponents();
        try {
            initComponents();
            conexion= new Conexion ("jdbc:mysql://localhost/universidadgrupo4", "root", "");
            aux = conexion.getConexion();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ViewAlumnoXMat.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ViewMatXAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }
            modelo = new DefaultTableModel();
            cursada = new CursadaData(conexion);
            cursadas = (ArrayList<Cursada>) cursada.obtenerCursadas();
            materia = new MateriaData(conexion);
            materias = materia.obtenerMaterias();
            alumno = new AlumnoData(conexion);
            alumnos = alumno.obtenerAlumnos();
            cabeceraTabla();
    }

    public void cargaDatos(){
    borrarFilasTabla();
    int id = Integer.parseInt(jtId.getText());
    for (Cursada c:cursadas){
        if(c.getAlumno().getIdAlumno()==id){
            modelo.addRow(new Object[]{c.getMateria().getIdMateria(),c.getMateria().getNombreMateria(),c.getMateria().getAnio(),c.getNota()});
        }
    }
}
    public Alumno buscarAlumno(int id){
        AlumnoData ad = new AlumnoData(conexion);
        return ad.buscarAlumno(id);
    }

    public void cabeceraTabla(){
    ArrayList<Object> columns= new ArrayList();
    columns.add("ID");
    columns.add("Nombre");
    columns.add("Año");
    columns.add("Nota");
    for (Object it:columns){
        modelo.addColumn(it);
    }
    tMaterias.setModel(modelo);
}
public void borrarFilasTabla(){
    int b= modelo.getRowCount()-1;
    for(int i = b;i>=0;i--){
        modelo.removeRow(i);
    }
}    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame3 = new javax.swing.JInternalFrame();
        jLabel3 = new javax.swing.JLabel();
        cbMaterias2 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tAlumnos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        cbAlumnos = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tMaterias = new javax.swing.JTable();
        jtId = new javax.swing.JTextField();
        jtBuscar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jInternalFrame3.setClosable(true);
        jInternalFrame3.setIconifiable(true);
        jInternalFrame3.setMaximizable(true);
        jInternalFrame3.setResizable(true);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setText("Materias");

        cbMaterias2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbMaterias2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMaterias2ActionPerformed(evt);
            }
        });

        tAlumnos.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        tAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tAlumnos);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 102, 255));
        jLabel4.setText("Consultas");

        cbAlumnos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAlumnosActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setText("Alumno");

        javax.swing.GroupLayout jInternalFrame3Layout = new javax.swing.GroupLayout(jInternalFrame3.getContentPane());
        jInternalFrame3.getContentPane().setLayout(jInternalFrame3Layout);
        jInternalFrame3Layout.setHorizontalGroup(
            jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(247, 247, 247))
            .addGroup(jInternalFrame3Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(cbMaterias2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(75, 75, 75)
                .addComponent(cbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
            .addGroup(jInternalFrame3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrame3Layout.setVerticalGroup(
            jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame3Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbMaterias2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel6.setText("ID Alumno");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 102, 255));
        jLabel7.setText("Consultas");

        tMaterias.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        tMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tMaterias);

        jtBuscar.setText("Buscar");
        jtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(246, 246, 246))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(36, 36, 36)
                        .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(179, 179, 179))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 428, Short.MAX_VALUE)
                    .addComponent(jInternalFrame3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 429, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtId)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 322, Short.MAX_VALUE)
                    .addComponent(jInternalFrame3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 322, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbMaterias2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMaterias2ActionPerformed
       
    }//GEN-LAST:event_cbMaterias2ActionPerformed

    private void cbAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAlumnosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAlumnosActionPerformed

    private void jtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtBuscarActionPerformed
        int id=0;
        boolean val=false;
        AlumnoData nuevo = new AlumnoData(conexion);
        Alumno al = null;
        
        try{
            id = Integer.parseInt(jtId.getText()) ;
            val=true;
            
            al = nuevo.buscarAlumno(id);
            if (al!=null){
                cargaDatos();
            }else{
                    JOptionPane.showMessageDialog(this, "No se encuentra alumno con ID: "+id);
                    jtId.setText(null);
            }
        
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "ID debe ser un numero.");
            jtId.setText(null);
        }
    }//GEN-LAST:event_jtBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Alumno> cbAlumnos;
    private javax.swing.JComboBox<Materia> cbMaterias;
    private javax.swing.JComboBox<Materia> cbMaterias1;
    private javax.swing.JComboBox<Materia> cbMaterias2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JInternalFrame jInternalFrame3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jtBuscar;
    private javax.swing.JTextField jtId;
    private javax.swing.JTable tAlumnos;
    private javax.swing.JTable tMaterias;
    // End of variables declaration//GEN-END:variables
}
