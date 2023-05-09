/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroduccionBucles;

import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class BuclesEjercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int contador = 0;
        int aleatorio = (int)(Math.random()*50); 
        int numero;
        
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            
            if(numero < aleatorio){
                System.out.println("Digite un numero mayor");
            }else{
                System.out.println("Digite un numero menor");
            }
            contador++;
        }while(numero != aleatorio);
        System.out.println("");
        System.out.println("La cantidad de intentos fueron: "+contador);
    }
    
}
