package POO.Ejercicios.Ejercicio10;

import java.util.Scanner;

public class AppElectrodomesticos {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Electrodomestico[] listaElectrodomesticos = new Electrodomestico[3];
        int opcion;

        //registramos los electrodomesticos
        for (int i = 0; i < listaElectrodomesticos.length;) {
            System.out.println("1. Agregar electrodomestico");
            System.out.println("2. Agregar lavadora");
            System.out.println("3. Agregar televisor");
            System.out.println("");
            System.out.print("Digite una opcion: ");
            opcion = entrada.nextInt();

            if (opcion == 1 || opcion == 2 || opcion == 3) {
                switch (opcion) {
                    case 1:
                        String color;
                        char consumoEnergetico;
                        double precioBase,
                         peso;
                        System.out.println("");
                        System.out.print("Digite un color: ");
                        color = entrada.next();
                        System.out.print("Digite el consumo energetico: ");
                        consumoEnergetico = entrada.next().charAt(0);

                        System.out.print("Digite el precio base: ");
                        precioBase = entrada.nextDouble();

                        System.out.print("Digite el peso: ");
                        peso = entrada.nextDouble();

                        listaElectrodomesticos[i] = new Electrodomestico(color, consumoEnergetico, precioBase, peso);
                        System.out.println("\nElectrodomestico agregado");
                        i++;
                        break;
                    case 2:
                        String colorLavadora;
                        char consumoEnergeticoLavadora;
                        double precioBaseLavadora,
                         pesoLavadora;
                        int cargaLavadora;

                        System.out.println("");
                        System.out.print("Digite un color: ");
                        colorLavadora = entrada.next();
                        System.out.print("Digite el consumo energetico: ");
                        consumoEnergeticoLavadora = entrada.next().charAt(0);

                        System.out.print("Digite el precio base: ");
                        precioBaseLavadora = entrada.nextDouble();

                        System.out.print("Digite el peso: ");
                        pesoLavadora = entrada.nextDouble();

                        System.out.print("Digite la carga de la lavadora: ");
                        cargaLavadora = entrada.nextInt();

                        listaElectrodomesticos[i] = new Lavadora(colorLavadora, consumoEnergeticoLavadora, precioBaseLavadora, pesoLavadora, cargaLavadora);
                        System.out.println("\nLavadora agregada");
                        i++;
                        break;
                    case 3:
                        String colorTelevisor;
                        char consumoEnergeticoTelevisor;
                        double precioBaseTelevisor,
                         pesoTelevisor;
                        int resolucion;
                        boolean sincronizacionTDT;

                        System.out.println("");
                        System.out.print("Digite un color: ");
                        colorTelevisor = entrada.next();
                        System.out.print("Digite el consumo energetico: ");
                        consumoEnergeticoTelevisor = entrada.next().charAt(0);

                        System.out.print("Digite el precio base: ");
                        precioBaseTelevisor = entrada.nextDouble();

                        System.out.print("Digite el peso: ");
                        pesoTelevisor = entrada.nextDouble();

                        System.out.print("Digite la resolucion: ");
                        resolucion = entrada.nextInt();

                        System.out.print("Digite el sincronizador TDT: ");
                        sincronizacionTDT = entrada.nextBoolean();

                        listaElectrodomesticos[i] = new Televisor(colorTelevisor, consumoEnergeticoTelevisor, precioBaseTelevisor, pesoTelevisor, resolucion, sincronizacionTDT);
                        System.out.println("\nTelevisor agregado");
                        i++;
                        break;
                    default:
                        System.out.println("\nOpcion no disponible");
                        break;
                }
            }
        }

        //calculamos la suma de todos los electrodomesticos
        double sumaElectrodomesticos = 0;
        double sumaTelevisores = 0;
        double sumaLavadoras = 0;

        //recorremos la lista de electrodomesticos
        for (int i = 0; i < listaElectrodomesticos.length; i++) {
            if (listaElectrodomesticos[i] instanceof Electrodomestico) {
                sumaElectrodomesticos += listaElectrodomesticos[i].obtenerPrecioFinal();
            }
            if (listaElectrodomesticos[i] instanceof Lavadora) {
                sumaLavadoras += listaElectrodomesticos[i].obtenerPrecioFinal();
            }
            if (listaElectrodomesticos[i] instanceof Televisor) {
                sumaTelevisores += listaElectrodomesticos[i].obtenerPrecioFinal();
            }
        }
        
        //mostramos la suma de los electrodomesticos
        System.out.println("");
        System.out.println("La suma del precio de electrodomesticos es: "+sumaElectrodomesticos);
        System.out.println("La suma del precio de las lavadoras es: "+sumaLavadoras);
        System.out.println("La suma del precio de los televisores es: "+sumaTelevisores);
    }

}
