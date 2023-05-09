/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.modificadoresAcceso;

/**
 *
 * @author USER
 */
public class Modificadores {

    int edad;
    String nombre;
    
    //el constructor siempre es public
    public Modificadores(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    /*
    private void hablar(){
        System.out.println("Hola, estoy hablando GAA");
    }
    
    //private permite usar en otros metodos de la misma clase
    public void saludar(){
        hablar();
    }
     */
    
    public void describir(){
        System.out.println("El alumno "+nombre+" tiene "+edad+" años");
    }
}
