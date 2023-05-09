package POO.Polimorfismo;

public class Gato extends Animal{

    public Gato(String nombre, int edad, int tamaño) {
        super(nombre, edad, tamaño);
    }

    @Override
    public void realizarSonido() {
        System.out.println("El gato "+nombre+" tiene "+edad+" años y mide "+tamaño);
        System.out.println("El gato dice miau miau miau");
    }
    
    
}
