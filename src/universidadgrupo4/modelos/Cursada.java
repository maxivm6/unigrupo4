package universidadgrupo4.modelos;

public class Cursada {
protected int idCursada;
protected Alumno alumno;
protected Materia materia;
protected float nota;


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

    public void setIdAlumno(Alumno idAlumno) {
        this.alumno = idAlumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setIdMateria(Materia idMateria) {
        this.materia = idMateria;
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
