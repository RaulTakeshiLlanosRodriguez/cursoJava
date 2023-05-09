
package POO.Ejercicios.Ejercicio10;

public class Televisor extends Electrodomestico{
    
    private int resolucion;
    private boolean sincronizadorTDT;
    
    public Televisor(String color, char consumoEnergetico, double precio, double peso, int resolucion, boolean sincronizadorTDT) {
        super(color, consumoEnergetico, precio, peso);
        this.resolucion = resolucion;
        this.sincronizadorTDT = sincronizadorTDT;
    }

    @Override
    public double obtenerPrecioFinal() {
        double plus = super.obtenerPrecioFinal();
        if(resolucion > 40){
            plus += precio*0.3;
        }
        if(sincronizadorTDT){
            plus += 50;
        }
        return plus;
    }
    
    
    
}
