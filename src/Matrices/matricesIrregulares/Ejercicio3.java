/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matrices.matricesIrregulares;

import java.util.Scanner;

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
        String nombres[] = new String[3];
        int dias[][] = new int[3][];
        
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Digite un nombre: ");
            nombres[i] = entrada.next();
            System.out.println("Digite la cantidad de dias que ha faltado el empleado "+nombres[i]+": ");
            int cantidadFaltas = entrada.nextInt();
            
            dias[i] = new int[cantidadFaltas];
            for (int j = 0; j < dias[i].length; j++) {
                System.out.print("Digite el nro de dia: ");
                dias[i][j] = entrada.nextInt();
            }
            System.out.println("");
        }
        
        //imprimir la cantidad de inasistencias
        System.out.println("");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("El empleado "+nombres[i]+" tiene "+dias[i].length +" faltas");
        }
        
        System.out.println("");
        //calculamos el empleado con menor numero de inasistencias
        String nombre = nombres[0];
        int faltas = dias[0].length;
        
        for (int i = 1; i < nombres.length ; i++) {
            if(dias[i].length< faltas){
                faltas = dias[i].length;
                nombre = nombres[i];
            }
        }
        System.out.println("\nEl empleado con menor nro de faltas es "+nombre+" con "+faltas+" faltas");
    }
    
}
