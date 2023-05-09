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
public class Contacto {
    
    //creamos los atributos del contacto
    private String nombre;
    private int telefono;

    public Contacto(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Contacto(String nombre) {
        this.nombre = nombre;
        this.telefono = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    public boolean equals(Contacto contacto){
        if(this.nombre.trim().equalsIgnoreCase(contacto.getNombre().trim())){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Nombre: "+nombre+"\nTelefono: "+telefono+"\n";
    }
    
    
    
    
}
