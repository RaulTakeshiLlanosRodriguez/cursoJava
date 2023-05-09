package POO.ClasesMetodosFinal;

//public final class Figura {
//esta clase no puede tener hijas ya que es de tipo final
public class Figura {

    protected double tamaño;

    public Figura(double tamaño) {
        this.tamaño = tamaño;
    }

    //no se hereda este metodo porque es de tipo final
    public final void dibujar() {
        System.out.println("Dibujando figura");
    }

    public void pintar() {
        System.out.println("Pintando figura");
    }
}
