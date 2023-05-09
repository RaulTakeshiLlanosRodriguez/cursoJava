
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
public class SeptimoEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int base;
        int exponente;
        
        System.out.print("Digite la base: ");
        base = entrada.nextInt();
        System.out.print("Digite el exponente: ");
        exponente = entrada.nextInt();
        
        int resultado = (int)Math.pow(base, exponente);
        System.out.println("El número "+base+" elevado al exponente "+exponente+" es "+resultado);
    }
    
}
