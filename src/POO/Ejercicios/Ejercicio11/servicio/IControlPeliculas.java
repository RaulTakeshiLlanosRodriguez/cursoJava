package POO.Ejercicios.Ejercicio11.servicio;

public interface IControlPeliculas {

    String NOMBRE_RECURSO = "peliculas.txt";

    public void agregarPelicula(String nombrePelicula);

    public void listarPeliculas();

    public void buscarPelicula(String peliculaBuscar);

    public void iniciarControlPeliculas();
}
