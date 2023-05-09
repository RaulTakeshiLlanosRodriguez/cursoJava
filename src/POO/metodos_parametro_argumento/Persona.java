/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.metodos_parametro_argumento;

/**
 *
 * @author USER
 */
public class Persona {
    
    public void comprobarSiEsMayorDeEdad(int edad, String nombre, float altura){
        if(edad >=18){
            System.out.println("El ciudadano "+nombre+" es mayor de edad, cuenta con una altura de: "+altura);
        }else{
             System.out.println("El ciudadano "+nombre+" no es mayor de edad, cuenta con una altura de: "+altura);
        }
    }
}
