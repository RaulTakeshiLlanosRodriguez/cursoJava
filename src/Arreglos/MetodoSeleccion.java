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
public class MetodoSeleccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int arreglo[];
        int nElementos;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo: "));
        arreglo = new int[nElementos];
        
        for (int i = 0; i < nElementos; i++) {
            System.out.print("Digite un elemento en la posicion ["+i+"] : ");
            arreglo[i] = entrada.nextInt();
        }
        
        System.out.println("\nEl arreglo desordenado es: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.println(arreglo[i]+" ");
        }
        System.out.println("");
        
        //Metodo de seleccion
        int minimo;
        int aux;
        
        for (int i = 0; i < nElementos; i++) {
            minimo = i;
            for (int j = i+1; j < nElementos ; j++) {
                if(arreglo[j]<arreglo[minimo]){
                    minimo = j;
                }
            }
            aux = arreglo[i];
            arreglo[i] = arreglo[minimo];
            arreglo[minimo] = aux;
        }
        
        //imprimir el arreglo
        System.out.println("\nEl arreglo ordenado es: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.println(arreglo[i]+" ");
        }
    }
    
}
