/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matrices.matricesIrregulares;

/**
 *
 * @author USER
 */
public class CreacionMatrizIrregular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int matriz[][] = new int[3][];
        
        matriz[0] = new int[2];
        matriz[1] = new int[4];
        matriz[2] = new int[6];
        
        System.out.println("La cantidad de columnas que tiene fila 0 es: "+matriz[0].length);
        System.out.println("La cantidad de columnas que tiene fila 1 es: "+matriz[1].length);
        System.out.println("La cantidad de columnas que tiene fila 2 es: "+matriz[2].length);
    }
    
}
