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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[5];
        int valor;        
        //Llenamos el arreglo
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Digite un elemento en la posicion "+i+" :");
            arreglo[i] = entrada.nextInt();  
        }
        
        //imprimir el arreglo
        System.out.println("");
        System.out.println("El arreglo es: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }
    
}
