package universidadgrupo4.modelo;

public class Cursada {
protected int idCursada;
protected Alumno alumno;
protected Materia materia;
protected double nota;

    public Cursada(int idCursada, Alumno alumno, Materia materia, double nota) {
        this.idCursada = idCursada;
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }

    public Cursada(Alumno alumno, Materia materia, double nota) {
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

    public int getIdAlumno() {
        return alumno.getIdAlumno();
    }

    public void setIdAlumno(Alumno idAlumno) {
        this.alumno = idAlumno;
    }

    public int getIdMateria() {
        return materia.getIdMateria();
    }

    public void setIdMateria(Materia idMateria) {
        this.materia = idMateria;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    
}
