package POO.Ejercicios.Ejercicio8;

public abstract class Empleado {
    private String nombre;
    private int edad;
    private double salario;
    public final double PLUS =300;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    //el metodo se va a implementar en sus clases hijas
    public abstract boolean plus();

    @Override
    public String toString() {
        return "\nNombre: "+nombre+"\nEdad: "+edad+"\nSalario: "+salario;
    }
    
    
    
}
