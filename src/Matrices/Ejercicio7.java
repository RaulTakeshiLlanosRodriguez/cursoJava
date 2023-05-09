/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matrices;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        //creamos el arreglo para guardar los nombres de empleados
        String nombres[] = new String[4];
        //creamos la matriz para guardar los sueldos de empleados
        int sueldos[][] = new int[4][3];
        //creamos el arreglo para guardar los sueldos totales de cada empleado
        int sueldosTotales[] = new int[4];
        
        
        //rellenamos los nombres y los sueldos
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Digite el nombre del empleado: ");
            nombres[i] = entrada.next();
            
            //creamos un segundo for para guardar los sueldos
            for (int j = 0; j < sueldos[i].length; j++) {
                System.out.print("Digite el sueldo del empleado "+nombres[i]+" : ");
                sueldos[i][j] = entrada.nextInt();
            }
            
            System.out.println("");
        }
        
        //calculamos la suma de los sueldos de cada empleado
        for (int i = 0; i < sueldosTotales.length; i++) {
            int sumaSueldos =0;
            for (int j = 0; j < sueldos[i].length; j++) {
                sumaSueldos = sumaSueldos + sueldos[i][j];
            }
            sueldosTotales[i] = sumaSueldos;
        }
        
        //imprimir los sueldos y nombres de cada empleado
        System.out.println("");
        System.out.println("Los sueldos totales de los empleados son: ");
        for (int i = 0; i < sueldosTotales.length; i++) {
            System.out.println("El sueldo del empleado "+nombres[i]+" es: "+sueldosTotales[i]);
        }
        
        System.out.println("");
        //hallamos el nombre del empleado con mayor sueldo
        int sueldoMayor = sueldosTotales[0];
        String nombreEmpleadoSueldoMayor = nombres[0];
        
        for (int e = 0; e < sueldosTotales.length; e++) {
            if(sueldosTotales[e]>sueldoMayor){
                sueldoMayor = sueldosTotales[e];
                nombreEmpleadoSueldoMayor = nombres[e];
            }
        }
        
        //mostramos el sueldo y nombre del empleado
        System.out.println("El empleado con mayor sueldo es: "+nombreEmpleadoSueldoMayor+" con un total de "+sueldoMayor+" soles");
    }
    
}
