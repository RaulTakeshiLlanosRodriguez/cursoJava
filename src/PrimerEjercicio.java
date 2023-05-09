
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
public class PrimerEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double lado;
        System.out.println("Digite el lado: ");
        lado = entrada.nextDouble();
        double areaCuadrado = lado*lado;
        System.out.println("El area del cuadrado es: "+areaCuadrado);
    }
    
}
