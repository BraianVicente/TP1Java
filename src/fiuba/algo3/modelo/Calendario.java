package fiuba.algo3.modelo;

import java.util.List;
import java.util.Set;

import java.util.HashSet;

public class Calendario {

    Set<String> personas = new HashSet();

    public boolean existePersona(String nombre) {
        return personas.contains(nombre);
    }

    public void agregarPersona(String nombre) {
        personas.add(nombre);
    }

    public void agregarEvento(String estudiar_algebra, List<String> invitados, int i, int i0, int i1, int i2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean estaOcupado(String nombre,
        int anio, int mes, int dia, int hora)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void agregarEventoSemanal(String clase_Algebra, int i, List<String> invitados, int anio, int mes, int dia, int hora) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void agregarRecurso(String proyector) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean existeRecurso(String proyector) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
