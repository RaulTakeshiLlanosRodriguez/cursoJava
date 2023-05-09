/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.setters_getters;

/**
 *
 * @author USER
 */
public class Persona {
    private int edad;
    private String nombre;
    private double altura;
    
    //setters y getters
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
        
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public double getAltura(){
        return altura;
    }
    
}
