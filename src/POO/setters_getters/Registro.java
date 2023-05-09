/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.setters_getters;

/**
 *
 * @author USER
 */
public class Registro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona persona = new Persona();
        persona.setNombre("Takeshi");
        persona.setEdad(22);
        persona.setAltura(1.70);
        
        System.out.println("El nombre es: "+persona.getNombre());
        System.out.println("La edad es: "+persona.getEdad());
        System.out.println("La altura es: "+persona.getAltura());
        
    }
    
}
