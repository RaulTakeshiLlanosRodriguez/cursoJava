/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.Ejercicios.Ejercicio3;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Movimientos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x, y;
        int opcion;
        int incremento = 0;
        
        System.out.print("Digite la posicion inicial de X: ");
        x = entrada.nextInt();
        System.out.print("Digite la posicion inicial de Y: ");
        y = entrada.nextInt();
        
        Tablero tablero = new Tablero(x,y);
        
        do{
            System.out.println("\n\tMENU");
            System.out.println("1. Mover hacia arriba");
            System.out.println("2. Mover a la derecha");
            System.out.println("3. Mover hacia abajo");
            System.out.println("4. Mover a la izquierda");
            System.out.println("5. Salir");
            System.out.print("Digite una opcion: ");
            opcion = entrada.nextInt();
            
            if(opcion !=5){
                System.out.print("\nDigite el incremento o decremento de una coordenada: ");
                incremento = entrada.nextInt();
            }
            
            switch(opcion){
                case 1:
                    tablero.moverArriba(incremento);
                    break;
                case 2:
                    tablero.moverDerecha(incremento);
                    break;
                case 3:
                    tablero.moverAbajo(incremento);
                    break;
                case 4:
                    tablero.moverIzquierda(incremento);
                    break;
                case 5:
                    System.out.println("Posicion actual (x)(y) es: ("+tablero.getX()+") ("+tablero.getY()+")");
                    opcion = 5;
                    break;
                default:
                    System.out.println("\nOpcion no disponible");
                    break;
            }
            System.out.println("Posicion actual (x)(y) es: ("+tablero.getX()+") ("+tablero.getY()+")");
        }while(opcion != 5);
                
    }
    
}
