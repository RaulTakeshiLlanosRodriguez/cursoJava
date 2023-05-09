
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
public class QuintoEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int fecha_actual;
        int fecha_nacimiento;
        
        System.out.println("Ingrese la fecha actual: ");
        fecha_actual = entrada.nextInt();
        
        System.out.println("Ingrese la fecha de nacimiento: ");
        fecha_nacimiento = entrada.nextInt();
        
        int edad = fecha_actual-fecha_nacimiento;
        System.out.println("La edad de la persona es: "+edad);
    }
    
}
