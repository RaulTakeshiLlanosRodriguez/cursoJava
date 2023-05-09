package POO.ClasesMetodosAbstractos;

public class TestJugadores {

    public static void main(String[] args) {
        JugadorFutbol jugadorFutbol = new JugadorFutbol("Messi", 35);
        jugadorFutbol.jugar();
        
        System.out.println("");
        
        JugadorBasquet jugadorBasquet = new JugadorBasquet("Michael Jordan", 50);
        jugadorBasquet.jugar();
    }

}
