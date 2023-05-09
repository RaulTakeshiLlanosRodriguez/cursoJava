/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.metodos;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Operacion {
    
    int primerNumero;
    int segundoNumero;
    int suma;
    int resta;
    int multiplicacion;
    
    public void mostrarMenu(){
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        
            System.out.println("1. Sumar numeros");
            System.out.println("2. Restar numeros");
            System.out.println("3. Multiplicar numeros");
            
            System.out.print("Digite la opcion: ");
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1:
                    pedirNumeros();
                    sumaNumeros();
                    break;
                case 2:
                    pedirNumeros();
                    restarNumeros();
                    break;
                case 3:
                    pedirNumeros();
                    multiplicarNumeros();
                    break;
                default:
                    System.out.println("");
                    System.out.println("Opcion no diponible");
                    break;
            }
            
    }
    
    public void sumaNumeros(){
        suma = primerNumero+segundoNumero;
        System.out.println("");
        System.out.println("La suma de los numeros es: "+suma);
    }
    
    public void restarNumeros(){
        resta = primerNumero-segundoNumero;
        
        System.out.println("");
        System.out.println("La resta de los numeros es: "+resta);
    }
    
    public void multiplicarNumeros(){
        multiplicacion = primerNumero * segundoNumero;
        System.out.println("");
        System.out.println("La multiplicacion de los numeros es: "+multiplicacion);
    }
    public void pedirNumeros(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("");
        System.out.print("Digite el primer numero: ");
        primerNumero = entrada.nextInt();
        System.out.print("Digite el segundo numero: ");
        segundoNumero = entrada.nextInt();
    }
}
