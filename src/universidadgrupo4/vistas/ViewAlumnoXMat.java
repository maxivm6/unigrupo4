/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo4.vistas;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import universidadgrupo4.control.AlumnoData;
import universidadgrupo4.control.CursadaData;
import universidadgrupo4.control.MateriaData;
import universidadgrupo4.modelos.Alumno;
import universidadgrupo4.modelos.Conexion;
import universidadgrupo4.modelos.Cursada;
import universidadgrupo4.modelos.Materia;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Maxi
 */
public class ViewAlumnoXMat extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo;
    private MateriaData materia;
    private AlumnoData alumno;
    private CursadaData cursada;
    private ArrayList <Materia> materias;    
    private ArrayList <Alumno> alumnos; 
    private ArrayList <Cursada> cursadas;
    private Conexion conexion;
    
    public ViewAlumnoXMat() {
        try {
            initComponents();
            conexion= new Conexion ("jdbc:mysql://localhost/universidadgrupo4", "root", "");           
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ViewAlumnoXMat.class.getName()).log(Level.SEVERE, null, ex);
        }
            modelo = new DefaultTableModel();
            cursada = new CursadaData(conexion);
            cursadas = (ArrayList<Cursada>) cursada.obtenerCursadas();
            materia = new MateriaData(conexion);
            materias = materia.obtenerMaterias();
            alumno = new AlumnoData(conexion);
            alumnos = alumno.obtenerAlumnos();
            cargarMaterias();
            cabeceraTabla();
    }

public void cargarMaterias(){
    for(Materia item:materias){
        cbMaterias.addItem(item);
    }
}

public void cargaDatosMaterias(){
    borrarFilasTabla();
    Materia mat = (Materia) cbMaterias.getSelectedItem();
    for (Cursada c:cursadas){
        if(c.getMateria().getIdMateria()==mat.getIdMateria()){
            modelo.addRow(new Object[]{c.getAlumno().getIdAlumno(),c.getAlumno().getNombre(),c.getAlumno().getApellido(),c.getNota()});
        }
    }
}

public void cabeceraTabla(){
    ArrayList<Object> columns= new ArrayList();
    columns.add("ID");
    columns.add("Nombre");
    columns.add("Apellido");
    columns.add("Nota");
    for (Object it:columns){
        modelo.addColumn(it);
    }
    tAlumnos.setModel(modelo);
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

        jLabel1 = new javax.swing.JLabel();
        cbMaterias = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tAlumnos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Materias");

        cbMaterias.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMateriasActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(247, 247, 247))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cbMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMateriasActionPerformed
        cargaDatosMaterias();
    }//GEN-LAST:event_cbMateriasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Materia> cbMaterias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tAlumnos;
    // End of variables declaration//GEN-END:variables
}
