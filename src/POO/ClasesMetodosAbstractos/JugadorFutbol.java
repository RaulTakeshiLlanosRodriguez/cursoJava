package POO.ClasesMetodosAbstractos;

public class JugadorFutbol extends Jugador {

    public JugadorFutbol(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void jugar() {
        System.out.println("El jugador de futbol " + nombre + " tiene " + edad + " años");
        System.out.println("Este jugador esta en la cancha pateando el balon");
    }

}
