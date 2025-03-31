package domain.integrantes;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private List<Materia> materiasCursadas;
    private List<Materia> materiasAprobadas;
    private String nombreAlumno;
    private String apellidoAlumno;
    private Integer legajo;

    public Alumno(String nombreAlumno, String apellidoAlumno, Integer legajo) {
        this.nombreAlumno = nombreAlumno;
        this.apellidoAlumno = apellidoAlumno;
        this.legajo = legajo;
        this.materiasCursadas = new ArrayList<>();
        this.materiasAprobadas = new ArrayList<>();
    }

    public List<Materia> getMateriasCursadas() {
        return materiasCursadas;
    }

    public void setMateriasCursadas(List<Materia> materiasCursadas) {
        this.materiasCursadas = materiasCursadas;
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(List<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public String getApellidoAlumno() {
        return apellidoAlumno;
    }

    public Integer getLegajo() {
        return legajo;
    }
}
