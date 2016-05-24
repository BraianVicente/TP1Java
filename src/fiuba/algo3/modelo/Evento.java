package fiuba.algo3.modelo;

import java.util.Date;
import java.util.List;

public class Evento {

    String nombre;
    List<String> nombresDeInvitados;
    Date fecha;

    public Evento(String nom, List<String> invs, Date f) {
        nombre = nom;
        nombresDeInvitados = invs;
        fecha = f;
    }

    public String getNombre()
    {
        return nombre;
    }
}
