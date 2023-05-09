/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[];
        int nElementos;
        int contadorPositivos =0;
        int contadorNegativos=0;
        int contadorCeros = 0;
        System.out.print("Digite la cantidad de elementos del arreglo: ");
        nElementos = entrada.nextInt();
        
        arreglo = new int[nElementos];
        System.out.println("");
        for (int i = 0; i < nElementos; i++) {
            System.out.println("Digite un elemento "+i+" :");
            arreglo[i] = entrada.nextInt();
            
            if(arreglo[i]>0){
                contadorPositivos++;
            }else if(arreglo[i]<0){
                contadorNegativos++;
            }else{
                contadorCeros++;
            }
        }
        System.out.println("");
        
        int arregloPositivos[] = new int[contadorPositivos];
        int arregloNegativos[] = new int[contadorNegativos];
        
        contadorPositivos = 0;
        contadorNegativos = 0;
        
        for (int i = 0; i < nElementos; i++) {
            if(arreglo[i]>0){
                arregloPositivos[contadorPositivos] = arreglo[i];
                contadorPositivos++;
            }else if(arreglo[i]<0){
                arregloNegativos[contadorNegativos] = arreglo[i];
                contadorNegativos++;
            }
        }
        System.out.println("");
        
        System.out.println("El arreglo de positivos es: ");
        for (int i = 0; i < contadorPositivos; i++) {
            System.out.println(arregloPositivos[i]);
        }
        
        System.out.println("");
        System.out.println("El arreglo de negativos es: ");
        for (int i = 0; i < contadorNegativos; i++) {
            System.out.println(arregloNegativos[i]);
        }
        
        System.out.println("");
        System.out.println("La cantidad de ceros en el arreglo es: "+contadorCeros);
    }
    
}
