package POO.Excepciones;

import java.util.Scanner;

public class TestExcepciones {

    public static void main(String[] args) {

        /*
        //dividir un numero entre cero
        int primerNumero = 10;
        int segundoNumero = 0;
        
        //uso de la excepcion try catch
        try {
            int resultado = primerNumero / segundoNumero;
            System.out.println("La division es: " + resultado);
        } catch (Exception e) {
            System.out.println("No se puede dividir un numero entre 0");
            e.printStackTrace(System.out);
        }
         */
        Scanner entrada = new Scanner(System.in);
        int valor;

        try {
            //tratamos
            System.out.print("Digite un valor: ");
            valor = entrada.nextInt();
            System.out.println("El valor es: " + valor);
        } catch (Exception e) {
            System.out.println("Ocurrio una excepcion");
            e.printStackTrace(System.out);
        } finally {
            //finalmente
            System.out.println("Cerramos el programa");
        }

    }

}
