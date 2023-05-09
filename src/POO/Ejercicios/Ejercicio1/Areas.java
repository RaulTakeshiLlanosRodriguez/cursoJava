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
public class Areas {
    
    public float calcularAreaCuadrado(float lado){
        float area = lado * lado;
        return area;
    }
    
    public float calcularAreaCirculo(float radio){
        float area = (float)(Math.PI * (Math.pow(radio, 2)));
        return area;
    }
    
    public float calcularAreaTriangulo(float base, float altura){
        float area = (base*altura)/2;
        return area;
    }
    
    public float calcularAreaRectangulo(float base, float altura){
        float area = base*altura;
        return area;
    }
}
