/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String personas[] = new String[5];
        int edades[] = new int [5];
        
        for (int i = 0; i < personas.length; i++) {
            System.out.print("Digite el nombre de una persona: ");
            personas[i] = entrada.next();
            System.out.print("Digite la edad de la persona: ");
            edades[i] = entrada.nextInt();
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("\nLas personas mayores de edad son: ");
        for (int i = 0; i < personas.length; i++) {
            if(edades[i]>=18){
                System.out.println(personas[i]);
            }
        }
    }
    
}
