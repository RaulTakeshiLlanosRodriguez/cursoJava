package POO.Ejercicios.Ejercicio12;

public class Serie implements Entregable {

    public final static int MAYOR = 1;
    public final static int MENOR = -1;
    public final static int IGUAL = 0;

    private String titulo;
    private int nroTemporadas;
    private boolean esEntregado;
    private String genero;
    private String creador;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNroTemporadas() {
        return nroTemporadas;
    }

    public void setNroTemporadas(int nroTemporadas) {
        this.nroTemporadas = nroTemporadas;
    }

    public boolean isEsEntregado() {
        return esEntregado;
    }

    public void setEsEntregado(boolean esEntregado) {
        this.esEntregado = esEntregado;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public Serie(String titulo, int nroTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.nroTemporadas = nroTemporadas;
        this.esEntregado = false;
        this.genero = genero;
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "\nInformacion de la Serie: \n"
                + "\tTitulo: " + titulo + "\n"
                + "\tNumero de temporadas: " + nroTemporadas + "\n"
                + "\tGenero: " + genero + "\n"
                + "\tCreador: " + creador;
    }

    public boolean equals(Serie serie) {
        if (titulo.equalsIgnoreCase(serie.getTitulo()) && creador.equalsIgnoreCase(serie.getCreador())) {
            return true;
        }
        return false;
    }

    @Override
    public void entregar() {
        esEntregado = true;
    }

    @Override
    public void devolver() {
        esEntregado = false;
    }

    @Override
    public boolean comprobarSiEsEntregado() {
        if (esEntregado) {
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Object objeto) {
        int estado = MENOR;

        //hacemos un casting de objetos para usar el metodo get
        Serie serie = (Serie) objeto;
        if (nroTemporadas > serie.getNroTemporadas()) {
            estado = MAYOR;
        } else if (nroTemporadas == serie.getNroTemporadas()) {
            estado = IGUAL;
        }
        return estado;
    }

}
