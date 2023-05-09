
package POO.Collections.List_ArrayList;

import java.util.*;

public class TestListas {

    public static void main(String[] args) {
        
        List<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(1); // posicion 0
        listaNumeros.add(2); // posicion 1
        listaNumeros.add(3); // posicion 2
        listaNumeros.add(4); // posicion 3
        
        //remove elimina la posicion del elemento de la lista
        //listaNumeros.remove(1);
        //Collections.sort(listaNumeros);//ordena los elementos de la lista
        Collections.reverse(listaNumeros); //invierte la lista
        for(Integer numeros: listaNumeros){
            System.out.println("Numero: "+numeros);
        }
        
        System.out.println(listaNumeros.isEmpty());
        System.out.println("El mayor elemento es: "+Collections.max(listaNumeros));
        System.out.println("El menor elemento es: "+Collections.min(listaNumeros));
        System.out.println("\nEl tamaño de la lista es: "+listaNumeros.size());
        System.out.println("Obtengo un elemento: "+listaNumeros.get(0));
        System.out.println("Obtenemos la posicion de un elemento: "+listaNumeros.indexOf(3)); // se obtiene la posicion de elemento
        listaNumeros.clear(); //elimina todos los elementos de la lista
        System.out.println("\nEl tamaño de la lista es: "+listaNumeros.size());
        
    }
    
}
