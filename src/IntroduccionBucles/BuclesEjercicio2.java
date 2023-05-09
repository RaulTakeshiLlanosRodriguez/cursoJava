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
public class BuclesEjercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor;
        int suma =0;
        int promedio;
        int i=1;
        
        while(i<=10){
            
            System.out.print("Digite un numero: ");
            valor = entrada.nextInt();
            suma += valor;
            i++;
        }
        
        promedio = suma/10;
        System.out.println("La suma es: "+suma);
        System.out.println("El promedio es: "+promedio);
        
    }
    
}
