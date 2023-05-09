/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Condicionales;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class CondicionalesEjercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int coordenadaX;
        int coordenadaY;
        
        System.out.print("Digite la coordenada x del plano: ");
        coordenadaX= entrada.nextInt();
        
        System.out.print("Digite la coordenada y del plano: ");
        coordenadaY = entrada.nextInt();
        System.out.println("");
        if(coordenadaX> 0 && coordenadaY>0){
            System.out.println("Las coordenadas estan en el primer cuadrante");
        }else{
            if(coordenadaX <0 && coordenadaY>0){
                System.out.println("Las coordenadas estan en el segundo cuadrante");
            }else if(coordenadaX<0 && coordenadaY<0){
                System.out.println("Las coordenadas estan en el tercer cuadrante");
            }else if(coordenadaX>0 && coordenadaY<0){
                System.out.println("Las coordenadas estan en el cuarto cuadrante");
            }
        }
    }
    
}
