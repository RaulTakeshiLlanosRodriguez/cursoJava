
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
public class OctavoEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero;
        
        System.out.print("Digite el numero a calcular la raiz cuadrada: ");
        numero = entrada.nextDouble();
        
        double raiz = Math.sqrt(numero);
        //Math.cbrt(numero); permite hallar la raiz cubica
        System.out.println("La raiz cuadrado de "+numero+" es: "+raiz);
    }
    
}
