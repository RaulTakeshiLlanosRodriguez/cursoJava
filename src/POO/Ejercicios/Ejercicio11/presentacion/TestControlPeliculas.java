package POO.Ejercicios.Ejercicio11.presentacion;

import POO.Ejercicios.Ejercicio11.servicio.ControlPeliculasImpl;
import POO.Ejercicios.Ejercicio11.servicio.IControlPeliculas;
import java.util.Scanner;

public class TestControlPeliculas {

    public static void main(String[] args) {
        
        IControlPeliculas control = new ControlPeliculasImpl();
        Scanner entrada = new Scanner(System.in);
        entrada.useDelimiter("\n");
        int opcion;
        System.out.println("--------------------------------");
        System.out.println("Software - Control de peliculas");
        System.out.println("--------------------------------");
        do {
            System.out.println("1. Iniciar control de peliculas");
            System.out.println("2. Agregar Pelicula");
            System.out.println("3. Listar Peliculas");
            System.out.println("4. Buscar Pelicula");
            System.out.println("5. Salir");
            System.out.println("");
            System.out.print("Digite una opcion: ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    control.iniciarControlPeliculas();
                    break;
                case 2:
                    System.out.print("Digite el nombre de la pelicula: ");
                    String nombrePelicula = entrada.next();
                    control.agregarPelicula(nombrePelicula);
                    System.out.println("Pelicula agregada con exito");
                    break;
                case 3:
                    control.listarPeliculas();
                    break;
                case 4:
                    System.out.print("Digite la pelicula a buscar: ");
                    String peliculaBucar = entrada.next();
                    control.buscarPelicula(peliculaBucar);
                    break;
                case 5:
                    System.out.println("----------------------");
                    System.out.println("Gracias por participar");
                    System.out.println("----------------------");
                    opcion = 5;
                    break;
                default:
                    System.out.println("---------------------");
                    System.out.println("Opcion no disponible");
                    System.out.println("---------------------");
                    break;
            }

        } while (opcion != 5);
    }

}
