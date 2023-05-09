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
public class CondicionalesEjercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        int saldo_inicial = 10000;
        int saldo_actual, deposito, retiro;
        
        System.out.println("CAJERO AUTOMATICO");
        System.out.println("1. Depositar");
        System.out.println("2. Retirar");
        System.out.println("3. Consultar saldo");
        System.out.println("4. Salir");
        System.out.print("Digite la opcion: ");
        opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("");
                System.out.print("Digite la cantidad que desea depositar: ");
                deposito = entrada.nextInt();
                saldo_actual = saldo_inicial + deposito;
                saldo_inicial = saldo_actual;
                System.out.println("Se ha depositado " + deposito + " soles");
                System.out.println("Su saldo actual es: "+saldo_actual);
                break;
            case 2:
                System.out.println("");
                System.out.print("Digite la cantidad que desea retirar: ");
                retiro = entrada.nextInt();
                if (retiro > saldo_inicial) {
                    System.out.println("No tiene suficiente saldo");
                } else {
                    saldo_actual = saldo_inicial - retiro;
                    saldo_inicial = saldo_actual;
                    System.out.println("Se ha retirado " + retiro + " soles");
                    System.out.println("Su saldo actual es: "+saldo_actual);
                }
                break;
            case 3:
                System.out.println("");
                System.out.println("Su saldo es: "+saldo_inicial);
                break;
            case 4:
                System.out.println("");
                System.out.println("Se ha retirado del cajero");
                break;
            default:
                System.out.println("");
                System.out.println("No esta entre las opciones");
        }
    }

}
