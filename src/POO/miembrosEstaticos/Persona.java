/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.miembrosEstaticos;

/**
 *
 * @author USER
 */
public class Persona {
    
    //atributos o metodos estaticos pertenecen a la clase, no a los objetos
    public static int edad;
    public static final String nombre = "Raul Llanos";
    public static final int id = 12345;
    public static double altura;
    
    public static void saludar(){
        System.out.println("Hola..");
        System.out.println("Mi nombre es: "+nombre);
        System.out.println("Mi edad es: "+edad);
        System.out.println("Mi id es: "+id);
        System.out.println("Mi altura es: "+altura);
    }
}
