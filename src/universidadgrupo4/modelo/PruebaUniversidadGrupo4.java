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
        Alumno a= new Alumno(4483713,"Mario","Sosa",fecha,true);
        AlumnoData aD=new AlumnoData(conexion);
        //aD.guardarAlumno(a);
        //List<Alumno> alumnos = aD.obtenerAlumno();
        //System.out.println(alumnos.toString());
        
        
        Materia m=new Materia ("LAB I",1,true);
        MateriaData am=new MateriaData(conexion);
//        System.out.println(am.buscarMateria(6));

        Cursada c = new Cursada(a,m,8);
        cursadaData cd = new cursadaData(conexion);
        //cd.guardarMaterias(c);
        System.out.println(cd.buscarMateria(5));
        
        
    }
    
}