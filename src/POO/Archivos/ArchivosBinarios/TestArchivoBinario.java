package POO.Archivos.ArchivosBinarios;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestArchivoBinario {

    //metodo para escribir en archivo binario
    private void escribirBinario() {
        try {
            FileOutputStream archivo = new FileOutputStream("personas.bin");
            ObjectOutputStream escritura = new ObjectOutputStream(archivo);

            escritura.writeObject(new Persona(15, "Raul Llanos"));
            escritura.writeObject(new Persona(16, "Flor Llanos"));
            escritura.writeObject(new Persona(17, "Paula Llanos"));
            System.out.println("Objeto añadido con exito");
            escritura.close();

        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }

    //metodo para leer archivo binario
    private void leerBinario() throws ClassNotFoundException {
        Persona persona;
        try {
            FileInputStream archivo = new FileInputStream("personas.bin");
            ObjectInputStream lectura = new ObjectInputStream(archivo);
            
            while(true){
                persona = (Persona)lectura.readObject();
                persona.mostrarDatos();
            }
            
        }catch(EOFException exception){
            return;
        } 
        catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }
    
    private void añadirBinario(){
         try {
            FileOutputStream archivo = new FileOutputStream("personas.bin", true);
            AñadirContenido escritura = new AñadirContenido(archivo);

            escritura.writeObject(new Persona(18, "Raul Llanos"));
            escritura.writeObject(new Persona(19, "Flor Polo"));
            escritura.writeObject(new Persona(20, "Mario Iribarra"));
            System.out.println("Objeto añadido con exito");
            escritura.close();

        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {
        TestArchivoBinario binario = new TestArchivoBinario();
        binario.escribirBinario();
        binario.añadirBinario();
        binario.leerBinario();
    }
}
