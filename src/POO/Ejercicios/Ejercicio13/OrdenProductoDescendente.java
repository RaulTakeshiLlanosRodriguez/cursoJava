/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.Ejercicios.Ejercicio13;

import java.util.Comparator;

/**
 *
 * @author USER
 */
public class OrdenProductoDescendente implements Comparator<String> {

    @Override
    public int compare(String primerObjeto, String segundoObjeto) {
        return segundoObjeto.compareTo(primerObjeto);
    }

}
