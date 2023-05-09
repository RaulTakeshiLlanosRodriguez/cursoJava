/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.Ejercicios.Ejercicio9;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class TestBebida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Bebida bebida;
        Almacen almacen = new Almacen();
        int opcion;

        do {
            System.out.println("\n\tMENU DE OPCIONES");
            System.out.println("1. Agregar bebida");
            System.out.println("2. Eliminar bebida");
            System.out.println("3. Mostrar bebidas");
            System.out.println("4. Calcular el precio de las bebidas");
            System.out.println("5. Salir");
            System.out.print("Digite una opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    double porcentajeAzucar;
                    boolean promocionAzucar;
                    double cantidadAzucar,
                     precioAzucar;
                    String marcaAzucar;

                    System.out.print("\nDigite el porcentaje de azucar: ");
                    porcentajeAzucar = entrada.nextDouble();

                    System.out.print("\nDigite la promocion del azucar: ");
                    promocionAzucar = entrada.nextBoolean();

                    System.out.print("\nDigite la cantidad de azucar: ");
                    cantidadAzucar = entrada.nextDouble();

                    System.out.print("\nDigite el precio del azucar: ");
                    precioAzucar = entrada.nextDouble();

                    System.out.print("\nDigite la marca del azucar: ");
                    marcaAzucar = entrada.next();

                    bebida = new BebidaAzucarada(cantidadAzucar, precioAzucar, marcaAzucar, porcentajeAzucar, promocionAzucar);
                    almacen.agregarBebida(bebida);
                    System.out.println("");

                    String manantial;
                    double cantidadMineral,
                     precioMineral;
                    String marcaMineral;

                    System.out.print("\nDigite la cantidad de agua: ");
                    cantidadMineral = entrada.nextDouble();

                    System.out.print("\nDigite el precio del agua: ");
                    precioMineral = entrada.nextDouble();

                    System.out.print("\nDigite la marca del agua: ");
                    marcaMineral = entrada.next();

                    System.out.print("\nDigite el manantial del agua: ");
                    manantial = entrada.next();
                    bebida = new AguaMineral(cantidadMineral, precioMineral, marcaMineral, manantial);
                    almacen.agregarBebida(bebida);

                    break;
                case 2:
                    System.out.print("\nDigite el ID de la bebida a eliminar: ");
                    int id = entrada.nextInt();

                    almacen.eliminarBebida(id);
                    break;
                case 3:

                    almacen.mostrarBebidas();
                    break;
                case 4:
                    System.out.println("\nEl precio total de las bebidas es: " + almacen.calcularPrecioBebidas());
                    break;
                case 5:
                    System.out.println("\nGracias por participar");
                    opcion = 5;
                    break;
                default:
                    System.out.println("\nOpcion no disponible");
                    break;
            }
        } while (opcion != 5);

    }

}
