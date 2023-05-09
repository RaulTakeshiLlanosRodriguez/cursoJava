package POO.Ejercicios.Ejercicio8;

public class EmpleadoRepartidor extends Empleado {

    private String zona;

    public EmpleadoRepartidor(String nombre, int edad, double salario, String zona) {
        super(nombre, edad, salario);
        this.zona = zona;
    }

    @Override
    public boolean plus() {
        if (super.getEdad() < 25 && this.zona.equalsIgnoreCase("Lima")) {
            double nuevoSalario = super.getSalario() + super.PLUS;
            super.setSalario(nuevoSalario);
            System.out.println("\nSe le ha añadido el PLUS al empleado " + super.getNombre());
            System.out.println("Su salario actual es: " + nuevoSalario);
            return true;
        } else {
            System.out.println("\nEl empleado no cumple con los requisitos");
            return false;
        }
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Zona: " + zona;
    }

}
