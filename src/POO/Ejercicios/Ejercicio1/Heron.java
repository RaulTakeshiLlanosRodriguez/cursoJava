/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.Ejercicios.Ejercicio1;

/**
 *
 * @author USER
 */
public class Heron {
    
    public float calcularLeyHeron(float a, float b, float c){
        float area = (a+b+c)/2;
        float resultado = (float)(Math.sqrt(area*(area-a)*(area-b)*(area-c)));
        return resultado;
    }
}
