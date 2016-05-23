package fiuba.algo3.modelo;

public class Persona extends Invitado {
    public Persona(String nombre)
    {
        this.nombre = nombre;
    }

    public Boolean estaOcupado()
    {
        return false;
    }
}
