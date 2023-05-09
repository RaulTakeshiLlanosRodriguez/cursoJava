/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.metodoRetorno;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Operar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        Numeros numeros = new Numeros();
       int primerValor;
       int segundoValor;
       int tercerValor;
       
        System.out.print("Digite el primer valor: ");
        primerValor = entrada.nextInt();
        
        System.out.print("Digite el segundo valor: ");
        segundoValor = entrada.nextInt();
        
        System.out.print("Digite el tercer valor: ");
        tercerValor = entrada.nextInt();
        
        int mayor = numeros.calcularMayorNumeros(primerValor, segundoValor, tercerValor);
        int menor = numeros.calcularMenorNumero(primerValor, segundoValor, tercerValor);
        
        System.out.println("El numero mayor es: "+mayor);
        System.out.println("El numero mayor es: "+menor);
    }
    
}
