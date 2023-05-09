/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.Ejercicios.Ejercicio5;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        NumeroComplejo primeroNumero, segundoNumero;
        double a //parte real del primero numero
                ,b //parte imaginaria del primero numero
                ,c //psrte real del segundo numero
                ,d; //parte imaginaria del segundo numero
        int opcion, numeroEntero;
        NumeroComplejo suma, producto;
        
        do{
            
            System.out.println("\n\tMENU");
            System.out.println("1. Sumar 2 numeros complejos");
            System.out.println("2. Multiplicar 2 numeros complejos");
            System.out.println("3. Comprobar igualdad de 2 numeros complejos");
            System.out.println("4. Multiplicar entero por complejo");
            System.out.println("5. Salir");
            System.out.print("Digite una opcion: ");
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.print("\nDigite la parte real del primer numero complejo: ");
                    a = entrada.nextDouble();
                    
                    System.out.print("Digite la parte imaginaria: ");
                    b = entrada.nextDouble();
                    
                    System.out.print("\nDigite la parte real del segundo numero complejo: ");
                    c = entrada.nextDouble();
                    
                    System.out.print("Digite la parte imaginaria: ");
                    d = entrada.nextDouble();
                    
                    primeroNumero = new NumeroComplejo(a, b);
                    segundoNumero = new NumeroComplejo(c, d);
                    suma = primeroNumero.calcularSuma(segundoNumero);
                    System.out.println("\nLa suma es: "+suma.getParteReal()+" + "+suma.getParteImaginaria()+"i");
                    break;
                case 2:
                    System.out.print("\nDigite la parte real del primer numero complejo: ");
                    a = entrada.nextDouble();
                    
                    System.out.print("Digite la parte imaginaria: ");
                    b = entrada.nextDouble();
                    
                    System.out.print("\nDigite la parte real del segundo numero complejo: ");
                    c = entrada.nextDouble();
                    
                    System.out.print("Digite la parte imaginaria: ");
                    d = entrada.nextDouble();
                    
                    primeroNumero = new NumeroComplejo(a, b);
                    segundoNumero = new NumeroComplejo(c, d);
                    producto = primeroNumero.calcularProducto(segundoNumero);
                    System.out.println("\nEl producto es: "+producto.getParteReal()+" X "+producto.getParteImaginaria()+"i");
                    break;
                case 3:
                    System.out.print("\nDigite la parte real del primer numero complejo: ");
                    a = entrada.nextDouble();
                    
                    System.out.print("Digite la parte imaginaria: ");
                    b = entrada.nextDouble();
                    
                    System.out.print("\nDigite la parte real del segundo numero complejo: ");
                    c = entrada.nextDouble();
                    
                    System.out.print("Digite la parte imaginaria: ");
                    d = entrada.nextDouble();
                    
                    primeroNumero = new NumeroComplejo(a, b);
                    segundoNumero = new NumeroComplejo(c, d);
                    
                    if(primeroNumero.comprobarIgualdad(segundoNumero)){
                        System.out.println("\nLos numeros son iguales");
                    }else{
                        System.out.println("Los numeros no son iguales");
                    }
                    break;
                case 4:
                    System.out.print("\nDigite la parte real del primer numero complejo: ");
                    a = entrada.nextDouble();
                    
                    System.out.print("Digite la parte imaginaria: ");
                    b = entrada.nextDouble();
                    System.out.print("\nDigite el numero entero: ");
                    numeroEntero = entrada.nextInt();
                    
                    primeroNumero = new NumeroComplejo(a, b);
                    producto = primeroNumero.calcularProductoEntero(numeroEntero);
                    System.out.println("\nLa multiplicacion es: "+producto.getParteReal()+" + "+producto.getParteImaginaria()+"i");
                    break;
                case 5:
                    System.out.println("\nGracias por participar");
                    opcion = 5;
                    break;
                default:
                    System.out.println("Opcion no disponible");
                    break;
            }
        }while(opcion != 5);
    }
    
}
