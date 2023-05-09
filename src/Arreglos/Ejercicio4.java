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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int arreglo[];
        int nElementos;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo: "));
        arreglo = new int[nElementos];
        
        //llenamos el arreglo
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Digite un elemento en la posicion "+i+" :");
            arreglo[i] = entrada.nextInt();
        }
        
        int mayorElemento = arreglo[0];
        int menorElemento = arreglo[0];
        int posicionMayor = 0;
        int posicionMenor = 0;
        
        for (int i = 0; i < arreglo.length; i++) {
            if(mayorElemento< arreglo[i]){
                mayorElemento = arreglo[i];
                posicionMayor = i;
            }
            if(menorElemento> arreglo[i]){
                menorElemento = arreglo[i];
                posicionMenor = i;
            }
        }
        
        System.out.println("");
        System.out.println("El elemento mayor es: "+mayorElemento+" en la posicion "+posicionMayor);
        System.out.println("El elemento menor es: "+menorElemento+" en la poscicion "+posicionMenor);
    }
    
}
