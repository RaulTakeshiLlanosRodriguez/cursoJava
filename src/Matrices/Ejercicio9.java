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
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int primeraMatriz[][] = new int[3][3];
        int segundaMatriz[][] = new int[3][3];
        int matrizSuma[][] = new int[3][3];
        int matrizResta[][] = new int[3][3];
        int matrizMultiplicacion[][] = new int[3][3];

        //llenamos la primera matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite un elemento en la posicion [" + i + "] [" + j + "]: ");
                primeraMatriz[i][j] = entrada.nextInt();
            }
        }

        //llenamos la segunda matriz
        System.out.println("");
        System.out.println("Digite los elementos de la segunda matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite un elemento en la posicion [" + i + "] [" + j + "]: ");
                segundaMatriz[i][j] = entrada.nextInt();
            }
        }

        //sumamos las matrices
        for (int i = 0; i < primeraMatriz.length; i++) {
            for (int j = 0; j < segundaMatriz.length; j++) {
                matrizSuma[i][j] = primeraMatriz[i][j] + segundaMatriz[i][j];
            }
        }

        //restamos las matrices
        for (int i = 0; i < primeraMatriz.length; i++) {
            for (int j = 0; j < segundaMatriz.length; j++) {
                matrizResta[i][j] = primeraMatriz[i][j] - segundaMatriz[i][j];
            }
        }

        //multiplicamos las matrices
        for (int i = 0; i < primeraMatriz.length; i++) {
            for (int j = 0; j < segundaMatriz.length; j++) {
                matrizMultiplicacion[i][j] = primeraMatriz[i][j] * segundaMatriz[i][j];
            }
        }

        //imprimir la matriz
        System.out.println("");
        System.out.println("La suma de las matrices: ");
        for (int i = 0; i < primeraMatriz.length; i++) {
            for (int j = 0; j < primeraMatriz.length; j++) {
                System.out.print(" [ " + primeraMatriz[i][j] + " ] ");
            }
            if (i == 1) {
                System.out.print("     +     ");
            } else {
                System.out.print("           ");
            }
            for (int j = 0; j < segundaMatriz.length; j++) {
                System.out.print(" [ " + segundaMatriz[i][j] + " ] ");
            }
            if (i == 1) {
                System.out.print("     =     ");
            } else {
                System.out.print("           ");
            }
            for (int j = 0; j < matrizSuma.length; j++) {
                System.out.print(" [ " + matrizSuma[i][j] + " ] ");
            }
            System.out.println("");
        }
        
         System.out.println("");
        System.out.println("La resta de las matrices: ");
        for (int i = 0; i < primeraMatriz.length; i++) {
            for (int j = 0; j < primeraMatriz.length; j++) {
                System.out.print(" [ " + primeraMatriz[i][j] + " ] ");
            }
            if (i == 1) {
                System.out.print("     -     ");
            } else {
                System.out.print("           ");
            }
            for (int j = 0; j < segundaMatriz.length; j++) {
                System.out.print(" [ " + segundaMatriz[i][j] + " ] ");
            }
            if (i == 1) {
                System.out.print("     =     ");
            } else {
                System.out.print("           ");
            }
            for (int j = 0; j < matrizResta.length; j++) {
                System.out.print(" [ " + matrizResta[i][j] + " ] ");
            }
            System.out.println("");
        }
        
         System.out.println("");
        System.out.println("La multiplicación de las matrices: ");
        for (int i = 0; i < primeraMatriz.length; i++) {
            for (int j = 0; j < primeraMatriz.length; j++) {
                System.out.print(" [ " + primeraMatriz[i][j] + " ] ");
            }
            if (i == 1) {
                System.out.print("     X     ");
            } else {
                System.out.print("           ");
            }
            for (int j = 0; j < segundaMatriz.length; j++) {
                System.out.print(" [ " + segundaMatriz[i][j] + " ] ");
            }
            if (i == 1) {
                System.out.print("     =     ");
            } else {
                System.out.print("           ");
            }
            for (int j = 0; j < matrizResta.length; j++) {
                System.out.print(" [ " + matrizMultiplicacion[i][j] + " ] ");
            }
            System.out.println("");
        }
    }

}
