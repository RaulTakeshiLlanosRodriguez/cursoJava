
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class VentanasEmergentes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        double numero_decimal;
        float numero_flotante;
        String cadena;
        char caracter;
        
        //aplicamos las ventanas emergentes
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        numero_decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un numero deciaml: "));
        numero_flotante = Float.parseFloat(JOptionPane.showInputDialog("Digite un numero flotante: "));
        cadena = JOptionPane.showInputDialog("Digite la cadena: ");
        caracter = JOptionPane.showInputDialog("Digite un caracter: ").charAt(0);
        
        JOptionPane.showMessageDialog(null, "El numero entero es: "+numero);
        JOptionPane.showMessageDialog(null, "El numero decimal es: "+numero_decimal);
        JOptionPane.showMessageDialog(null, "El numero flotante es: "+numero_flotante);
        JOptionPane.showMessageDialog(null, "La cadena es: "+cadena);
        JOptionPane.showMessageDialog(null, "El caracter es: "+caracter);
        
    }
    
}
