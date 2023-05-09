/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Condicionales;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class CondicionalesEjercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        int numero1, numero2, resultado;
        
        System.out.println("CALCULADOR BASICA");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Raiz cuadrada");
        System.out.println("6. Raiz cubica");
        System.out.println("7. Elevar al exponente");
        System.out.println("8. Hallar el porcentaje");
        System.out.println("9. Salir");
        System.out.println("");
        System.out.print("Digite una opcion: ");
        opcion = entrada.nextInt();
        
        switch(opcion){
            case 1:
                System.out.println("");
                System.out.print("Digite el primer numero: ");
                numero1 = entrada.nextInt();
                System.out.print("Digite el segundo numero: ");
                numero2 = entrada.nextInt();
                
                resultado = numero1+numero2;
                System.out.println("La suma es: "+resultado);
                break;
            case 2:
                System.out.println("");
                System.out.print("Digite el primer numero: ");
                numero1 = entrada.nextInt();
                System.out.print("Digite el segundo numero: ");
                numero2 = entrada.nextInt();
                
                resultado = numero1-numero2;
                System.out.println("La resta es: "+resultado);
                break;
            case 3:
                System.out.println("");
                System.out.print("Digite el primer numero: ");
                numero1 = entrada.nextInt();
                System.out.print("Digite el segundo numero: ");
                numero2 = entrada.nextInt();
                
                resultado = numero1*numero2;
                System.out.println("La multiplicacion es: "+resultado);
                break;
            case 4:
                System.out.println("");
                System.out.print("Digite el primer numero: ");
                numero1 = entrada.nextInt();
                System.out.print("Digite el segundo numero: ");
                numero2 = entrada.nextInt();
                
                if(numero2==0){
                    System.out.println("No se divide entre 0");
                }else{
                    resultado = numero1/numero2;
                    System.out.println("La division es: "+resultado);
                }
                break;
            case 5:
                System.out.println("");
                System.out.print("Digite el primer numero: ");
                numero1 = entrada.nextInt();
                
                resultado = (int) Math.sqrt(numero1);
                System.out.println("La raiz cuadrada es: "+resultado);
                break;
            case 6:
                System.out.println("");
                System.out.print("Digite el primer numero: ");
                numero1 = entrada.nextInt();
                
                resultado = (int) Math.cbrt(numero1);
                System.out.println("La raiz cubica es: "+resultado);
                break;
            case 7:
                System.out.println("");
                System.out.print("Digite la base: ");
                numero1 = entrada.nextInt();
                System.out.print("Digite el exponente: ");
                numero2 = entrada.nextInt();
                
                resultado = (int)Math.pow(numero1, numero2);
                System.out.println("La base "+numero1+" elevado al exponente "+numero2+" es "+resultado);
                break;
            case 8:
                System.out.println("");
                System.out.print("Digite el numero: ");
                numero1 = entrada.nextInt();
                System.out.print("Digite el porcentaje: ");
                numero2 = entrada.nextInt();
                
                resultado = (numero2/100)*numero1;
                System.out.println("El "+numero2+" % de "+numero1+" es "+resultado);
                break;
            default:
                System.out.println("Gracias por usar la aplicación, adios");
        }
    }
    
}
