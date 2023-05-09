
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
public class SegundoEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int lado;
        int perimetro;
        System.out.println("Ingrese el lado: ");
        lado = entrada.nextInt();
        perimetro = lado*4;
        System.out.println("El perimetro del cuadrado es: "+perimetro);
        
    }
    
}
