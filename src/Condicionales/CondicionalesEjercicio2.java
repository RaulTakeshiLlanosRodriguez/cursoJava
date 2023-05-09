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
public class CondicionalesEjercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero1, numero2, numero3;

        System.out.print("Digite el primer numero: ");
        numero1 = entrada.nextInt();
        System.out.print("Digite el segundo numero: ");
        numero2 = entrada.nextInt();
        System.out.print("Digite el tercer numero: ");
        numero3 = entrada.nextInt();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("El primer numero es mayor");
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("El segundo numero es mayor");
        } else if (numero3 > numero1 && numero3 > numero2) {
            System.out.println("El tercer numero es mayor");
        } else {
            System.out.println("Los numero son iguales");
        }
    }

}
