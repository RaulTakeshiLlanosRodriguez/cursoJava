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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int arreglo[];
        int nElementos;
        boolean creciente = false;
        boolean decreciente = false;
        boolean esNegativo = false;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos: "));
        
        //comprobando si el tamaño del arreglo es negativo se cierra la aplicacion
        if(nElementos <0){
            System.out.println("\nNo existe un array con tamaño negativo");
            System.exit(0);// termina la ejecución del programa
        }
        
        arreglo = new int[nElementos];
        
        //llenamos el arreglo
        do{
            for (int i = 0; i < arreglo.length; i++) {
                System.out.print("Digite un elemento en la posicion "+i+" :");
                arreglo[i]= entrada.nextInt();
            }
            
            //recorremos el arreglo para comprobar si hay un negativo
            for (int i = 0; i < arreglo.length; i++) {
                if(arreglo[i]<0){
                    esNegativo=true;
                    break;
                }else{
                    esNegativo= false;
                }
            }
            
            if(esNegativo == true){
                System.out.println("\nPor favor, vuelva a llenar el arreglo porque contiene negativos");
            }
        }while(esNegativo == true);
        
        for (int i = 0; i < (nElementos-1); i++) {
            if(arreglo[i]<arreglo[i+1]){
                creciente = true;
            }else if(arreglo[i]>arreglo[i+1]){
                decreciente =  true;
            }
        }
        if(creciente == true && decreciente == false){
            System.out.println("\nEl arreglo es de forma creciente");
        }
        else if(creciente == false && decreciente == true){
            System.out.println("\nEl arreglo es de forma decreciente");
        }
        else if(creciente == true && decreciente == true){
            System.out.println("\nEl arreglo esta desordenado");
        }
        else{
            System.out.println("\nLos elementos del arreglo son iguales");
        }
    }
    
}
