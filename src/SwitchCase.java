
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
public class SwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char camino ;
        System.out.print("Digite el camino que desea: ");
        camino = entrada.next().charAt(0);
        switch(camino){
            case 'A':
                System.out.println("Elegiste el camino A");
                break;
            case 'B':
                System.out.println("Elegiste el camino B");
                break;
            case 'C':
                System.out.println("Elegiste el camino C");
                break;
            default:
                System.out.println("No se ha elegido ningun camino");
        }
    }
    
}
