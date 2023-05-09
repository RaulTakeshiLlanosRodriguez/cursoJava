package POO.Collections.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestEmpleado {

    public static void main(String[] args) {
        
        List<Empleado> listaEmpleados = new ArrayList<>();
        
        listaEmpleados.add(new Empleado("Raul","Llanos","Peru",22,5000));
        listaEmpleados.add(new Empleado("Ronaldo","Nazario","Brasil",42,10000));
        listaEmpleados.add(new Empleado("Lionel","Messi","Argentina",35,1000000));
        listaEmpleados.add(new Empleado("Ronaldinho","Gaucho","Brail",40,2000000));
        
        Collections.sort(listaEmpleados, new ComparatorEmpleado());
        
        for(Empleado empleado: listaEmpleados){
            System.out.println("");
            System.out.println("Nombre: "+empleado.getNombre());
            System.out.println("Apellido: "+empleado.getApellido());
            System.out.println("Pais: "+empleado.getPais());
            System.out.println("Edad: "+empleado.getEdad());
            System.out.println("Sueldo: "+empleado.getSueldo());
        }
    }
}
