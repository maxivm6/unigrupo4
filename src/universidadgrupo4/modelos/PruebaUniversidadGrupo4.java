/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo4.modelos;

import universidadgrupo4.control.MateriaData;
import universidadgrupo4.control.AlumnoData;
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
        
        
        Alumno b= new Alumno(28043266,"Jorge","Berro",fecha,false);
        Alumno j= new Alumno(28043288,"Daniel","Richieri",fecha,true);
        AlumnoData aD=new AlumnoData(conexion);
        
        aD.actualizarAlumno(b, 26);
        aD.actualizarAlumno(j, 25);
        
        aD.guardarAlumno(j);
        Materia m1=new Materia ("LAB II",3,false);
        Materia m2=new Materia ("Ingles II",1,false);
        Materia m3=new Materia ("Matematicas I",1,true);
        Materia m4=new Materia ("Eda I",1,true);
        
        MateriaData am=new MateriaData(conexion);
        am.guardarMateria(m1);
        am.guardarMateria(m4);
        
        am.actualizarMateria(m1, 21);
        am.actualizarMateria(m2, 22);
        am.actualizarMateria(m3, 23);
        am.actualizarMateria(m4, 24);

        
        //Cursada c = new Cursada(b,m3,8);
        //cursadaData cd = new cursadaData(conexion);
        //cd.guardarCursada(c);
        
        
        
        
        
        
        //System.out.println(aD.borrarAlumno(26));
        
        
    }
    
}