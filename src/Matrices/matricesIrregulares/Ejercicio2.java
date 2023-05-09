/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matrices.matricesIrregulares;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int matrizIrregular[][] = new int[5][];
        
        System.out.println("Rellene la matriz: ");
        for (int i = 0; i < matrizIrregular.length; i++) {
            matrizIrregular[i] = new int[i+1];
            for (int j = 0; j < matrizIrregular[i].length; j++) {
                System.out.print("Digite un elemento de la fila ["+i+"]: ");
                matrizIrregular[i][j] = entrada.nextInt();
            }
        }
        
        System.out.println("");
        System.out.println("La matriz irregular es: ");
        for (int i = 0; i < matrizIrregular.length; i++) {
            for (int j = 0; j < matrizIrregular[i].length; j++) {
                System.out.print(matrizIrregular[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
