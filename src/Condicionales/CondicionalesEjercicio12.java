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
public class CondicionalesEjercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
         System.out.println("Digite el numero: ");
         numero = entrada.nextInt();
         
         if(numero < 10 && numero>0){
             System.out.println("El numero es de 1 cifra");
         }else if((numero >=10 && numero<=99) && numero>0){
             System.out.println("El numero es de 2 cifras");
         }else if((numero >=100 && numero <=999)&&numero>0){
             System.out.println("El numero es de 3 cifras");
         }else{
             System.out.println("Error en el numero");
         }
    }
    
}
