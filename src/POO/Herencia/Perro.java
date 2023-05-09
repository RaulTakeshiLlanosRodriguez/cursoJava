
package POO.Herencia;


public class Perro extends Animal{
    
    public String colorPelo;
    
    public Perro(String nombre, int id, int edad) {
        super(nombre, id, edad);
    }
    @Override
    public void comer(){
        System.out.println("El perro come ricocan");
        System.out.println("El nombre del p es: "+nombre);
        System.out.println("El id de la nutria es: "+id);
        System.out.println("La edad de la nutria es: "+edad);
    }
    public void ladrar(){
        System.out.println("El perro esta ladrando");
    }
    
}
