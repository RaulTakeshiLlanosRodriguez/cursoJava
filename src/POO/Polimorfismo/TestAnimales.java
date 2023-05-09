package POO.Polimorfismo;

public class TestAnimales {

    public static void main(String[] args) {
        Animal perro = new Perro("Boby", 5, 1);
        perro.realizarSonido();
        System.out.println("");
        Animal gato = new Gato("Pelusa", 6, 1);
        gato.realizarSonido();
        System.out.println("");
        Animal loro = new Loro("Pika", 4, 1);
        loro.realizarSonido();
    }

}
