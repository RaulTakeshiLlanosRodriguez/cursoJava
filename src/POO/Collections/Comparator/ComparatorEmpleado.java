/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.Collections.Comparator;

import java.util.Comparator;

/**
 *
 * @author USER
 */
public class ComparatorEmpleado implements Comparator<Empleado> {

    @Override
    public int compare(Empleado primerEmpleado, Empleado segundoEmpleado) {
        //usamos esto cuando queremos ordenamos datos de tipo String
        //return primerEmpleado.getNombre().compareTo(segundoEmpleado.getNombre());
        int respuesta = 0;
        if(primerEmpleado.getEdad()> segundoEmpleado.getEdad()){
            respuesta = 1; //positivo
        }
        else if(primerEmpleado.getEdad() < segundoEmpleado.getEdad()){
            respuesta = -1; // negativo
        }else{
            respuesta = 0;
        }
        return respuesta;
    }

}
