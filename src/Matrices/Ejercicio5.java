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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = new int[4][4];
        
        //rellenamos la matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Digite un elemento en la posicion ["+i+"] ["+j+"] : ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        
        //imprimir la matriz
        System.out.println("");
        System.out.println("La matriz es: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        
        //imprimir la diagonal
        System.out.println("");
        System.out.println("La diagonal principal es: ");
        for (int k = 0; k < 4; k++) {
            System.out.println(matriz[k][k]+" ");
        }
    }
    
}
