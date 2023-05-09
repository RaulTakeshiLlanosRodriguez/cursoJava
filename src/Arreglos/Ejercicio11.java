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
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int a[] = new int[12];
        int b[] = new int[12];
        int c[] = new int[24];
        
        //llenamos el primer arreglo
        System.out.println("Digite el primer arreglo");
        for (int i = 0; i < a.length; i++) {
            System.out.print("Digite un elemento del arreglo en la posicion ["+i+"] :");
            a[i] = entrada.nextInt();
        }
        
        //llenamos el segundo arreglo
        System.out.println("");
        System.out.println("Digite el segundo arreglo");
        for (int i = 0; i < b.length; i++) {
            System.out.print("Digite un elemento del arreglo en la posicion ["+i+"] :");
            b[i] = entrada.nextInt();
        }
        
        //mezclamos los arreglos
        int i=0; // recorre los arreglos a y b
        int j=0; // recorre el tercer arreglo
        
        while(i<12){
            for (int k = 0; k < 3; k++) {
                c[j] = a[i+k];
                j++;
            }
            for (int k = 0; k < 3; k++) {
                c[j] = b[i+k];
                j++;
            }
            
            i +=3;
        }
        
        System.out.println("");
        System.out.println("Los elementos del tercer arreglo son: ");
        //mostramos el tercer arreglo
        for (j = 0; j < 24; j++) {
            System.out.println(c[j]);
        }
    }
    
}
