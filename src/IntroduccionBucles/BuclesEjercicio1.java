/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroduccionBucles;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class BuclesEjercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        
        System.out.print("Digite el numero: ");
        numero = entrada.nextInt();
        System.out.println("");
        
        int numero_inicial = 1;
        while(numero_inicial<=numero){
            System.out.println(numero_inicial);
            numero_inicial++;
        }
        
    }
    
}
