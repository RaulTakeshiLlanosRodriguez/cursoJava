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
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        boolean esCreciente = false;

        int arreglo1[] = new int[10];
        int arreglo2[] = new int[10];
        int arreglo3[] = new int[20];

        //llenamos el primer arreglo
        System.out.println("Digite los elementos del primer arreglo ");
        do {
            for (int i = 0; i < arreglo1.length; i++) {
                System.out.print("Digite un elemento en la posicion " + i + " :");
                arreglo1[i] = entrada.nextInt();
            }

            //verificamos si el arreglo es creciente
            for (int i = 0; i < 9; i++) {
                if (arreglo1[i] < arreglo1[i + 1]) {
                    esCreciente = true;
                } else {
                    esCreciente = false;
                    break; // termina el ciclo for
                }
            }
            if (esCreciente == false) {
                System.out.println("\nPor favor, vuelva a digitar");
                System.out.println("");
            }
        } while (esCreciente = false);

        //llenamos el segundo arreglo
        System.out.println("");
        System.out.println("Digite los elementos del segundo arreglo ");
        do {
            for (int i = 0; i < arreglo2.length; i++) {
                System.out.print("Digite un elemento en la posicion " + i + " :");
                arreglo2[i] = entrada.nextInt();
            }

            //verificamos si el arreglo es creciente
            for (int i = 0; i < 9; i++) {
                if (arreglo2[i] < arreglo2[i + 1]) {
                    esCreciente = true;
                } else {
                    esCreciente = false;
                    break; // termina el ciclo for
                }
            }
            if (esCreciente == false) {
                System.out.println("\nPor favor, vuelva a digitar");
                System.out.println("");
            }
        } while (esCreciente = false);
        
        //fusionamos los arreglos
        int i=0; //apunta al primer arreglo
        int j=0; //apunta al segundo arreglo
        int k=0; //apunta al tercer arreglo
        
        //llenamos uno de los dos arreglos
        while(i<10 && j<10){
            if(arreglo1[i] < arreglo2[j]){
                arreglo3[k] = arreglo1[i];
                i++;
            }else{
                arreglo3[k] = arreglo2[j];
                j++;
            }
            k++;
        }
        
        if(i == 10){
            while(j<10){
                arreglo3[k] = arreglo2[j];
                j++;
                k++;
            }
        }
        else{
            while(i<10){
                arreglo3[k] = arreglo1[i];
                i++;
                k++;
            }
        }
        
        //mostramos los elementos del tercer arreglo
        System.out.println("");
        System.out.println("El tercer arreglo es: ");
        for (k = 0; k < 20; k++) {
            System.out.println(arreglo3[k]);
        }
    }

}
