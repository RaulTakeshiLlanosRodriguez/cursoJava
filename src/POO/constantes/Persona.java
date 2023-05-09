/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.constantes;

/**
 *
 * @author USER
 */
public class Persona {
    
    private int edad = 14;
    private final String nombre = "Raul"; //es una constante
    
    public void saludar(){
        edad = 15;
        System.out.println("Hola mi nombre es "+nombre+", mi edad es "+edad);
    }
}
