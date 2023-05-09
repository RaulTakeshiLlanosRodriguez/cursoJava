/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matrices;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = new int[3][4];
        
        //rellenamos la matriz 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Digite un elemento en la posicion ["+i+"] ["+j+"] : ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        
        //imprimir la matriz
        System.out.println("");
        System.out.println("La matriz es: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        
        //imprimir la primera fila
        System.out.println("\nLa primera fila: ");
        for (int i = 0; i < 4; i++) {
            System.out.println(matriz[0][i]+"");
        }
        System.out.println("\nLa ultima fila: ");
        for (int i = 0; i < 4; i++) {
            System.out.println(matriz[2][i]+" ");
        }
        
        //imprimir la primera columna
        System.out.println("\nLa primera columna: ");
        for (int i = 0; i < 3; i++) {
            System.out.println(matriz[i][0]+" ");
        }
    }
    
}
