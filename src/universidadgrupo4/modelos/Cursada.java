package universidadgrupo4.modelos;

public class Cursada {
protected Integer idCursada=null;
protected Alumno alumno;
protected Materia materia;
protected float nota;
protected int idAlumno=0;
protected int idMateria=0;


    public Cursada(int idCursada, Alumno alumno, Materia materia, float nota) {
        this.idCursada = idCursada;
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }

    public Cursada(Alumno alumno, Materia materia, float nota) {
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }

    public Cursada() {
    }
    
    public void setAlumno(Alumno alumno){
        this.alumno=alumno;
    }
    
    public void setMateria(Materia materia){
        this.materia=materia;
    }

    public int getIdCursada() {
        return idCursada;
    }

    public void setIdCursada(int idCursada) {
        this.idCursada = idCursada;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setIdAlumno(Alumno alumno) {
        this.idAlumno = alumno.getIdAlumno();
    }

    public Materia getMateria() {
        return materia;
    }

    public void setIdMateria(Materia materia) {
        this.idMateria = materia.getIdMateria();
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "idCursada=" + idCursada + ", alumno=" + alumno + ", materia=" + materia + ", nota=" + nota;
    }
    
}
