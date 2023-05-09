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
public class Perimetros {
    public float calcularPerimetroCuadrado(float lado){
        float perimetro = 4*lado;
        return perimetro;
    }
    
    public float calcularPerimetroTriangulo(float lado1, float lado2, float lado3){
        float perimetro = lado1+lado2+lado3;
        return perimetro;
    }
    
    public float calcularPerimetroCirculo(float diametro){
        float perimetro = (float)(diametro*Math.PI);
        return perimetro;
    }
    
    public float calcularPerimetroRectangulo(float base, float altura){
        float perimetro = 2*(base) + 2*(altura);
        return perimetro;
    }
}
