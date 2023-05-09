/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroduccionBucles;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class BuclesEjercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcion;
        String contraseña;
        int saldo_inicial = 100000;
        int deposito, retiro;
        int intentos = 0;
        int continuar = 0;
        boolean salir = false;
        int saldo_actual;

        do {
            System.out.print("Digite su contraseña: ");
            contraseña = entrada.next();

            if (contraseña.equals("holamundo")) {
                while (!salir) {
                    System.out.println("CAJERO AUTOMATICO");
                    System.out.println("1. Depositar");
                    System.out.println("2. Retirar");
                    System.out.println("3. Consultar saldo");
                    System.out.println("4. Salir");
                    System.out.print("Digite una opcion: ");
                    opcion = entrada.nextInt();
                    switch (opcion) {
                        case 1:
                            System.out.println("");
                            System.out.print("Digite la cantidad que desea depositar: ");
                            deposito = entrada.nextInt();
                            saldo_actual = saldo_inicial + deposito;
                            saldo_inicial = saldo_actual;
                            System.out.println("Se ha depositado " + deposito + " soles");
                            System.out.println("Su saldo actual es: " + saldo_actual);
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
                                System.out.println("Su saldo actual es: " + saldo_actual);

                            }
                            break;
                        case 3:
                            System.out.println("");
                            System.out.println("Su saldo es: " + saldo_inicial);
                            break;
                        case 4:
                            salir = true;
                            continuar = 1;
                            System.out.println("");
                            System.out.println("Se ha retirado del cajero");
                            break;
                        default:
                            System.out.println("");
                            System.out.println("No esta entre las opciones");
                    }
                }
            } else {
                System.out.println("=====================");
                System.out.println("Contraseña incorrecta");
                System.out.println("=====================");
                intentos++;
            }
            if (intentos == 3) {
                System.out.println("Usted ha realizado 3 intentos");
                break; //se encarga de cerrar el bucle do while
            }
        } while (continuar == 0);
    }

}
