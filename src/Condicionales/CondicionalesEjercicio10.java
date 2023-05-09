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
public class CondicionalesEjercicio10 {

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
        
        int longitud_cadena1 = cadena1.length();
        int longitud_cadena2 = cadena2.length();
        
        if(longitud_cadena1>longitud_cadena2){
            System.out.println("La longitud de la cadena 1 es mayor");
            System.out.println("La longitud de la cadena 2 es menor");
        }else if(longitud_cadena2>longitud_cadena1){
            System.out.println("La longitud de la cadena 2 es mayor");
            System.out.println("La longitud de la cadena 1 es menor");
        }else{
            System.out.println("Las longitudes son iguales");
        }
    }
    
}
