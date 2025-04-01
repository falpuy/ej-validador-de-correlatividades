package domain.integrantes;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {

    @Test
    public void aprobada() {
        Alumno miguelAlvarez = new Alumno("Alvarez","Miguel",2019642);

        List<Materia> listaVacia = new ArrayList<>();

        Materia sYo = new Materia("Sistemas y Organizaciones", listaVacia);
        Materia am1 = new Materia("Analisis Matematico 1", listaVacia);
        Materia matDisc = new Materia("Matematica Discreta", listaVacia);
        Materia ayEd = new Materia("Algoritmos y Estructuras de Datos", listaVacia);
        Materia arqDcomp = new Materia("Arquitectura de Computadores", listaVacia);
        Materia aga = new Materia("Algebra y Geometria Analitica", listaVacia);
        Materia quimica = new Materia("Quimica", listaVacia);
        Materia ingSoc = new Materia("Ingenieria y Sociedad", listaVacia);

        List<Materia> correlativasADS = new ArrayList<>();
        correlativasADS.add(sYo);
        correlativasADS.add(ayEd);

        Materia aDs = new Materia("Analisis de Sistemas", correlativasADS);
        Materia sistRep = new Materia("Sistemas de Representacion", listaVacia);

        List<Materia> correlativasAM2 = new ArrayList<>();
        correlativasAM2.add(am1);
        correlativasAM2.add(aga);

        Materia am2 = new Materia("Analisis Matematico 2", correlativasAM2);

        List<Materia> correlativasSsL = new ArrayList<>();
        correlativasSsL.add(matDisc);
        correlativasSsL.add(ayEd);

        Materia sSL = new Materia("Sintaxis y Semantica de los Lenguajes", correlativasSsL);
        Materia fis1 = new Materia("Fisica 1", listaVacia);

        List<Materia> correlativasPdP = correlativasSsL;

        Materia pDp = new Materia("Paradigmas de Programacion", correlativasPdP);
        Materia ingles1 = new Materia("Ingles 1", listaVacia);

        List<Materia> correlativasPyE = correlativasAM2;

        Materia pYe = new Materia("Probabilidad y Estadistica", correlativasAM2);

        miguelAlvarez.setMateriasAprobadas(correlativasPyE);

        List<Materia> materiasAinscribirse1 = new ArrayList<>();
        materiasAinscribirse1.add(ingles1);
        materiasAinscribirse1.add(fis1);

        List<Materia> materiasAinscribirse2 = new ArrayList<>();
        materiasAinscribirse2.add(sistRep);
        materiasAinscribirse2.add(pYe);

        List<Materia> materiasAinscribirse3 = new ArrayList<>();
        materiasAinscribirse3.add(quimica);
        materiasAinscribirse3.add(sSL);
        materiasAinscribirse3.add(am1);

        Inscripcion primera = new Inscripcion(miguelAlvarez,materiasAinscribirse1);
        Inscripcion segunda = new Inscripcion(miguelAlvarez,materiasAinscribirse2);
        Inscripcion tercera = new Inscripcion(miguelAlvarez,materiasAinscribirse3);

        Assertions.assertSame(true,primera.aprobada());
        Assertions.assertSame(true,segunda.aprobada());
        Assertions.assertSame(false,tercera.aprobada());
    }
}