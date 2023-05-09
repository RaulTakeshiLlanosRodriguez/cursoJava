
package POO.Ejercicios.Ejercicio10;

public class Lavadora extends Electrodomestico{
    
    private int carga;
    
    public Lavadora(String color, char consumoEnergetico, double precio, double peso, int carga) {
        super(color, consumoEnergetico, precio, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    @Override
    public double obtenerPrecioFinal() {
        double plus = super.obtenerPrecioFinal();
        if(carga > 30){
            plus += 50;
        }
        return plus;
    }
    
    
    
}
