package fiuba.algo3.modelo;

public abstract class Invitado {
    String nombre;
    
    public abstract Boolean estaOcupado();
    
    public String getNombre()
    {
        return nombre;
    }
}
