package universidadgrupo4.control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import universidadgrupo4.modelos.Alumno;
import universidadgrupo4.modelos.Conexion;
import universidadgrupo4.modelos.Cursada;
import universidadgrupo4.modelos.Materia;


public class CursadaData {

    private Connection con;
    private Conexion aux;
    
    public CursadaData(Conexion conexion) {
        try{
            con = conexion.getConexion();
            this.aux=conexion;
        }catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"error de conexion");
        }
    }
    
    public void guardarCursada(Cursada cursada){
            
        try {
            String sql = "INSERT INTO cursada (idMateria,nota,idAlumno) VALUES (?,?,?)";
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1,cursada.getMateria().getIdMateria());
            ps.setDouble(2,cursada.getNota());
            ps.setInt(3,cursada.getAlumno().getIdAlumno());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                cursada.setIdCursada(rs.getInt(1));
            }
            ps.close();
        }
        
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"error de conexion cursadaData");
        }
            
    }
    
    public List<Cursada> obtenerCursadas(){
           Cursada cursada; 
           ArrayList<Cursada> cursadas = new ArrayList<>();
            
        try{ 
            String sql = "SELECT * FROM cursada";
            PreparedStatement ps=con.prepareStatement(sql);
            
            ResultSet rs=ps.executeQuery();
                       
            while(rs.next()){
              cursada=new Cursada();
              Materia m = buscarMateria(rs.getInt("idMateria"));
              cursada.setMateria(m);
              cursada.setIdMateria(m); 
              cursada.setNota(rs.getInt("nota"));
              Alumno a = buscarAlumno(rs.getInt("IdAlumno"));
              cursada.setAlumno(a);
              cursada.setIdAlumno(a);
              cursadas.add(cursada);
            }
                
            ps.close();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error de conexion");
        }
         return cursadas;     
        
    }
   
    
    public Alumno buscarAlumno(int id){
        AlumnoData ad = new AlumnoData(aux);
        return ad.obtenerAlumno(id);
        
    }
    
    public Materia buscarMateria(int id){
         MateriaData md = new MateriaData(aux); 
         return md.buscarMateria(id);
    }
    
    
    
    public List<Materia> obtenerCursadasXAlumno(int idAlumno){ 
           ArrayList<Materia> materias = new ArrayList<>();
           Materia materia; 
        try{ 
            String sql = "SELECT materia.idMateria,materia.nombre,materia.año,materia.estado "
            + "FROM cursada,materia WHERE materia.idMateria=cursada.idMateria AND cursada.idAlumno=?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            
            ResultSet rs=ps.executeQuery();
                       
            while(rs.next()){
                Materia mat = new Materia();              
              
              mat.setIdMateria(rs.getInt("idMateria")); 
              mat.setNombreMateria(rs.getString("nombre"));
              mat.setAnio(rs.getInt("año"));
              mat.setEstado(rs.getBoolean("estado"));
              materias.add(mat);
            }
                
            ps.close();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error de conexion");
        }
         return materias;     
    }
    
    
    
    public List <Alumno> obtenerAlumnosXMateria(int idMateria){
            ArrayList<Alumno> alumnos = new ArrayList<>();
            Alumno alumno; 
        try{ 
            String sql = "SELECT alumno.idAlumno,alumno.nombre,alumno.apellido,alumno.estado,alumno.legajoDni,alumno.fechNac "
            + "FROM cursada,alumno WHERE alumno.idAlumno=cursada.idAlumno AND cursada.idMateria=?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            
            ResultSet rs=ps.executeQuery();
                       
            while(rs.next()){
              Alumno al = new Alumno();              
              
              al.setIdAlumno(rs.getInt("idAlumno")); 
              al.setNombre(rs.getString("nombre"));
              al.setApellido(rs.getString("apellido"));
              al.setEstado(rs.getBoolean("estado"));
              al.setLegajo(rs.getInt("legajoDni"));
              al.setFechaNac(rs.getDate("fechNac").toLocalDate());
              alumnos.add(al);
            }
                
            ps.close();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error de conexion");
        }
         return alumnos;    
    }
    
     
     
    public List <Materia> obtenerMateriasNOCursadas(int idAlumno){
        ArrayList<Materia> materias = new ArrayList(); 
        try{    
            String sql = "SELECT * FROM materia WHERE idMateria NOT IN (SELECT materia.idMateria FROM cursada WHERE idAlumno = ?)";  
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            
            ResultSet rs=ps.executeQuery();
                       
            while(rs.next()){
              Materia mat = new Materia();              
              
              mat.setIdMateria(rs.getInt("idMateria")); 
              mat.setNombreMateria(rs.getString("nombre"));
              mat.setAnio(rs.getInt("año"));
              mat.setEstado(rs.getBoolean("estado"));
              materias.add(mat);
            }
                
            ps.close();
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error de conexion");
        }
         return materias;  
    }
    
     
    public void borrarCursadaMateriaDeunAlumno (int idAlumno,int idMateria){
        try{
            String sql = "DELETE FROM cursada WHERE idAlumno=? AND idMateria=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            ps.executeUpdate();
            ps.close();
        }catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Error al Borrar: "+ex.getMessage());
        }
    }
    
    public void actualizarNotaCursada(int idAlumno, int idMateria,float nota){
        try{
            String sql = "UPDATE cursada SET nota=? WHERE idAlumno=? AND idMateria=?;";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(3,idMateria);
            ps.setFloat(1, nota);          
            ps.setInt(2, idAlumno);
            ps.executeUpdate();
            ps.close();
        }catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Error al actualizar: "+ex.getMessage());
        }
    }


}
