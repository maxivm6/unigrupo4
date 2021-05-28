package universidadgrupo4.control;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.Date;
import java.util.ArrayList;
import universidadgrupo4.modelos.Alumno;
import universidadgrupo4.modelos.Conexion;

public class AlumnoData {
    private Connection con;
    public AlumnoData(Conexion conexion){
        try{
            con = conexion.getConexion();
        }catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"error de conexion alumnos");
        }
    }
    
    public Alumno buscarAlumno(int id){
        Alumno alumno=null;
        try{
            String sql = "SELECT * FROM alumno WHERE idAlumno=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setFechaNac(rs.getDate("fechNac").toLocalDate());
                alumno.setLegajo(rs.getInt("legajoDni"));
                alumno.setEstado(rs.getBoolean("estado"));
            }
            ps.close();
        }catch(SQLException ex){
           JOptionPane.showMessageDialog(null,"error de conexion alumnoData");
        }
        return alumno;
    }
    public ArrayList<Alumno> obtenerAlumnos(){
        Alumno alumno;
        ArrayList <Alumno> alumnos = new ArrayList(); 
        
        try{
            String sql = "SELECT * FROM alumno";
            PreparedStatement ps = con.prepareStatement(sql);
            
            
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setFechaNac(rs.getDate("fechNac").toLocalDate());
                alumno.setLegajo(rs.getInt("legajoDni"));
                alumno.setEstado(rs.getBoolean("estado"));
                alumnos.add(alumno);
            }
            ps.close();
        }catch(SQLException ex){
           JOptionPane.showMessageDialog(null,"error de conexion alumnoData");
        }
        return alumnos;
    }
    
    public void borrarAlumno(int id){
        
        try{
            String sql="DELETE FROM alumno WHERE idAlumno=?";
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            
            ps.executeUpdate();
            ps.close();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error de conexion");
        }
    }
    
    public void actualizarAlumno(Alumno alumno, int id){
        try{
            String sql = "UPDATE alumno SET legajoDni=?, nombre=?, apellido=?, estado=?, fechNac=? WHERE idAlumno=?";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, alumno.getLegajo());
            ps.setString(2, alumno.getNombre());
            ps.setString(3, alumno.getApellido());
            ps.setBoolean(4, alumno.getEstado());
            ps.setDate(5, Date.valueOf(alumno.getFechNac()));
            ps.setInt(6,id);
            
            ps.executeUpdate();
            
            ps.close();
        }catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
    public void guardarAlumno(Alumno alumno){
         try{
            String sql="INSERT INTO alumno (legajoDni, nombre, apellido, estado, fechNac) VALUES (?,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getLegajo());
            ps.setString(3, alumno.getNombre());
            ps.setString(2, alumno.getApellido());
            ps.setBoolean(4, alumno.getEstado());
            ps.setDate(5, Date.valueOf(alumno.getFechNac()));
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                alumno.setIdAlumno(rs.getInt(1));
            }
            
            ps.close();
        }catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE,null,ex);
        }    
    }
    
    
    
}
