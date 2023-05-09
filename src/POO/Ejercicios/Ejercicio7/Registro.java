/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.Ejercicios.Ejercicio7;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author rllan
 */
public class Registro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        int telefono;
        String nombre;
        Contacto contacto;
        
        int tamañoAgenda;
        tamañoAgenda = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el tamaño de la agenda"));
        Agenda agenda = new Agenda(tamañoAgenda);
        
        do{
            System.out.println("\n\tBIENBENIDO A LA TELEFONICA");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Listar contacto");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Comprobar si existe un contacto");
            System.out.println("5. Eliminar contacto");
            System.out.println("6. Comprobar contacto disponibles");
            System.out.println("7. Comprobar si la agenda esta llena");
            System.out.println("8. Salir");
            System.out.println("");
            System.out.print("Digite una opcion: ");
            opcion = entrada.nextInt();
            
            switch(opcion){
                
                //añadir contacto
                case 1:
                    System.out.print("\nDigite su nombre: ");
                    nombre = entrada.next();
                    System.out.print("\nDigite su telefono: ");
                    telefono = entrada.nextInt();
                    
                    contacto = new Contacto(nombre,telefono);
                    agenda.añadirContacto(contacto);
                    System.out.println("");
                    break;
                //listar contacto
                case 2:
                    agenda.listarContactos();
                    break;
                //buscamos un contacto
                case 3:
                    System.out.println("\nDigite el nombre a buscar:" );
                    nombre = entrada.next();
                    agenda.buscarContacto(nombre);
                    System.out.println("");
                    break;
                //comprobar si existe contacto
                case 4:
                    System.out.print("\nDigite su nombre: ");
                    nombre = entrada.next();
                    
                    contacto = new Contacto(nombre);
                    if(agenda.comprobarSiExisteContacto(contacto)){
                        System.out.println("\nEl contacto existe");
                    }else{
                        System.out.println("\nEl contacto no existe");
                    }
                    System.out.println("");
                    break;
                //eliminamos un contacto
                case 5:
                    System.out.print("\nDigite el nombre a eliminar: ");
                    nombre = entrada.next();
                    
                    contacto = new Contacto(nombre);
                    agenda.eliminarContacto(contacto);
                    System.out.println("");
                    break;
                //comprobar contacto disponible
                case 6:
                    System.out.println("\nHay: "+agenda.comprobarHuecosLibres()+" contactos");
                    break;
                //comprobar si la agenda esta llena
                case 7:
                    if(agenda.comprobarSiAgendaEstaLlena()){
                        System.out.println("\nLa agenda esta llena");
                    }else{
                        System.out.println("\nAun puedes registrar contactos");
                    }
                    break;
                case 8:
                    System.out.println("\nGracias por participar");
                    opcion = 8;
                    break;
                default:
                    System.out.println("\nOpcion no disponible");
                    break;
            }
        }while(opcion !=8);
        
    }
    
}
