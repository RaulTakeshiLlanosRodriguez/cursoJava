package POO.Archivos.archivoTexto;

import java.io.File;
import java.io.IOException;

public class ClaseFile {

    public static void main(String[] args) throws IOException {
        
        /*
        //clase File
        
        //pasamos la ruta relativa
        //File archivo = new File("Prueba.txt"); 
        
        //pasamos la ruta absoluta
        File archivo = new File("C:\\Users\\USER\\Documents\\NetBeansProjects\\CursoJava\\ruta\\Prueba.txt");
        try {
            if (archivo.createNewFile()) {
                System.out.println("El archivo ha sido creado con exito");
            } else {
                System.out.println("Ya existe el archivo");
            }
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
        */
        File archivo = new File("prueba.txt");
        
        System.out.println("El nombre del archivo: "+archivo.getName());
        System.out.println("Ruta del archivo: "+archivo.getAbsolutePath());
        System.out.println("¿Existe el archivo?: "+archivo.exists());
        System.out.println("Se puede escribir en el archivo: "+archivo.canWrite());
        System.out.println("Se puede leer el archivo?: "+archivo.canRead());
        System.out.println("Es archivo?: "+archivo.isFile());
        System.out.println("Es directorio?: "+archivo.isDirectory());
        System.out.println("Longitud: "+archivo.length());
        
       
        
    }
}
