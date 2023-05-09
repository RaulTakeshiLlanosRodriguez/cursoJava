package POO.Ejercicios.Ejercicio11.servicio;

import POO.Ejercicios.Ejercicio11.datos.AccesoDatosImpl;
import POO.Ejercicios.Ejercicio11.datos.IAccesoDatos;
import POO.Ejercicios.Ejercicio11.domain.Pelicula;
import POO.Ejercicios.Ejercicio11.excepciones.AccesoDatosExcepcion;
import java.util.List;

public class ControlPeliculasImpl implements IControlPeliculas {

    private final IAccesoDatos datos;

    public ControlPeliculasImpl() {
        this.datos = new AccesoDatosImpl();
    }

    @Override
    public void agregarPelicula(String nombrePelicula) {
        Pelicula pelicula = new Pelicula(nombrePelicula);
        boolean anexar = false;

        try {
            anexar = datos.comprobarSiExisteArchivo(NOMBRE_RECURSO); //si anexar es true, existe el archivo de lo contrario si es false no existe
            datos.escribir(pelicula, NOMBRE_RECURSO, anexar);
        } catch (AccesoDatosExcepcion e) {
            System.out.println("\nError de acceso a datos");
            e.printStackTrace(System.out);
        }
    }

    @Override
    public void listarPeliculas() {
        try {
            List<Pelicula> peliculas = this.datos.listar(NOMBRE_RECURSO);
            for (Pelicula pelicula : peliculas) {
                System.out.println("Pelicula: " + pelicula);
            }
        } catch (AccesoDatosExcepcion e) {
            System.out.println("\nError de acceso a datos");
            e.printStackTrace(System.out);
        }
    }

    @Override
    public void buscarPelicula(String peliculaBuscar) {
        String resultado = null;

        try {
            resultado = this.datos.buscar(NOMBRE_RECURSO, peliculaBuscar);
        } catch (AccesoDatosExcepcion e) {
            System.out.println("\nError de acceso a datos");
            e.printStackTrace(System.out);
        }
        if (resultado == null) {
            System.out.println("No se ha encontrado la pelicula");
        } else {
            System.out.println("Pelicula encontrada: " + resultado);
        }
    }

    @Override
    public void iniciarControlPeliculas() {
        //metodo que elimina y crea un archivo de texto
        try {
            if (this.datos.comprobarSiExisteArchivo(NOMBRE_RECURSO)) {
                datos.borrar(NOMBRE_RECURSO);
                datos.crear(NOMBRE_RECURSO);
            } else {
                datos.crear(NOMBRE_RECURSO);
            }
        } catch (AccesoDatosExcepcion e) {
            System.out.println("\nError al iniciar control de peliculas");
            e.printStackTrace(System.out);
        }
    }

}
