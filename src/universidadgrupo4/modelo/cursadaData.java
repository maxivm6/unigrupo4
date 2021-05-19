package universidadgrupo4.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class cursadaData {

    private Connection con;
    public cursadaData(Conexion conexion) {
        try{
            con = conexion.getConexion();
        }catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"error de conexion");
        }
    }
    
    void guardarMaterias(Cursada cursada){
            
        try {
            String sql = "INSERT INTO cursada (idMateria,nota,idAlumno) VALUES (?,?,?)";
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,cursada.getIdMateria());
            ps.setDouble(2,cursada.getNota());
            ps.setInt(3,cursada.getIdAlumno());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                cursada.setIdCursada(rs.getInt(1));
            }
            ps.close();
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"error de conexion");
        }
            
    }
    
    /*List<Cursada> obtenerCursadas(){
           Cursada cursada; 
           ArrayList<Cursada> cursadas = new ArrayList<>();
            
        try{ 
            String sql = "SELECT * FROM cursada";
            PreparedStatement ps=con.prepareStatement(sql);
            
            ResultSet rs=ps.executeQuery();
                       
            while(rs.next()){
              cursada=new Cursada();
              Materia materia = buscarMateria(rs.getInt("idMateria"));
              cursada.setIdMateria(materia); //Completar con clase cursada
              cursada.setNota(rs.getInt("nota"));
              cursada.setIdAlumno(rs.getInt("idAlumno"));
              cursadas.add(cursada);
            }
                
            ps.close();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error de conexion");
        }
         return cursadas;     
        
    }*/
   
    
    Alumno buscarAlumno(int id) {
        Alumno alumno = null;
        
        
        try {
            String sql = "SELECT * FROM alumno WHERE idAlumno=?";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
              alumno=new Alumno();
              alumno.setIdAlumno(rs.getInt("idAlumno")); //Completar con clase cursada
              alumno.setLegajo(rs.getInt("legajoDni"));
              alumno.setNombre(rs.getString("nombre"));
              alumno.setApellido(rs.getString("apellido"));
              alumno.setEstado(rs.getBoolean("estado"));
              
            }
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error de conexion");
        }
        
        return alumno;
    }    
    
    Materia buscarMateria(int id){                                          //
        Materia materia = null;
        ArrayList<Materia> materias = new ArrayList();
        
        try {
            String sql = "SELECT * FROM materia WHERE idMateria=?";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
              materia=new Materia();
              materia.setIdMateria(rs.getInt("idMateria")); 
              materia.setNombreMateria(rs.getString("nombre"));
              materia.setEstado(rs.getBoolean("estado"));
              materia.setAnio(rs.getInt("año"));
              materias.add(materia);
            }
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error de conexion");
        }
        
        for (Materia item:materias){
            if(item.getIdMateria()==id){
                materia = item;
               
            }
        }
        
        return materia;
    }       
    
    
    /*
     List<Cursada> obtenerCursadasXAlumno(int d){
            String sql = "SELECT * FROM cursada WHERE idAlumno=?";
        return null;
    }
    
    List <Materia> obtenerMateriasCursadas(int id){
        String sql = "SELECT (materia.idMateria,maeria.nombre,maeria.año,materia.estado) FROM inscripion JOIN materia ON idMateria WHERE idAlumno=?";  
        return null;
    }
    List <Materia> obtenerMateriasNOCursadas(int id){
       
            String sql = "SELECT * FROM materia WHERE idMateria NOT IN (SELECT materia.idMateria FROM cursada WHERE idAlumno = ?)";  
   
        
        return null;
    }
    
    void borrarCursadaDeUnaMateriaDeunAlumno (int idAlumno,int idMateria){
        String sql = "DELETE FROM cursada WHERE idAlumno=? AND idMateria=?";
    }
    void actualizarNotaCursada(int idAlumno, int idMateria, int nota){
        String sql = "UPDATE cursada SET nota=? FROM cursada WHERE idAlumno=? AND idMateria=?";
    }
*/

}
