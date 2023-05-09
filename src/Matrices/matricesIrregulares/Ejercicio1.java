/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matrices.matricesIrregulares;

import java.util.Scanner;
import javax.swing.JOptionPane;

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
        int filas;
        int matrizIrregular[][];
        
        
        filas = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de filas: "));
        matrizIrregular = new int[filas][];
        
        //rellenamos la matriz irregular
        for (int i = 0; i < matrizIrregular.length; i++) {
            System.out.print("Digite la cantidad de elementos para la fila "+i+" : ");
            int columnas = entrada.nextInt();
            matrizIrregular[i] = new int[columnas];
            for (int j = 0; j < matrizIrregular[i].length; j++) {
                System.out.print("Digite un elemento en la posicion ["+i+"] ["+j+"]: ");
                matrizIrregular[i][j] = entrada.nextInt();
            }
        }
        
        System.out.println("");
        
        //imprimir la matriz
        System.out.println("La matriz irregular es: ");
        for (int i = 0; i < matrizIrregular.length; i++) {
            for (int j = 0; j < matrizIrregular[i].length; j++) {
                System.out.print( matrizIrregular[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
