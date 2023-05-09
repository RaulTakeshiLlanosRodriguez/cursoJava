package POO.Ejercicios.Ejercicio12;

import java.util.ArrayList;
import java.util.List;

public class TestArticulos {

    public static void main(String[] args) {

        List<Serie> listaSeries = new ArrayList<>();
        List<VideoJuego> listaJuegos = new ArrayList<>();

        listaSeries.add(new Serie("El juego del calamar", 1, "accion", "Raul Llanos"));
        listaSeries.add(new Serie("Juego de tronos", 323, "Suspenso", "George Watts"));
        listaSeries.add(new Serie("Los Simpsons", 245, "Humor", "Matt Groen"));

        listaJuegos.add(new VideoJuego("Assasin creed 2", 500, "Aventura", "EA"));
        listaJuegos.add(new VideoJuego("Super Mario 3DS", 300, "Plataforma", "Nintendo"));
        listaJuegos.add(new VideoJuego("Donkey Kong", 100, "Plataforma", "Nintendo"));

        //entregamos los elementos de la lista de series
        for (int i = 0; i < listaSeries.size(); i++) {
            listaSeries.get(i).entregar();
        }

        //entregamos los elementos de la lista de juegos
        for (int j = 0; j < listaJuegos.size(); j++) {
            listaJuegos.get(j).entregar();
        }

        //nos sirve para contar el numero de articulos entregados
        int entregados = 0;

        //devolvemos los elementos de la lista de series
        for (int i = 0; i < listaSeries.size(); i++) {
            if (listaSeries.get(i).comprobarSiEsEntregado()) {
                entregados++;
                listaSeries.get(i).devolver();
            }
        }

        //devolvemos los elementos de la lista de juegos
        for (int i = 0; i < listaJuegos.size(); i++) {
            if (listaJuegos.get(i).comprobarSiEsEntregado()) {
                entregados++;
                listaJuegos.get(i).devolver();
            }
        }

        System.out.println("Hay " + entregados + " articulos entregados");
        System.out.println("");

        Serie serieMayor = listaSeries.get(0);
        VideoJuego videoJuegoMayor = listaJuegos.get(0);
        
        //hallamos el mayor elemento de la lista de series
        for (int i = 0; i < listaSeries.size(); i++) {
            if(listaSeries.get(i).compareTo(serieMayor)== Serie.MAYOR){
                serieMayor = listaSeries.get(i);
            }
        }
        
        //hallamos el mayor elemento de la lista de juegos
        for (int i = 0; i < listaJuegos.size(); i++) {
            if(listaJuegos.get(i).compareTo(videoJuegoMayor)== Serie.MAYOR){
                videoJuegoMayor = listaJuegos.get(i);
            }
        }
        
        Serie serieMenor = listaSeries.get(0);
        VideoJuego videoJuegoMenor = listaJuegos.get(0);
        
         //hallamos el menor elemento de la lista de series
        for (int i = 0; i < listaSeries.size(); i++) {
            if(listaSeries.get(i).compareTo(serieMenor)== Serie.MENOR){
                serieMenor = listaSeries.get(i);
            }
        }
        
        //hallamos el menor elemento de la lista de juegos
        for (int i = 0; i < listaJuegos.size(); i++) {
            if(listaJuegos.get(i).compareTo(videoJuegoMenor)== Serie.MENOR){
                videoJuegoMenor = listaJuegos.get(i);
            }
        }
        
        System.out.println("Articulos mayores: ");
        System.out.println("--------------------");
        
        System.out.println(serieMayor);
        System.out.println("");
        System.out.println(videoJuegoMayor);
        System.out.println("");
        System.out.println("");
        System.out.println("Articulos menores: ");
        System.out.println("--------------------");
        System.out.println(serieMenor);
        System.out.println("");
        System.out.println(videoJuegoMenor);
        
    }

}
