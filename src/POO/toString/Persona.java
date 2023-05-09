/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.toString;

/**
 *
 * @author USER
 */
public class Persona {
    public static int edad = 14;
    public final static String nombre = "Raul";
    public static double altura =1.70;
    
    @Override
    public String toString(){
        return "edad: "+edad+"\nnombre: "+nombre+"\naltura: "+altura;
    }
    
    public static void main(String[] args) {
        Persona persona = new Persona();
        System.out.println(persona.toString());
    }
}
