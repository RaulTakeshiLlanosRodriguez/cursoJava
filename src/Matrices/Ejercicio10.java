/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matrices;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int filas, columnas;
        int matriz[][];
        
        filas = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de filas: "));
        columnas = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de columnas: "));
        
        matriz = new int[filas][columnas];
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Digite un elemento en la posicion ["+i+"] ["+j+"] : ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        
        System.out.println("");
        System.out.println("La matriz es: ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        
        //sumamos cada fila y columna de la matriz
        int sumaFila, sumaColumna;
        
        for (int i = 0; i < filas; i++) {
            sumaFila = 0;
            for (int j = 0; j < columnas; j++) {
                sumaFila = sumaFila + matriz[i][j];
            }
            System.out.println("La suma de la fila "+i+" es: "+sumaFila);
        }
        System.out.println("");
        for (int i = 0; i < columnas; i++) {
            sumaColumna = 0;
            for (int j = 0; j < filas; j++) {
                sumaColumna = sumaColumna + matriz[j][i];
            }
            System.out.println("La suma de la columna "+i+" es: "+sumaColumna);
        }
    }
    
}
