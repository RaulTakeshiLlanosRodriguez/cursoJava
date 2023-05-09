package POO.Archivos.archivoTexto;

import java.io.*;

public class ArchivosTexto {

    File archivo;

    private void crearArchivoTexto() {
        archivo = new File("archivo.txt");
        try {

            if (archivo.createNewFile()) {
                System.out.println("Archivo creado con exito");
            } else {
                System.out.println("Error al crear archivo");
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    private void eliminarArchivoTexto() {

        if (archivo.delete()) {
            //System.out.println("Archivo eliminado con exito");
        } else {
            //System.out.println("Error al eliminar archivo");
        }

    }
    //metodo para escribir al archivo de texto
    private void escribirArchivoTexto(){
        try{
            FileWriter escritura = new FileWriter(archivo, true);
            escritura.write("Sanazoo");
            escritura.close();
            System.out.println("Texto añadido con exito");
        }catch(IOException e){
            e.printStackTrace(System.out);
        }
    }
    
    //metodo para leer el archivo de texto
    private void leerArchivoTexto(){
        
        String contenido;
        
        try{
            FileReader lector = new FileReader(archivo); //indicamos el archivo a leer
            BufferedReader lectura = new BufferedReader(lector); // pasamos el archivo a leer
            contenido = lectura.readLine();
            
            while(contenido != null){
                System.out.println(contenido);
                contenido = lectura.readLine();
            }
        }catch(IOException e){
            e.printStackTrace(System.out);
        }
    }
    
    public static void main(String[] args) {
        ArchivosTexto archivoTexto = new ArchivosTexto();
        archivoTexto.crearArchivoTexto();
        archivoTexto.escribirArchivoTexto();
        archivoTexto.leerArchivoTexto();
    }
}
