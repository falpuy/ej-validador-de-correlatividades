package domain.integrantes;

import java.util.List;

public class Materia {
    private List<Materia> materiasCorrelativas;
    private Integer calificacion;
    private String nombreMateria;

    public Materia(String nombreMateria, List<Materia> materiasCorrelativas) {
        this.nombreMateria = nombreMateria;
        this.materiasCorrelativas = materiasCorrelativas;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public List<Materia> getMateriasCorrelativas() {
        return materiasCorrelativas;
    }

    public Integer getCalificacion() {
        return calificacion;
    }
}
