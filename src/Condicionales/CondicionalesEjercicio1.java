package Condicionales;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class CondicionalesEjercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int numero1,numero2;
        
        System.out.print("Digite el primer numero: ");
        numero1 = entrada.nextInt();
         System.out.print("Digite el segundo numero: ");
        numero2 = entrada.nextInt();
        
        if(numero1>numero2){
            System.out.println("El primer numero es mayor");
        }else if(numero2>numero1){
            System.out.println("El segundo numero es mayor");
        }else{
            System.out.println("Los numeros son iguales");
        }
    }
    
}
