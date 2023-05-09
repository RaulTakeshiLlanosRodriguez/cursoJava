
package POO.BucleForEach;

public class Test {
    public static void main(String[] args) {
        /*
        String nombres[] = new String[3];
        nombres[0] = "Juan";
        nombres[1] = "Messi";
        nombres[2] = "Lionel";
        
        int edades[] = new int[3];
        edades[0] = 14;
        edades[1] = 15;
        edades[2] = 16;
        
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Nombre: "+nombres[i]);
        }
        System.out.println("");
        
        //bucle for each
        for(String elemento: nombres){
            System.out.println("Nombre: "+elemento);
        }
        
        for(int lista:edades){
            System.out.println("Edad: "+lista);
        }
        */
        
        //creamos el arreglo de objetos
        Persona personas[] = new Persona[4];
        personas[0] = new Persona("Raul","Llanos",22,12345);
        personas[1] = new Persona("Lucia","Cornejo",21,123456);
        personas[2] = new Persona("Ebelyn","Dominguez",23,1345);
        personas[3] = new Persona("Rosa","Melano",24,1356);
        
        for(Persona persona: personas){
            persona.mostrarDatos();
            System.out.println("");
        }
    }
}
