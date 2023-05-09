/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Condicionales;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class CondicionalesEjercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        
        System.out.print("Digite el numero: ");
        numero = entrada.nextInt();
        
        if((numero%4)==0){
            System.out.println("El numero "+numero+" es multiplo de 4");
        }else{
            System.out.println("El numero no es multiplo de 4");
        }
    }
    
}
