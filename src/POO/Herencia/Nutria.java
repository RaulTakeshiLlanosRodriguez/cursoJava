
package POO.Herencia;

public class Nutria extends Animal{

    public Nutria(String nombre, int id, int edad) {
        super(nombre, id, edad);
    }
    
    @Override //hace referencia a que voy a transcribir un metodo de la clase padre
    public void comer(){
        System.out.println("La nutria come peces");
        System.out.println("El nombre la nutria es: "+nombre);
        System.out.println("El id de la nutria es: "+id);
        System.out.println("La edad de la nutria es: "+edad);
    }
}
