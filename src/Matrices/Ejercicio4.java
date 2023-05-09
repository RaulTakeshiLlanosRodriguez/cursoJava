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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int matriz[][];
        int filas, columnas;
        
        filas = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de filas: "));
        columnas = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de columnas: "));
        
        matriz = new int[filas][columnas];
        
        //rellenamos la matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Digite un elemento en la posicion ["+i+"] ["+j+"] : ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        
        //imprimir la matriz
        System.out.println("\nLa matriz es: ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        
        //imprimir los vertices
        System.out.println("");
        System.out.println("El vertice superior izquierdo es: "+matriz[0][0]);
        System.out.println("El vertice superior derecho es: "+matriz[0][matriz[0].length-1]);
        System.out.println("El vertice inferior izquierdo es: "+matriz[matriz.length-1][0]);
        System.out.println("El vertice inferior derechi es: "+matriz[matriz.length-1][matriz[matriz.length-1].length-1]);
    }
    
}
