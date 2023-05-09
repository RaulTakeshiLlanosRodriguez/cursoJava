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
public class BuclesEjercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int nvalor,valor;
        int contador_par=0, contador_impar=0;
        int i=0;
        
        System.out.print("Digite la cantidad de valores: ");
        nvalor = entrada.nextInt();
        System.out.println("");
        
        while(i<nvalor){
            System.out.print("Digite el valor: ");
            valor = entrada.nextInt();
            
            if(valor%2==0){
                contador_par++;
            }else{
                contador_impar++;
            }
            i++;
        }
        System.out.println("");
        System.out.println("La cantidad de pares es: "+contador_par);
        System.out.println("La cantidad de impares es: "+contador_impar);
    }
    
}
