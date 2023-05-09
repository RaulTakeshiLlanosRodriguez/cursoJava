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
public class BuclesEjercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor;
        int contador =0;
        int promedio;
        int suma=0;
        do{
            System.out.print("Digite un numero: ");
            valor = entrada.nextInt();
            contador++;
            suma+=valor;
        }while(valor !=0);
        promedio=suma/contador;
        System.out.println("El promedio es: "+promedio);
        System.out.println("Usted ha digitado: "+contador);
    }
    
}
