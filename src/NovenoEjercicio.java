
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class NovenoEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1, numero2;
        
        System.out.print("Digite el primer numero: ");
        numero1 = entrada.nextInt();
        
        System.out.print("Digite el segundo numero: ");
        numero2 = entrada.nextInt();
        
        int mayor = Math.max(numero1, numero2);
        int menor = Math.min(numero1, numero2);
        
        System.out.println("El numero mayor es: "+mayor);
        System.out.println("El numero menor es: "+menor);
    }
    
}
