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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        float altura;
        float alturas[];
        int nElementos;
        float suma=0;
        float promedio;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño del arreglo: "));
        alturas = new float[nElementos];//estableciendo el tamaño del arreglo
        
        for (int i = 0; i < alturas.length; i++) {
            System.out.print("Digite la "+(i+1)+" altura: ");
            alturas[i]= entrada.nextFloat();
            suma+=alturas[i];
        }
        
        //imprimiendo el arreglo
        System.out.println("");
        System.out.println("Las alturas son: ");
        for (int i = 0; i < alturas.length; i++) {
            System.out.println(alturas[i]);
        }
        
        promedio = suma / nElementos;
        System.out.println("");
        System.out.println("El promedio de las alturas es: "+promedio);
        
        int mayor = 0;
        int menor = 0;
        
        for (int i = 0; i < alturas.length; i++) {
            if(alturas[i]>promedio){
                mayor++;
            }else if(alturas[i]<promedio){
                menor++;
            }
        }
        
        System.out.println("");
        System.out.println("La cantidad de elementos mayores al promedio son: "+mayor);
        System.out.println("La cantidad de elementos menores al promedio son: "+menor);
    }
    
}
