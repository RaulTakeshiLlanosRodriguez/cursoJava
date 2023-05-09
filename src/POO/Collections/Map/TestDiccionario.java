package POO.Collections.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestDiccionario {

    public static void main(String[] args) {

        Map<Integer, String> diccionarioHash = new HashMap<>();
        diccionarioHash.put(5, "Raul");
        diccionarioHash.put(2, "Christian");
        diccionarioHash.put(1, "Jorge");
        diccionarioHash.put(4, "Davo");

        for (Map.Entry<Integer, String> entry : diccionarioHash.entrySet()) {
            System.out.println("Clave: " + entry.getKey()+" - Valor: " + entry.getValue());
        }
        System.out.println("");
        Map<Integer, String> diccionarioTree = new TreeMap<>();
        diccionarioTree.put(4, "Raul");
        diccionarioTree.put(2, "Bromita");
        diccionarioTree.put(1, "Jiji");
        
        for (Map.Entry<Integer,String> entrada: diccionarioTree.entrySet()) {
            System.out.println("Clave: " + entrada.getKey()+" - Valor: " + entrada.getValue());
        }

    }

}
