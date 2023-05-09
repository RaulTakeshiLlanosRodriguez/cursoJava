package POO.ClasesMetodosAbstractos;

public abstract class Jugador {

    protected String nombre;
    protected int edad;

    public Jugador(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //creamos el metodo abstracto
    public abstract void jugar();
}
