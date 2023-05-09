/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.metodos_parametro_argumento;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Edad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Persona persona = new Persona();
        int edad;
        float altura;
        String nombre;
        
        System.out.print("Digite su edad: ");
        edad = entrada.nextInt();
        
        System.out.print("Digite nombre: ");
        nombre = entrada.next();
        
        System.out.print("Digite su altura: ");
        altura = entrada.nextFloat();
        
        persona.comprobarSiEsMayorDeEdad(edad, nombre, altura);
    }
    
}
