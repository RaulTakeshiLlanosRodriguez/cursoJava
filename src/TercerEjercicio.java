
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
public class TercerEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double base;
        double altura;
        double area;
        
        System.out.println("Ingrese la base: ");
        base = entrada.nextDouble();
        System.out.println("Ingrese la altura: ");
        altura = entrada.nextDouble();
        
        area = (base*altura)/2;
        
        System.out.println("El area del triangulo es: "+area);
    }
    
}
