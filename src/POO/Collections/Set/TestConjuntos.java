package POO.Collections.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestConjuntos {

    public static void main(String[] args) {
        Set<String> conjuntoHash = new HashSet<>();
        conjuntoHash.add("Peru");
        conjuntoHash.add("Argetina");
        conjuntoHash.add("Brasil");
        conjuntoHash.add("Colombia");
        conjuntoHash.add("Colombia");
        conjuntoHash.add("Colombia");
        System.out.println("HashSet: ");
        System.out.println("---------------");
        for (String valor : conjuntoHash) {
            System.out.println("Valor: " + valor);
        }

        System.out.println("");

        Set<String> conjuntoTree = new TreeSet<>();
        conjuntoTree.add("Peru");
        conjuntoTree.add("Colombia");
        conjuntoTree.add("Ace");
        conjuntoTree.add("Mauricio");
        conjuntoTree.add("Takeshi");
        conjuntoTree.add("Elvis");
        System.out.println("TreeSet: ");
        System.out.println("---------------");
        for (String valor2 : conjuntoTree) {
            System.out.println("Valor: " + valor2);
        }
        System.out.println("");
        Set<Character> conjuntoLinked = new LinkedHashSet<>();
        conjuntoLinked.add('b');
        conjuntoLinked.add('e');
        conjuntoLinked.add('z');
        conjuntoLinked.add('g');
        conjuntoLinked.add('a');
        conjuntoLinked.add('a');
        conjuntoLinked.add('n');
        System.out.println("LinkedHashSet: ");
        System.out.println("---------------");
        for (Character caracter : conjuntoLinked) {
            System.out.println("Caracter: " + caracter);
        }
    }

}
