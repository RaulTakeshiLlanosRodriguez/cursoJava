/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.SobrecargaMetodos;

/**
 *
 * @author USER
 */
public class Sobrecarga {
    
    public Sobrecarga(int edad){
        System.out.println("La edad es: "+edad);
    }
    
    public Sobrecarga(int kilometros, String nombre){
        System.out.println("La persona "+nombre+" corre "+kilometros);
    }
    
    public Sobrecarga(float altura){
        System.out.println("La altura de la persona es: "+altura);
    }
    
    public int calcular(int fechaActual, int fechaNacimiento){
        int edad = fechaActual - fechaNacimiento;
        return edad;
    }
    
    public int calcular(){
        return 10*20;
    }
    
    public void saludar(){
        System.out.println("Hola buenas buenas");
    }
    
    public void saludar(String nombre){
        System.out.println("Hola mi nombre es: "+nombre);
    }
}
