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
public class Ejercicio2 {

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
                System.out.println("Digite un elemento en la posicion ["+i+"] ["+j+"]: ");
                matriz[i][j]= entrada.nextInt();
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
        
        //hallamos el elemento mayor de la matriz
        int elementoMayor = matriz[0][0];
        int posicionFila = 0;
        int posicionColumna = 0;
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if(matriz[i][j]> elementoMayor){
                    elementoMayor = matriz[i][j];
                    posicionFila = i;
                    posicionColumna = j;
                }
            }
        }
        
        //mostramos el elemento mayor y sus posiciones
        System.out.println("");
        System.out.println("El elemento mayor es: "+elementoMayor+" la fila en la que ubica es "+posicionFila+" y la columna es "+posicionColumna);
    }
    
}
