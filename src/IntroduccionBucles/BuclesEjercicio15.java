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
public class BuclesEjercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int factorial = 1;
        int numero;
        
        System.out.print("Digite un numero: ");
        numero = entrada.nextInt();
        for (int i = numero; i > 0; i--) {
            factorial = factorial*i;
        }
        
        System.out.println("El factorial de "+numero+" es: "+factorial);
    }
    
}
