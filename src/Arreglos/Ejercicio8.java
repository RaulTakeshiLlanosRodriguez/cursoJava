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
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        int posicionEliminar;
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Digite un numero en la posicion "+i+" :");
            arreglo[i] = entrada.nextInt();
        }
        
        //mostramos el arreglo antes de eliminar un elemento
        System.out.println("\nEl arreglo es: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]+" en la posicion "+i);
        }
        
        System.out.print("\nDigite la posicion del arreglo a eliminar: ");
        posicionEliminar = entrada.nextInt();
        
        for (int i = posicionEliminar; i < 9; i++) {
            arreglo[i] = arreglo[i+1];
        }
         System.out.println("\nEl arreglo actual es: ");
        for (int i = 0; i < 9; i++) {
            System.out.println(arreglo[i]+" en la posicion "+i);
        }
    }
    
}
