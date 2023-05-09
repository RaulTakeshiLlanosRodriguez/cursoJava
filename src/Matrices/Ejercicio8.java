/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matrices;

import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int matriz[][];
        int filas,columnas;
        
        filas = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de filas: "));
        columnas = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de columnas: "));
        
        matriz = new int[filas][columnas];
        
        //rellenamos la matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = (int) (Math.random()*9);
            }
        }
        
        //imprimir la matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print( matriz[i][j]+" ");
            }
            System.out.println("");
        }
                
    }
    
}
