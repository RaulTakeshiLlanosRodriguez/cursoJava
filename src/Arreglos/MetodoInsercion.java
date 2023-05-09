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
public class MetodoInsercion {

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
        
        //metodo de insercion
        int posicion;
        int aux; 
        
        for (int i = 0; i < nElementos; i++) {
            posicion = i;
            aux = arreglo[i];
            while(posicion>0 && arreglo[posicion-1] > aux){
                arreglo[posicion] = arreglo[posicion-1];
                posicion--;
            }
            arreglo[posicion] = aux;
        }
        
        //imprimir el arreglo ordenado
        System.out.println("\nEl arreglo ordenado es: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.println(arreglo[i]+" ");
        }
    }
    
}
