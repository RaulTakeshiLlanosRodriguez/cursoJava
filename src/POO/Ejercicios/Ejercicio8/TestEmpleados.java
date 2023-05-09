/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.Ejercicios.Ejercicio8;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class TestEmpleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        EmpleadoComercial comercial;
        EmpleadoRepartidor repartidor;
        int opcion;
        
        do{
            System.out.println("1. PLUS de comerciante");
            System.out.println("2. PLUS de repartidor");
            System.out.println("3. Salir");
            System.out.print("\nDigite una opcion: ");
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1:
                    String nombreComercial;
                    double salarioComercial, comision;
                    int edadComercial;
                    
                    System.out.print("\nDigite el nombre del comercial: ");
                    nombreComercial = entrada.next();
                    
                    System.out.print("\nDigite el salario del comercial: ");
                    salarioComercial = entrada.nextDouble();
                    
                    System.out.print("\nDigite la comision del comercial: ");
                    comision = entrada.nextDouble();
                    
                    System.out.print("\nDigite la edad del comercial: ");
                    edadComercial = entrada.nextInt();
                    
                    comercial = new EmpleadoComercial(nombreComercial, edadComercial, salarioComercial, comision);
                    System.out.println(comercial.toString());
                    comercial.plus();
                    System.out.println("");
                    break;
                case 2:
                    String nombreRepartidor;
                    double salarioRepartidor;
                    int edadRepartidor;
                    String zona;
                    
                    System.out.print("\nDigite el nombre del repartidor: ");
                    nombreRepartidor = entrada.next();
                    
                    System.out.print("\nDigite el salario del repartidor: ");
                    salarioRepartidor = entrada.nextDouble();
                    
                    System.out.print("\nDigite la edad del repartidor: ");
                    edadRepartidor = entrada.nextInt();
                    
                    System.out.print("Digite la zona del repartidor: ");
                    zona = entrada.next();
                    
                    repartidor = new EmpleadoRepartidor(nombreRepartidor, edadRepartidor, salarioRepartidor, zona);
                    System.out.println(repartidor.toString());
                    repartidor.plus();
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("\nGracias por participar");
                    opcion = 3;
                    break;
                default:
                    System.out.println("\nOpcion no disponible");
                    break;
            }
        }while(opcion !=3);
    }
    
}
