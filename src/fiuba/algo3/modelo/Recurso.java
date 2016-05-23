package fiuba.algo3.modelo;

public class Recurso extends Invitado {
    public Recurso(String nombre)
    {
        this.nombre = nombre;
    }

    public Boolean estaOcupado()
    {
        return false;
    }
}
