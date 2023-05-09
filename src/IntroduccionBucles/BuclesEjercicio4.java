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
public class BuclesEjercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nota;
        int i = 1;
        int contador1 = 0;//cuenta las notas mayores o iguales a 7
        int contador2 = 0;//cuenta las notas menores a 7

        while (i <= 10) {
            System.out.print("Digite la nota " + i + " : ");
            nota = entrada.nextInt();

            if (nota >= 7) {
                contador1++;
            } else if (nota < 7) {
                contador2++;
            }
            i++;
        }
        System.out.println("");
        System.out.println("Las notas mayores o iguales a 7 son: " + contador1);
        System.out.println("Las notas menores a 7 son: " + contador2);
    }

}
