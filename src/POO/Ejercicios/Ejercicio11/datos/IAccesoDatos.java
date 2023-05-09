
package POO.Ejercicios.Ejercicio11.datos;

import POO.Ejercicios.Ejercicio11.domain.Pelicula;
import POO.Ejercicios.Ejercicio11.excepciones.AccesoDatosExcepcion;
import POO.Ejercicios.Ejercicio11.excepciones.EscrituraDatosExcepcion;
import POO.Ejercicios.Ejercicio11.excepciones.LecturaDatosExcepcion;
import java.util.List;

public interface IAccesoDatos {
    
    public boolean comprobarSiExisteArchivo(String nombreRecurso) throws AccesoDatosExcepcion;
    public List<Pelicula> listar(String nombreRecurso) throws LecturaDatosExcepcion;
    public void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosExcepcion;
    public String buscar(String nombreRecurso, String buscar) throws LecturaDatosExcepcion;
    public void crear(String nombreRecurso) throws AccesoDatosExcepcion;
    public void borrar(String nombreRecurso)  throws AccesoDatosExcepcion;
}
