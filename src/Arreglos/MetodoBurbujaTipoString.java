/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class MetodoBurbujaTipoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombres[];
        int nElementos;

        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos de arreglo: "));
        nombres = new String[nElementos];

        for (int i = 0; i < nElementos; i++) {
            System.out.print("Digite un nombre: ");
            nombres[i] = entrada.next();
        }

        System.out.println("");
        System.out.println("El arreglo desordenado: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.println(nombres[i] + "");
        }

        //metodo Burbuja
        String aux;
        for (int i = 0; i < (nElementos - 1); i++) {
            for (int j = 0; j < (nElementos - 1); j++) {
                if (nombres[j].compareTo(nombres[j + 1]) > 0) {
                    aux = nombres[j];
                    nombres[j] = nombres[j + 1];
                    nombres[j + 1] = aux;
                }
            }
        }

        System.out.println("\nEl arreglo ordenado es: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.println(nombres[i] + "");
        }
    }

}
