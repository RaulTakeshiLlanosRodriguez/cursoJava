
package POO.Ejercicios.Ejercicio9;

public class BebidaAzucarada extends Bebida{
    
    private double porcentaje;
    private boolean promocion; //es true por defecto

    public BebidaAzucarada(double cantidad, double precio, String marca, double porcentaje, boolean promocion) {
        super(cantidad, precio, marca);
        this.porcentaje = porcentaje;
        this.promocion = promocion;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public boolean isPromocion() {
        return promocion;
    }

    public void setPromocion(boolean promocion) {
        this.promocion = promocion;
    }

    @Override
    public double getPrecio() {
        if(isPromocion()){
            return super.getPrecio()*0.9; //le vamos a realizar un descuento del 10%
        }else{
            return super.getPrecio();
        }
    }

    @Override
    public String toString() {
        return super.toString()+"\nPorcentaje Azucar: "+porcentaje+"\nPromocion: "+promocion; 
    }
    
    
    
    
}
