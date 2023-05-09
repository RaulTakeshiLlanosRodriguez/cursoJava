
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class SextoEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char caracter1,caracter2;
        String sumaCaracteres = " "; //YA QUE AL SUMAR 2 CHAR GENERA UN TEXTO
        
        System.out.println("Digite el primer caracter");
        caracter1 = entrada.next().charAt(0); //el metodo charAt permite guardar caracteres
        System.out.println("Digite el segundo caracter");
        caracter2 = entrada.next().charAt(0);
        
        //forma de sumar caracteres
        sumaCaracteres += caracter1 + ""+ caracter2;
        System.out.println("La suma de caracteres es: "+sumaCaracteres);
    }
    
}
