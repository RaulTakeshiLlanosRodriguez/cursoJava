/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.Ejercicios.Ejercicio6;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Registro {

    //metodo para buscar el nro de cuenta
    public static int buscarNumeroCuenta(Cuentas cuentas[], int numeroCuenta) {
        int indice = 0;
        int iterador = 0;
        boolean encontrado = false;

        while (iterador < cuentas.length && encontrado == false) {
            if (cuentas[iterador].getNumeroCuenta() == numeroCuenta) {
                encontrado = true;
                indice = iterador;
            }
            iterador++;
        }

        if (encontrado == false) {
            indice = -1;
        }
        return indice;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String nombre, apellido, dni;
        Cuentas cuentas[];
        Cliente cliente;
        int numeroCuenta, cantidadCuentas, opcion, indiceNroCuenta;
        double saldo, cantidadDinero;

        System.out.print("Digite el nombre del cliente: ");
        nombre = entrada.next();
        System.out.print("Digite el apellido del cliente: ");
        apellido = entrada.next();

        System.out.print("Digite el DNI del cliente: ");
        dni = entrada.next();

        System.out.println("\nAhora digite la cantidad de cuentas que tiene el cliente: ");
        cantidadCuentas = entrada.nextInt();
        System.out.println("");

        cuentas = new Cuentas[cantidadCuentas];

        //rellenamos las cuentas
        for (int i = 0; i < cuentas.length; i++) {
            System.out.println("\nDigite la " + (i + 1) + " cuenta: ");
            System.out.print("Digite el numero de cuenta: ");
            numeroCuenta = entrada.nextInt();

            System.out.print("Digite el saldo de la cuenta: ");
            saldo = entrada.nextDouble();
            System.out.println("");
            cuentas[i] = new Cuentas(numeroCuenta, saldo);
        }

        cliente = new Cliente(nombre, apellido, dni, cuentas);

        do {

            System.out.println("\n\tMENU");
            System.out.println("1. Ingresar saldo de la cuenta");
            System.out.println("2. Retirar saldo a la cuenta");
            System.out.println("3. Consultar saldo de la cuenta");
            System.out.println("4. Salir");
            System.out.print("Digite una opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("\nDigite el numero de cuenta: ");
                    numeroCuenta = entrada.nextInt();
                    indiceNroCuenta = buscarNumeroCuenta(cuentas, numeroCuenta);

                    if (indiceNroCuenta == -1) {
                        System.out.println("\nCuenta no encontrada");
                        System.out.println("");
                    } else {
                        System.out.print("Digite la cantidad de dinero a depositar: ");
                        cantidadDinero = entrada.nextDouble();
                        cliente.ingresarDinero(indiceNroCuenta, cantidadDinero);
                        System.out.println("\nDeposito con exito");
                        System.out.print("Saldo disponible: " + cliente.consultarSaldo(indiceNroCuenta));
                    }
                    break;
                case 2:
                    System.out.print("\nDigite el numero de cuenta: ");
                    numeroCuenta = entrada.nextInt();
                    indiceNroCuenta = buscarNumeroCuenta(cuentas, numeroCuenta);
                    if (indiceNroCuenta == -1) {
                        System.out.println("\nCuenta no encontrada");
                        System.out.println("");
                    } else {
                        System.out.print("Digite la cantidad de dinero a retirar: ");
                        cantidadDinero = entrada.nextDouble();

                        if (cliente.consultarSaldo(indiceNroCuenta) < cantidadDinero) {
                            System.out.println("\nSaldo insuficiente");
                        } else {
                            cliente.retirarDinero(indiceNroCuenta, cantidadDinero);
                            System.out.println("\nRetiro con exito");
                            System.out.print("Saldo disponible: " + cliente.consultarSaldo(indiceNroCuenta));
                        }
                    }
                    break;
                case 3:
                    System.out.print("\nDigite el numero de cuenta: ");
                    numeroCuenta = entrada.nextInt();
                    indiceNroCuenta = buscarNumeroCuenta(cuentas, numeroCuenta);
                    if (indiceNroCuenta == -1) {
                        System.out.println("\nCuenta no encontrada");
                        System.out.println("");
                    } else {
                        System.out.println("Saldo disponible: "+cliente.consultarSaldo(indiceNroCuenta));
                        System.out.println("");
                    }
                    break;
                case 4:
                    System.out.println("\nGracias por participar");
                    opcion = 4;
                    break;
                default:
                    System.out.println("\nOpcion no disponible");
                    break;
            }

        } while (opcion != 4);

    }

}
