
package universidadgrupo4.vistas;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import universidadgrupo4.control.AlumnoData;
import universidadgrupo4.control.CursadaData;
import universidadgrupo4.control.MateriaData;
import universidadgrupo4.modelos.Alumno;
import universidadgrupo4.modelos.Conexion;
import universidadgrupo4.modelos.Cursada;
import universidadgrupo4.modelos.Materia;

/**
 *
 * @author Maxi
 */
public class ViewAlumno extends javax.swing.JInternalFrame {

    Conexion con;
    public ViewAlumno(Conexion conexion) {
        con=conexion;
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jtId = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jtFechaNac = new javax.swing.JTextField();
        jtLegajo = new javax.swing.JTextField();
        jbCambiar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jtEstado = new javax.swing.JCheckBox();

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        jLabel2.setText("jLabel2");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel3.setText("ID");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel4.setText("NOMBRE");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("Alumnos");

        jtId.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N

        jbBuscar.setBackground(new java.awt.Color(51, 102, 255));
        jbBuscar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel6.setText("LEGAJO");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel7.setText("FECHA DE NACIMIENTO");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel8.setText("APELLIDO");

        jtNombre.setEditable(false);
        jtNombre.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtNombreMouseClicked(evt);
            }
        });

        jtApellido.setEditable(false);
        jtApellido.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N

        jtFechaNac.setEditable(false);
        jtFechaNac.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jtFechaNac.setText("dd/MM/yyyy");

        jtLegajo.setEditable(false);
        jtLegajo.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N

        jbCambiar.setBackground(new java.awt.Color(51, 102, 255));
        jbCambiar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbCambiar.setText("Actualizar");
        jbCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCambiarActionPerformed(evt);
            }
        });

        jbGuardar.setBackground(new java.awt.Color(51, 102, 255));
        jbGuardar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbBorrar.setBackground(new java.awt.Color(51, 102, 255));
        jbBorrar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbBorrar.setText("Baja");
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel9.setText("ESTADO:");

        jtEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtEstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(489, 489, 489)
                                .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jtFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(167, 167, 167))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(jbCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jbBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(144, 144, 144))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(195, 195, 195))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(319, 319, 319))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        int id=0;
        boolean val=false;
        AlumnoData nuevo = new AlumnoData(con);
        Alumno al = null;
        
        try {
            id = Integer.parseInt(jtId.getText()) ;
            val=true;
            
            try {
                al = nuevo.buscarAlumno(id);
                if (al!=null){
                    jtNombre.setText(al.getNombre());
                    jtNombre.setEditable(val);
                    jtApellido.setText(al.getApellido());
                    jtApellido.setEditable(val);
                    jtLegajo.setText(String.valueOf(al.getLegajo()));
                    jtLegajo.setEditable(val);
                    jtFechaNac.setText(al.getFechNac().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                    jtFechaNac.setEditable(val);



                } else{
                    JOptionPane.showMessageDialog(this, "No se encuentra alumno con ID: "+id);
                    limpiar();
                }
        } catch (NullPointerException e){
            
        } } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "ID debe ser un numero.");
            limpiar();
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        String nombre=null,apellido=null;
        LocalDate fecha = null;
        int legajo = 0;
        boolean val=false;
        AlumnoData nuevo = new AlumnoData(con);
        ArrayList<Alumno> alumnos = new ArrayList();
        
        try {
            
            nombre = jtNombre.getText();
            apellido = jtApellido.getText();
            try{    
                legajo = Integer.parseInt(jtLegajo.getText());
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Legajo debe ser numero entero");
            }
            try{
                fecha = LocalDate.parse(jtFechaNac.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            }catch(Exception e){
               JOptionPane.showMessageDialog(this, "El formato de fecha debe ser: dd/MM/yyyy ");
            }
            
         
        
            if (nombre.isEmpty()||apellido.isEmpty()||val==false){
               JOptionPane.showMessageDialog(this, "Revise legajo o campos vacios");  
            }
            else{
                alumnos = nuevo.obtenerAlumnos();
                Alumno al = new Alumno(legajo,nombre,apellido,fecha,true);

                if (alumnos.stream().anyMatch(a->a.getLegajo()==al.getLegajo())){
                    JOptionPane.showMessageDialog(this, "Ya existe el legajo: "+legajo+ " en el sistema");
                }
                
        
                    
                else{
                    nuevo.guardarAlumno(al);
                    JOptionPane.showMessageDialog(this, "Alumno agregado");
                }                             
            }
            
        }catch (NumberFormatException e){}
        
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        int id=0;
        String nombre = null;
        boolean val=false;
        AlumnoData nuevo = new AlumnoData(con);
        CursadaData cd = new CursadaData(con);
        Alumno al = null;
        ArrayList<Cursada> cursadas = (ArrayList<Cursada>) cd.obtenerCursadas();
        
        try {
            id = Integer.parseInt(jtId.getText()) ;
            val=true;
         
            try {
            al = nuevo.buscarAlumno(id);

                if (al!=null){
                    int opcion = JOptionPane.showConfirmDialog(this, "Esta accion dara de baja:\n " 
                    + al.toString() + 
                    "\n Estas seguro?", "ATENCION", 2, JOptionPane.WARNING_MESSAGE);
                    if (opcion==0) {
                        Cursada cur =null;
                        for (Cursada em:cursadas){
                            if (em.getAlumno().getIdAlumno()==id) {
                                cur = em;
                            }
                        }  
                        if(cur.getAlumno().getIdAlumno()==id){
                                JOptionPane.showMessageDialog(this, "ERROR. Alumno con ID: "+id+"- "+cur.getAlumno().getNombre()+" "+cur.getAlumno().getApellido()+" se encuentra con cursadas activas");
                                limpiar();
                        }else{
                                nuevo.borrarAlumno(id);
                                JOptionPane.showMessageDialog(this, "Alumno dado de baja");
                                limpiar();
                        }                   
                    }
                } else{
                    JOptionPane.showMessageDialog(this, "No se encuentra alumno con ID: "+id);
                    limpiar();
                }
        } catch (NullPointerException e){}
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "ID debe ser un numero.");
            limpiar();
        }
    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jbCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCambiarActionPerformed
        int id=0,legajo=0;
        String nombre = null,apellido=null;
        LocalDate fecha =null;
        boolean val=false;
        AlumnoData nuevo = new AlumnoData(con);
        
        try {
            nombre = jtNombre.getText();
            apellido = jtApellido.getText();
            legajo = Integer.parseInt(jtLegajo.getText()) ;
            id = Integer.parseInt(jtId.getText());
            fecha = LocalDate.parse(jtFechaNac.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            val=true;
        } catch (NumberFormatException e){}
        if (nombre.isEmpty()||apellido.isEmpty()||val==false){
           JOptionPane.showMessageDialog(this, "Campo incorrecto");  
        }else{
            if (nuevo.buscarAlumno(id)==null) {
                  JOptionPane.showMessageDialog(this, "No se encuentra el alumno");
            }else{                
                Alumno al = new Alumno(legajo,nombre,apellido,fecha,true);
                int opcion = JOptionPane.showConfirmDialog(this, "Esta seguro que desea modificar:\n " 
                + nuevo.buscarAlumno(id).toString(), "ATENCION", 2, JOptionPane.WARNING_MESSAGE);
                    if (opcion==0) {
                        nuevo.actualizarAlumno(al, id);
                        JOptionPane.showMessageDialog(this, "Se ha modificado el alumno");
                    }               
            }
        }
    }//GEN-LAST:event_jbCambiarActionPerformed

    private void jtEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtEstadoActionPerformed
        
    }//GEN-LAST:event_jtEstadoActionPerformed

    private void jtNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtNombreMouseClicked
       boolean val = true;
       jtNombre.setEditable(val);
       jtApellido.setEditable(val);
       jtLegajo.setEditable(val);
       jtFechaNac.setEditable(val);
    }//GEN-LAST:event_jtNombreMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbCambiar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JCheckBox jtEstado;
    private javax.swing.JTextField jtFechaNac;
    private javax.swing.JTextField jtId;
    private javax.swing.JTextField jtLegajo;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables

void limpiar(){
       jtId.setText(null);
       jtNombre.setText(null);
       jtApellido.setText(null);
       jtLegajo.setText(null);
       jtFechaNac.setText(null);
       jtId.requestFocus();
}

}

