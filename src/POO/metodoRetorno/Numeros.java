/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.metodoRetorno;

/**
 *
 * @author USER
 */
public class Numeros {

    public int calcularMayorNumeros(int primerValor, int segundoValor, int tercerValor) {
        int mayor;
        if (primerValor > segundoValor && primerValor > tercerValor) {
            mayor = primerValor;
        } else {
            if (segundoValor > tercerValor) {
                mayor = segundoValor;
            } else {
                mayor = tercerValor;
            }
        }
        return mayor;
    }
    
    public int calcularMenorNumero(int primerValor, int segundoValor, int tercerValor){
        int menor;
        if (primerValor < segundoValor && primerValor < tercerValor) {
            menor = primerValor;
        } else {
            if (segundoValor < tercerValor) {
                menor = segundoValor;
            } else {
                menor = tercerValor;
            }
        }
        return menor;
    }
}
