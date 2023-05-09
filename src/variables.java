/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
        /*
        espacio de memoria que se encarga de guardar
        un dato
            int: numeros enteros
            float: valores flotantes: decimales 1.2,3.5,91.8
            double: valores decimales 1.2, 4.5
            char: letras A,B,C,D, E,Z
            boolean: valores booleanos true o false
            String: textos o cadenas: Holaaa
        */
        //creando la primera variable entera
        int numero=100;
        System.out.println(numero);
        
        //creamos las variables flotantes y decimales
        float numero_float = 2.5f;
        System.out.println(numero_float);
        
        double numero_double = 2.5;
        System.out.println(numero_double);
        
        //creamos las variables caracteres y String
        String texto = "Hola me llamo Takeshi";
        texto += " Soy de Peru";
        System.out.println(texto);
        
        //creamos una variable char:
        char caracter = 'a';
        System.out.println(caracter);
        
        //creamos variable booleana
        boolean bandera = true;
        System.out.println(bandera);
        
    }
    
}
