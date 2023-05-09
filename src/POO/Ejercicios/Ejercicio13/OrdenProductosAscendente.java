
package POO.Ejercicios.Ejercicio13;

import java.util.Comparator;

public class OrdenProductosAscendente implements Comparator<String>{

    @Override
    public int compare(String primerObjeto, String segundoObjeto) {
        return primerObjeto.compareTo(segundoObjeto);
    }
    
}
