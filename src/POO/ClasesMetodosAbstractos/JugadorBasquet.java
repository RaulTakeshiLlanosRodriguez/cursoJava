package POO.ClasesMetodosAbstractos;

public class JugadorBasquet extends Jugador {

    public JugadorBasquet(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void jugar() {
        System.out.println("El jugador de basquet " + nombre + " tiene " + edad + " años");
        System.out.println("Esta en el campo saltando con el balon");
    }

}
