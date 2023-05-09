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
public class CondicionalesEjercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cadena1, cadena2;
        
        System.out.println("Digite la primera cadena: ");
        cadena1 = entrada.next();
        
        System.out.println("Digite la segunda cadena: ");
        cadena2 = entrada.next();
        
        if(cadena1.equalsIgnoreCase(cadena2)){
            System.out.println("Las cadenas son iguales");
        }else{
            System.out.println("Las cadenas no son iguales");
        }
    }
    
}
