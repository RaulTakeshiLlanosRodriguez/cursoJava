/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.SobrecargaMetodos;

/**
 *
 * @author USER
 */
public class Ejecucion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sobrecarga metodos = new Sobrecarga(100, "Alonso");
        
        int edad =metodos.calcular(2021, 2006);
        System.out.println(edad);
        
        int numero = metodos.calcular();
        System.out.println(numero);
    }
    
}
