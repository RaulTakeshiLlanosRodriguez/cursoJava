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
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[];
        int nElementos;
        int elementoBucar;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño del arreglo: "));
        arreglo = new int[nElementos];
        
        for (int i = 0; i < nElementos; i++) {
            System.out.println("Digite un elemento en la posicion ["+i+"] :");
            arreglo[i] = entrada.nextInt();
        }
        
        System.out.println("");
        System.out.println("El arreglo es: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.println(arreglo[i]);
        }
        
        System.out.println("");
        
        System.out.print("Digite el elemento a buscar: ");
        elementoBucar = entrada.nextInt();
        
        System.out.println("");
        
        int i=0;
        boolean encontrado = false;
        
        while(i < nElementos && encontrado == false){
            if(arreglo[i] == elementoBucar){
                encontrado = true;
            }
            i++;
        }
        
        if(encontrado == false){
            System.out.println("\nElemento no encontrado en el array");
        }else{
            System.out.println("Elemento encontrado en la posicion "+(i-1));
        }
    }
    
}
