/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int arreglo[];
        int nElementos;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño del arreglo: "));
        arreglo = new int [nElementos];
        
        for (int i = 0; i < nElementos; i++) {
            System.out.print("Digite un elemento: ");
            arreglo[i] = entrada.nextInt();
           
        }
        
        System.out.println("");
        System.out.println("El arreglo es: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.println(arreglo[i]);
        }
        System.out.println("");
        
        //Invertimos el arreglo
        int aux[] = new int [arreglo.length];
        
        for (int i = arreglo.length-1, j = 0;i>=0; i--,j++) {
            aux[j] = arreglo[i];
        }
        
        System.out.println("");
        System.out.println("El arreglo invertido es: ");
        for (int i = 0; i < aux.length; i++) {
            System.out.println(aux[i]);
        }
    }
    
}
