/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo4.control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import universidadgrupo4.modelos.Conexion;
import universidadgrupo4.modelos.Materia;

/**
 *
 * @author martin.flores
 */
public class MateriaData {
    
    private Connection con;
    public MateriaData(Conexion conexion){
        try{
            con = conexion.getConexion();
        }catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"error de conexion");
        }
    }
     public void desactivarMateria(int id){
        
        try{
            String sql="UPDATE materia SET estado=false WHERE idMateria=?";
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            
            ps.executeUpdate();
            ps.close();
        }catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"error de conexion");
        }
    }
     public void guardarMateria(Materia materia){
         try{
            String sql="INSERT INTO materia (nombre, año, estado) VALUES (?,?,?)";
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
   
            ps.setString(1, materia.getNombreMateria());
            ps.setInt(2,materia.getAnio());
            ps.setBoolean(3, materia.getEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                materia.setIdMateria(rs.getInt(1));
            }
            
            ps.close();
        }catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"error al cargar materia");
        } 
     }
      public void actualizarMateria(Materia materia,int id){
        try{
            String sql="UPDATE materia SET nombre=?, año=?, estado=? WHERE idMateria=?";
            PreparedStatement ps=con.prepareStatement(sql);
            
            ps.setString(1, materia.getNombreMateria());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.getEstado());
            ps.setInt(4,id);
            ps.executeUpdate();
            
            ps.close();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error al actualizar");
        }
    }
      public Materia buscarMateria(int id){
           Materia materia=null; 
            
          try{ 
            String sql="SELECT * FROM  materia WHERE idMateria=?";
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, id);
            
            ResultSet rs=ps.executeQuery();
           
            
            while(rs.next()){
              materia=new Materia();
              materia.setNombreMateria(rs.getString("nombre"));
              materia.setIdMateria((rs.getInt("idMateria")));
              materia.setEstado(rs.getBoolean("estado"));
              materia.setAnio(rs.getInt("año"));
            }
                
            
            ps.close();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error de conexion");
        }
         return materia; 
    }
      public ArrayList<Materia> obtenerMaterias(int id){
           Materia materia=null;
           ArrayList materias = new ArrayList();
            
          try{ 
            String sql="SELECT * FROM  materia WHERE idMateria=?";
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, id);
            
            ResultSet rs=ps.executeQuery();
           
            
            while(rs.next()){
              materia=new Materia();
              materia.setNombreMateria(rs.getString("nombre"));
              materia.setIdMateria((rs.getInt("idMateria")));
              materia.setEstado(rs.getBoolean("estado"));
              materia.setAnio(rs.getInt("año"));
              materias.add(materia);
            }
                
            
            ps.close();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error de conexion");
        }
         return materias; 
    }
          
}
