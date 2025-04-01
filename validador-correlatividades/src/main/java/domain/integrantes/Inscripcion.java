package domain.integrantes;

import java.util.ArrayList;
import java.util.List;

public class Inscripcion {
    private List<Materia> materiasElegidas;
    private Alumno alumnoSolicitante;
    public boolean aprobada() {
        List<Boolean> aceptacionesYfallos = new ArrayList<>();
        this.materiasElegidas.forEach( (asignatura) -> {
            boolean resultado = this.alumnoSolicitante.getMateriasAprobadas().containsAll(asignatura.getMateriasCorrelativas());
            aceptacionesYfallos.add(resultado);
        } );
        return !aceptacionesYfallos.contains(false);
    }
}