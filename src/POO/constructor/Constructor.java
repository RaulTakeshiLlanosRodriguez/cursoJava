/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.constructor;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Constructor {
    
    int arreglo[];
    
    public Constructor(int nElementos){
        Scanner entrada = new Scanner(System.in);
        arreglo = new int[nElementos];
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Digite un elemento: ");
            arreglo[i] = entrada.nextInt();
        }
    }
    
    public void imprimir(){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Valor: "+arreglo[i]);
        }
    }
}
