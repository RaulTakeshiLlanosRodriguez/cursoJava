
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
public class Operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        
        Scanner entrada = new Scanner(System.in);
        int numero1;
        int numero2;
        
        System.out.print("Ingrese el primer número: ");
        numero1 = entrada.nextInt();
        System.out.print("Ingrese el segundo número: ");
        numero2 = entrada.nextInt();
        System.out.println("");
        int suma = numero1+numero2;
        int resta = numero1-numero2;
        int multiplicacion = numero1*numero2;
        int division = numero1/numero2;
        System.out.println("El resultado de la suma es: "+suma);
        System.out.println("El resultado de la resta es: "+resta);
        System.out.println("El resultado de la multiplicación es: "+multiplicacion);
        System.out.println("El resultado de la división es: "+division);
        */
        //concatenacion de variables
        int numero = 10;
        numero = numero + 20;
        numero += 2;
        System.out.println(numero);
        
        String cadena = "Hola me llamo Takeshi";
        cadena = cadena + " Soy de Peru"; //1ra forma
        cadena += " y soy de Chimbote"; //2da forma
        System.out.println(cadena);
    }
    
}
