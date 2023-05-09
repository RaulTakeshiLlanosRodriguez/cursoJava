package POO.Excepciones;

public class Division {

    public static int dividir(int numerador, int denominador) throws OperacionAritmetica{
        //throws indica que hay una excepcion de tipo aritmetica
        if (denominador == 0) {
            throw new OperacionAritmetica("Error al dividir entre 0");
        }
        return numerador / denominador;
    }
}
