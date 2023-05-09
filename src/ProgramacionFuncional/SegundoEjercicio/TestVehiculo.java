package ProgramacionFuncional.SegundoEjercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestVehiculo {
    
    public static void main(String[] args) {
        
        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Vehiculo("1111AAA", Modelo.BMW, 10000));
        vehiculos.add(new Vehiculo("2222BBB", Modelo.AUDI, 20000));
        vehiculos.add(new Vehiculo("3333CCC", Modelo.OPEL, 30000));
        vehiculos.add(new Vehiculo("4444DDD", Modelo.BMW, 100000));
        vehiculos.add(new Vehiculo("5555EEE", Modelo.AUDI, 200000));
        vehiculos.add(new Vehiculo("6666FFF", Modelo.OPEL, 300000));
        vehiculos.add(new Vehiculo("7777GGG", Modelo.CITROEN, 0));
        vehiculos.add(new Vehiculo("728287GGG", Modelo.AUDI, 90000));
        
        System.out.println("Listado de kilometros multiplicados por 2");
        List<Integer> resultado = vehiculos.stream()
                .map(v -> v.getKilometros() * 2)
                .collect(Collectors.toList());
        resultado.forEach(System.out::println);
        
        System.out.println("");
        System.out.println("Listado de los kilometros de los vehiculos");
        List<Integer> resultadoKilometros = vehiculos.stream()
                .map(Vehiculo::getKilometros)
                .collect(Collectors.toList());
        resultadoKilometros.forEach(System.out::println);
        
        System.out.println("");
        System.out.println("Listado de los vehiculos con modelo AUDI");
        List<Vehiculo> vehiculosAudi = vehiculos.stream()
                .filter(v -> v.getModelo().equals(Modelo.AUDI))
                .collect(Collectors.toList());
        vehiculosAudi.forEach(System.out::println);
        
        System.out.println("");
        System.out.println("Vehiculos ordenados por la cantidad de kilometros");
        List<Vehiculo> vehiculosOrdenados = vehiculos.stream()
                .sorted((v1, v2) -> Integer.compare(v1.getKilometros(), v2.getKilometros()))
                .collect(Collectors.toList());
        vehiculosOrdenados.forEach(System.out::println);
        
        System.out.println("");
        System.out.println("Vehiculos ordenados sin que se repitan los modelos: ");
        List<Modelo> vehiculosDistintos = vehiculos.stream()
                .map(Vehiculo::getModelo)
                .distinct()
                .collect(Collectors.toList());
        vehiculosDistintos.forEach(System.out::println);
        
        System.out.println("");
        System.out.println("Listado de los vehiculos con mas de 20000 kilometros e imprimir el objeto");
        List<String> resultadoPeek = vehiculos.stream()
                .filter(v -> v.getKilometros() > 20000)
                .peek(v -> System.out.println(v))
                .map(Vehiculo::getMatricula)
                .peek(v -> System.out.println(v))
                .collect(Collectors.toList());
        resultadoPeek.forEach(System.out::println);
        
        System.out.println("");
        System.out.println("Agrupar a los vehiculos por modelo");
        Map<Modelo, List<Vehiculo>> groupByModelo = vehiculos.stream()
                .collect(Collectors.groupingBy(Vehiculo::getModelo));
        groupByModelo.forEach((K, V) -> {
            System.out.println("Modelo: " + K);
            V.forEach(System.out::println);
        });
        
        System.out.println("");
        System.out.println("Suma de todos los kilometros de todos los vehiculos");
        Integer resultadoSuma = vehiculos.stream()
                .map(v -> v.getKilometros())
                .reduce(0, Integer::sum);
        System.out.println(resultadoSuma);
        
        System.out.println("");
        System.out.println("Listado de dos vehiculos menores o iguales a 100000");
        vehiculos.stream()
                .filter(v -> v.getKilometros() <= 100000)
                .map(Vehiculo::getModelo)
                .distinct()
                .limit(2)
                .forEach(System.out::println);
    }
    
}
