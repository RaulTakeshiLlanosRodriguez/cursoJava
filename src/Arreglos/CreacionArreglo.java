/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

/**
 *
 * @author USER
 */
public class CreacionArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeros[] = {1,2,3,4,5};
        
        int arreglo[] = new int[4]; //creando un arreglo
        
        //llenando de valores el arreglo
        arreglo[0] = 1;
        arreglo[1] = 2;
        arreglo[2] = 3;
        arreglo[3] = 4;
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }
    
}
