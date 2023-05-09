package POO.Ejercicios.Ejercicio10;

public class Electrodomestico {

    //asignamos valores por defecto
    protected final static String COLOR_DEFECTO = "Blanco";
    protected final static char CONSUMO_ENERGETICO_DEFECTO = 'F';
    protected final static double PRECIO_BASE_DEFECTO = 100;
    protected final static double PESO_DEFECTO = 5;

    //creamos los atributos
    protected String color;
    protected char consumoEnergetico;
    protected double precio;
    protected double peso;

    //creamos el metodo para comprobar el color del electrodomestico
    private void comprobarColor(String color) {
        String colores[] = {"blanco", "azul", "negro", "rojo", "gris"};
        boolean encontrado = false;

        for (int i = 0; i < colores.length && !encontrado; i++) {
            if (colores[i].endsWith(color)) {
                encontrado = true;
            }
        }
        if (encontrado) {
            this.color = color;
        } else {
            this.color = COLOR_DEFECTO;
        }
    }

    //metodo para comprobar el consumo energetico
    public final void comprobarConsumoEnergetico(char consumoEnergetico) {
        if (consumoEnergetico >= 65 && consumoEnergetico <= 70) {
            this.consumoEnergetico = consumoEnergetico;
        } else {
            this.consumoEnergetico = CONSUMO_ENERGETICO_DEFECTO;
        }
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPrecio() {
        return precio;
    }

    public double getPeso() {
        return peso;
    }

    public double obtenerPrecioFinal() {
        double plus = 0;
        switch (consumoEnergetico) {
            case 'A':
                plus += 100;
                break;
            case 'B':
                plus += 80;
                break;
            case 'C':
                plus += 60;
                break;
            case 'D':
                plus += 50;
                break;
            case 'E':
                plus += 30;
                break;
            case 'F':
                plus += 10;
                break;
        }

        if (peso >= 0 && peso <= 19) {
            plus += 10;

        } else if (peso >= 20 && peso <= 49) {
            plus += 50;
        } else if (peso >= 50 && peso <= 79) {
            plus += 80;
        } else if (peso >= 80) {
            plus += 100;
        }

        return precio + plus;
    }

    public Electrodomestico(String color, char consumoEnergetico, double precio, double peso) {
        
        this.precio = precio;
        this.peso = peso;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoEnergetico);
    }

}
