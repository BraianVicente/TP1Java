package fiuba.algo3.modelo;

import java.util.List;
import java.util.Set;

import java.util.HashSet;

public class Calendario {

    Set<String> personas = new HashSet();
    Set<String> recursos = new HashSet();

    public boolean existePersona(String nombre) {
        return personas.contains(nombre);
    }

    public void agregarPersona(String nombre) {
        personas.add(nombre);
    }

    public void agregarEvento(String nombre, List<String> invitados,
            int anio, int mes, int dia, int hora) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean estaOcupado(String nombre,
        int anio, int mes, int dia, int hora)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void agregarEventoSemanal(String clase_Algebra, int i, List<String> invitados, int anio, int mes, int dia, int hora) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void agregarRecurso(String nombre) {
        recursos.add(nombre);
    }

    public boolean existeRecurso(String nombre) {
        return recursos.contains(nombre);
    }

}
