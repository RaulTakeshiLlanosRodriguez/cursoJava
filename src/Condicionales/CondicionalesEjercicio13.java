/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class CondicionalesEjercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char caracter = JOptionPane.showInputDialog("Digite un caracter:").charAt(0);

        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Digite una opcion: "
                + "\n1. Convertir a mayuscula"
                + "\n2. Convertir a minuscula"));
        if (opcion == 1) {
            if (Character.isUpperCase(caracter)) {
                JOptionPane.showMessageDialog(null, "El caracter ya esta en mayuscula");
            } else {
                char caracter_mayusucla = Character.toUpperCase(caracter);
                JOptionPane.showMessageDialog(null, "El caracter convertido a mayuscula es: " + caracter_mayusucla);
            }
        } else if (opcion == 2) {
            if (Character.isLowerCase(caracter)) {
                JOptionPane.showMessageDialog(null, "El caracter ya esta en minuscula");
            } else {
                char caracter_minuscula = Character.toLowerCase(caracter);
                JOptionPane.showMessageDialog(null, "El caracter convertido a minuscula es: " + caracter_minuscula);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Opcion no disponible");
        }
    }

}
