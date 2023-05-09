/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.Ejercicios.Ejercicio2;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Ecuacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a, b, c;
        boolean estado = true;
        String respuesta;
        Raices raiz;
        int contador = 0;
        
        //un bucle con estado = true siempre es infinito
        for (int i = 0; estado; i++) {
            System.out.print("Digite el valor de a: ");
            a = entrada.nextDouble();
            System.out.print("Digite el valor de b: ");
            b = entrada.nextDouble();
            System.out.print("Digite el valor de c: ");
            c = entrada.nextDouble();
            System.out.println("");
            raiz = new Raices(a,b,c);
            raiz.calcular();
            System.out.println("");
            System.out.print("¿Desea continuar?: ");
            respuesta = entrada.next();
            System.out.println("");
            if(respuesta.equalsIgnoreCase("si")){
                contador++;
                estado = true;
                
            }else{
                contador++;
                System.out.println("La cantidad de veces que usted calculo la ecuacion es: "+contador);
                estado = false;
            }
        }
    }

}
