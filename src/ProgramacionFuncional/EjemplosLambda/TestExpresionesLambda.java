package ProgramacionFuncional.EjemplosLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class TestExpresionesLambda {

    public static void main(String[] args) {

        //forma tradicional
        /*
        for(Integer numero : Arrays.asList(1,2,3,4,5,6,7,8,9,10)){
            System.out.println(numero);
        }
         */
        //imprimir una lista utilizando expresiones lambda
        //Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).forEach(System.out::println);
        ArrayList<Integer> mayores = (ArrayList<Integer>) Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .stream()
                //filtro para obtener los numeros mayores a 5
                .filter(x -> x > 5)
                //pone los elementos que se filtraron dentro de una nueva lista
                //.collect(Collectors.toCollection(() -> new ArrayList<Integer>()));
                .collect(Collectors.toList());
        mayores.forEach(n -> System.out.println(n));

    }

}
