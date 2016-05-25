package fiuba.algo3.modelo;

import java.util.Date;
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

    public BolsaDeEventos filtrarPorNombre(String n)
    {
        BolsaDeEventos bolsaFiltrada = new BolsaDeEventos();
        for (Evento e : elementos)
            if (e.estaInvitado(n))
                bolsaFiltrada.agregar(e);
        return bolsaFiltrada;
    }

    public BolsaDeEventos filtrarPorFecha(Date fecha)
    {
        return this;
    }
}
