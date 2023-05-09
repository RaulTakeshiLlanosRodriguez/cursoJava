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
public class BuclesEjercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i=0;
        int valor;
        int suma =0;
        
        while(i<10){
            System.out.print("Digite el valor: ");
            valor = entrada.nextInt();
            
            if(i>4){
                suma+=valor;
            }
            i++;
        }
        System.out.println("La suma es: "+suma);
    }
    
}
