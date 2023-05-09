
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
public class CuartoEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nota1;
        int nota2;
        int nota3,nota4,nota5;
        
        System.out.println("Ingrese la primera nota: ");
        nota1 = entrada.nextInt();
        System.out.println("Ingrese la segunda nota: ");
        nota2 = entrada.nextInt();
        System.out.println("Ingrese la tercera nota: ");
        nota3 = entrada.nextInt();
        System.out.println("Ingrese la cuarta nota: ");
        nota4 = entrada.nextInt();
        System.out.println("Ingrese la quinta nota: ");
        nota5 = entrada.nextInt();
        
        int promedio = (nota1+nota2+nota3+nota4+nota5)/5;
        System.out.println("El promedio es: "+promedio);
    }
    
}
