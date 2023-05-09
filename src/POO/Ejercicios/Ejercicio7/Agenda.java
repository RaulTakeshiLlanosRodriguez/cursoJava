/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.Ejercicios.Ejercicio7;

/**
 *
 * @author rllan
 */
public class Agenda {
    
    private Contacto contactos[];
    
    //Establecemos un tamaño por defecto de 10 contactos
    public Agenda() {
        contactos = new Contacto[10];
    }
    
    public Agenda(int tamaño){
        contactos = new Contacto[tamaño];
    }
    
    //creamos el metodo para añadir contactos a la agenda
    public void añadirContacto(Contacto contacto){
        if(comprobarSiExisteContacto(contacto)){
            System.out.println("\nYa existe un contacto con ese nombre");
        }
        if(comprobarSiAgendaEstaLlena()){
            System.out.println("\nLa agenda esta llena");
        }
        else{
            boolean registrado = false;
            for (int i = 0; i < contactos.length && !registrado; i++) {
                if(contactos[i] == null){
                    contactos[i] = contacto;
                    registrado = true;
                }
            }
            if(registrado == true){
                System.out.println("\nEl contacto se ha registrado con exito");
            }else{
                System.out.println("\nEl contacto no se ha podido registrar");
            }
        }
    }
    
    //creamos el metodo para comprobar si existe un contacto con el mismo nombre
    public boolean comprobarSiExisteContacto(Contacto contacto){
        for (int i = 0; i < contactos.length; i++) {
            if(contactos[i] != null && contactos[i].equals(contacto)){
                return true;
            }
        }
        return false;
    }
    
    //creamos el metodo para comprobar si la agenda esta llena
    public boolean comprobarSiAgendaEstaLlena(){
        for (int i = 0; i < contactos.length; i++) {
            if(contactos[i]==null){
                return false;
            }
        }
        return true;
    }
    
    //metodo para listar los contactos
    public void listarContactos(){
        if(comprobarHuecosLibres() == contactos.length){
            System.out.println("\nNo hay contactos para listar");
        }else{
            for (int i = 0; i < contactos.length; i++) {
                if(contactos[i] != null){
                    System.out.println("Nombre: "+contactos[i].getNombre());
                    System.out.println("Telefono: "+contactos[i].getTelefono());
                    System.out.println("");
                }
            }
        }
    }
    
    public int comprobarHuecosLibres(){
        int contadorVacios = 0;
        for (int i = 0; i < contactos.length; i++) {
            if(contactos[i] == null){
                contadorVacios++;
            }
        }
        return contadorVacios;
    }
    
    //metodo para buscar un contacto por nombre
    public void buscarContacto(String nombre){
        boolean encontrado = false;
        for (int i = 0; i < contactos.length && !encontrado; i++) {
            if(contactos[i] != null && contactos[i].getNombre().trim().equalsIgnoreCase(nombre.trim())){
                System.out.println("\nContacto encontrado, su telefono es: "+contactos[i].getTelefono());
                encontrado = true;
            }
        }
        if(!encontrado){
            System.out.println("\nNo se ha encontrado el contacto");
        }
    }
    
    //metodo para eliminar contacto
    public void eliminarContacto(Contacto contacto){
        boolean eliminado = false;
        for (int i = 0; i < contactos.length && !eliminado; i++) {
            if(contactos[i]!= null && contactos[i].equals(contacto)){
                contactos[i] = null;
                eliminado = true;
            }
        }
        if(eliminado){
            System.out.println("\nEl contacto se ha eliminado");
        }else{
            System.out.println("\nEl contacto no se ha eliminado");
        }
    }
    
}
