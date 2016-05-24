package fiuba.algo3.modelo;

import java.util.Set;
import java.util.HashSet;

public class BolsaDeEventos {

    private Set<Evento> elementos = new HashSet<Evento>();

    public Boolean estaVacia()
    {
        return elementos.isEmpty();
    }

    public void agregar(Evento e)
    {
        elementos.add(e);
    }
}
