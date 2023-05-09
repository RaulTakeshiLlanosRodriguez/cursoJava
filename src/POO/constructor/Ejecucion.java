/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.constructor;

import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Ejecucion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int nElementos;
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño del arreglo: "));
        
        Constructor arreglo = new Constructor(nElementos);
        arreglo.imprimir();
    }
    
}
