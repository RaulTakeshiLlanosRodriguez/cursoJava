package POO.Ejercicios.Ejercicio12;

public class VideoJuego implements Entregable {

    public final static int MAYOR = 1;
    public final static int MENOR = -1;
    public final static int IGUAL = 0;

    private String titulo;
    private int horasEstimadas;
    private boolean entregado;
    private String genero;
    private String compañia;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    public VideoJuego(String titulo, int horasEstimadas, String genero, String compañia) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = false;
        this.genero = genero;
        this.compañia = compañia;
    }

    @Override
    public String toString() {
        return "\nInformacion del VideoJuego: \n"
                + "\tTitulo: " + titulo + "\n"
                + "\tHoras Estimadas: " + horasEstimadas + "\n"
                + "\tGenero: " + genero + "\n"
                + "\tCompañia: " + compañia;
    }

    public boolean equals(VideoJuego juego) {
        if (titulo.equalsIgnoreCase(juego.getTitulo()) && compañia.equalsIgnoreCase(juego.getCompañia())) {
            return true;
        }
        return false;
    }

    @Override
    public void entregar() {
        entregado = true;
    }

    @Override
    public void devolver() {
        entregado = false;
    }

    @Override
    public boolean comprobarSiEsEntregado() {
        if (entregado) {
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Object objeto) {
        int estado = MENOR;

        VideoJuego juego = (VideoJuego) objeto;

        if (horasEstimadas > juego.getHorasEstimadas()) {
            estado = MAYOR;
        } else if (horasEstimadas == juego.getHorasEstimadas()) {
            estado = IGUAL;
        }
        return estado;
    }

}
