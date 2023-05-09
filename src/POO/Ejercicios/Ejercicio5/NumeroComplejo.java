
package POO.Ejercicios.Ejercicio5;

public class NumeroComplejo {
    
    //creamos los atributos de un numero complejo
    private double parteReal;
    private double parteImaginaria;

    public NumeroComplejo(double parteReal, double parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }

    public double getParteReal() {
        return parteReal;
    }

    public double getParteImaginaria() {
        return parteImaginaria;
    }
    
    //creamos el metodo para calcular la suma de numeros complejos
    public NumeroComplejo calcularSuma(NumeroComplejo numero){
        NumeroComplejo suma = new NumeroComplejo(parteReal + numero.getParteReal(), parteImaginaria + numero.getParteImaginaria());
        return suma;
    }
    
    //metodo para calcular el producto de numeros complejos
    public NumeroComplejo calcularProducto(NumeroComplejo numero){
        NumeroComplejo producto = new NumeroComplejo((parteReal*numero.getParteReal()- parteImaginaria*numero.getParteImaginaria()), (parteReal*numero.getParteImaginaria()+numero.getParteReal()*parteImaginaria));
        return producto;
    }
    
    //metodo para comprobar igualdad
    public boolean comprobarIgualdad(NumeroComplejo numero){
        boolean igualdad = false;
        if(parteReal == numero.getParteReal() && parteImaginaria == numero.getParteImaginaria()){
            igualdad = true;
        }
        return igualdad;
    }
    
    //metodo para calcular producto de entero por complejo
    public NumeroComplejo calcularProductoEntero(int numero){
        NumeroComplejo productoEntero = new NumeroComplejo(parteReal*numero, parteImaginaria*numero);
        return productoEntero;
    }
}
