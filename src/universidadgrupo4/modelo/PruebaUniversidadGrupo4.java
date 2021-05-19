/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo4.modelo;

import java.time.LocalDate;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class PruebaUniversidadGrupo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexion conexion = null;
        try{
          conexion = new Conexion("jdbc:mysql://localhost/universidadgrupo4", "root", "");
        } catch (ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Error de driver");
        }
        LocalDate fecha=LocalDate.of(2020,2,12);
        
        
        Alumno b= new Alumno(488,"Godoy","Marianela",fecha,true);
        AlumnoData aD=new AlumnoData(conexion);                
        
//        Materia m1=new Materia ("LAB II",3,true);
        Materia m2=new Materia ("Ingles II",1,false);
//        Materia m3=new Materia ("Matematicas I",1,true);
        MateriaData am=new MateriaData(conexion);

        
//        Cursada c = new Cursada(b,m2,8);
//        cursadaData cd = new cursadaData(conexion);
//        
        
        am.actualizarMateria(m2, 23);
        
        
        //System.out.println(aD.borrarAlumno(26));
        
        
    }
    
}