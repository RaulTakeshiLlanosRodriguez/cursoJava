
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
public class entradaDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //clase Scanner para la entrada de datos
        Scanner entrada = new Scanner(System.in);
        
        //creamos las variables
        int edad;
        String nombre;
        float altura;
        
        System.out.println("Ingrese su edad: ");
        edad = entrada.nextInt();
        System.out.println("Ingrese su nombre: ");
        nombre = entrada.next(); //next apunta a String
        System.out.println("Ingrese su altura: ");
        altura = entrada.nextFloat();
        
        System.out.println("La edad es "+edad);
        System.out.println("El nombre es "+nombre);
        System.out.println("La altura es "+altura);
        
    }
    
}
