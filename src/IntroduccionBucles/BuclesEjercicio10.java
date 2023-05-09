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
public class BuclesEjercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador_positivos=0;
        int contador_negativos=0;
        int contador_multiplos15=0;
        int contador_pares = 0;
        int valor;
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite un numero: ");
            valor = entrada.nextInt();
            
            //cuando se utiliza if toma en cuenta en cada condicion
            //en cambio el else hace ignorar la condicion
            if(valor<0){
                contador_negativos++;
            }if(valor>0){
                contador_positivos++;
            }if(valor%15==0){
                contador_multiplos15++;
            }if(valor%2==0){
                contador_pares++;
            }
        }
        
        System.out.println("");
        System.out.println("Cantidad de positivos: "+contador_positivos);
        System.out.println("Cantidad de negativos: "+contador_negativos);
        System.out.println("Cantidad multiplos 15: "+contador_multiplos15);
        System.out.println("Cantidad de pares: "+contador_pares);
    }
    
}
