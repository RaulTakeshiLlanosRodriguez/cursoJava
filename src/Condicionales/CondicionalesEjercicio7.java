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
public class CondicionalesEjercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char caracter;
        
        System.out.print("Digite un caracter: ");
        caracter = entrada.next().charAt(0);
        
        if(Character.isUpperCase(caracter)){
            System.out.println("El caracter esta en mayuscula");
        }else if(Character.isLowerCase(caracter)){
            System.out.println("El caracter esta en minuscula");
        }
    }
    
}
