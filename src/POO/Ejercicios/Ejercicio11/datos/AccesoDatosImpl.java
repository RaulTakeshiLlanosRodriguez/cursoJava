package POO.Ejercicios.Ejercicio11.datos;

import java.io.*;
import POO.Ejercicios.Ejercicio11.domain.Pelicula;
import POO.Ejercicios.Ejercicio11.excepciones.AccesoDatosExcepcion;
import POO.Ejercicios.Ejercicio11.excepciones.EscrituraDatosExcepcion;
import POO.Ejercicios.Ejercicio11.excepciones.LecturaDatosExcepcion;
import java.util.ArrayList;
import java.util.List;

public class AccesoDatosImpl implements IAccesoDatos {

    @Override
    public boolean comprobarSiExisteArchivo(String nombreRecurso) throws AccesoDatosExcepcion {

        File archivo = new File(nombreRecurso);
        return archivo.exists();
    }

    @Override
    public List<Pelicula> listar(String nombreRecurso) throws LecturaDatosExcepcion {
        File archivo = new File(nombreRecurso);
        List<Pelicula> peliculas = new ArrayList<>();

        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String contenido = null;
            contenido = entrada.readLine();
            while (contenido != null) {
                Pelicula pelicula = new Pelicula(contenido);
                peliculas.add(pelicula);
                contenido = entrada.readLine();
            }
            entrada.close();
        } catch (IOException e) {
            e.printStackTrace(System.out);
            throw new LecturaDatosExcepcion("Excepcion al listar peliculas: " + e.getMessage());
        }
        return peliculas;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosExcepcion {
        File archivo = new File(nombreRecurso);

        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(pelicula.toString());
            salida.close();
        } catch (IOException e) {
            e.printStackTrace(System.out);
            throw new EscrituraDatosExcepcion("Excepcion al escribir en el archivo: " + e.getMessage());
        }
    }

    @Override
    public String buscar(String nombreRecurso, String buscar) throws LecturaDatosExcepcion {
        File archivo = new File(nombreRecurso);
        String resultado = null;
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();
            int indice = 1;
            while (linea != null) {
                if (buscar != null && buscar.equalsIgnoreCase(linea)) {
                    System.out.println("");
                    resultado = "Pelicula " + linea + " encontrada en el indice " + indice;
                    break;
                }
                linea = entrada.readLine();
                indice++;
            }
            entrada.close();
        } catch (IOException e) {
            e.printStackTrace(System.out);
            throw new LecturaDatosExcepcion("Excepcion al buscar pelicula: " + e.getMessage());
        }
        return resultado;
    }

    @Override
    public void crear(String nombreRecurso) throws AccesoDatosExcepcion {
        File archivo = new File(nombreRecurso);

        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("Se ha creado el archivo");
        } catch (IOException excepcion) {
            excepcion.printStackTrace(System.out);
            throw new AccesoDatosExcepcion("Excepcion al crear archivo: " + excepcion.getMessage());
        }
    }

    @Override
    public void borrar(String nombreRecurso) throws AccesoDatosExcepcion {
        File archivo = new File(nombreRecurso);
        if (archivo.exists()) {
            archivo.delete();
        }
        System.out.println("Se ha borrado el archivo");
    }

}
