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
public class CreacionMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //primera forma
        int matriz[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        
        //segunda forma
        Scanner entrada = new Scanner(System.in);
        float matriz1[][] = new float[4][3];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite un elemento en la posicion ["+i+"] ["+j+"] : ");
                matriz1[i][j] = entrada.nextFloat();
            }
        }
        //for para las filas
        System.out.println("\nLa matriz es: ");
        for (int i = 0; i < 4; i++) {
            //for para las columnas
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz1[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
