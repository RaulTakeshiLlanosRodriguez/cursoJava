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
public class BuclesEjercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cantidad_piezas, piezas_disponibles = 0;
        double longitud_perfil;
        int i = 1;

        System.out.print("Digite la cantidad de piezas: ");
        cantidad_piezas = entrada.nextInt();
        while (i <= cantidad_piezas) {
            System.out.print("Digite la longitud de perfil de la pieza: ");
            longitud_perfil = entrada.nextDouble();
            if (longitud_perfil >= 1.20 && longitud_perfil <= 1.30) {
                piezas_disponibles++;
            }
            i++;

        }
        System.out.println("La cantidad piezas aptas son: " + piezas_disponibles);
    }

}
