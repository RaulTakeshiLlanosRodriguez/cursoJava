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
public class BuclesEjercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int longitud = 0;
        String cadenaActual;
        String cadenaInvertida = "";
        
        System.out.print("Digite una cadena: ");
        cadenaActual = entrada.nextLine(); // permite capturar cadenas con espacios
        
        longitud = cadenaActual.length();
        
        while(longitud!=0){
            cadenaInvertida += cadenaActual.substring(longitud-1, longitud);
            //subString permite recortas las palabras
            longitud--;
        }
        System.out.println("La cadena actual es: "+cadenaActual);
        System.out.println("La cadena invertida es: "+cadenaInvertida);
        
    }
    
}
