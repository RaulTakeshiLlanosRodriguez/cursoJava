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
public class MetodoBurbuja {

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
        
        System.out.println("\nEl arreglo actual es: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.println(arreglo[i]+" ");
        }
        
        //metodo burbuja
        
        int aux;
        for (int i = 0; i < (nElementos-1); i++) {
            for (int j = 0; j < (nElementos-1); j++) {
                if(arreglo[j]> arreglo[j+1]){
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }
            }
        }
        
        //imprimir el arreglo ordenado
        System.out.println("\nEl arreglo ordenado es: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.println(arreglo[i]+" ");
        }
    }
    
}
