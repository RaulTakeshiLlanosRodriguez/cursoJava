/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.introduccion;

/**
 *
 * @author USER
 */
public class MainLavadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creamos el objeto;
        Lavadora lavadora = new Lavadora();
        String color =lavadora.color="rojo";
        String modelo =lavadora.modelo ="modelo avanzado";
        int numSerie = lavadora.numeroSerie=1234567;
        float precio = lavadora.precio = 900.9f;
        
        System.out.println("La lavadora tiene las siguientes caracteristicas: ");
        System.out.println("Color: "+color);
        System.out.println("Modelo: "+modelo);
        System.out.println("Numero de serie: "+numSerie);
        System.out.println("Precio: "+precio);
    }
    
}
