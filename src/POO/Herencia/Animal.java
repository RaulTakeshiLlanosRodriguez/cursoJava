
package POO.Herencia;

public class Animal {
    protected String nombre;
    protected int id;
    protected int edad;

    public Animal(String nombre, int id, int edad) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
    }
    
    
    
    public void comer(){
        System.out.println("El animal esta comiendo");
    }
}
