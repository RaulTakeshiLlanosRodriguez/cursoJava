package POO.Ejercicios.Ejercicio8;

public class EmpleadoComercial extends Empleado{
    
    private double comision;

    public EmpleadoComercial(String nombre, int edad, double salario, double comision) {
        super(nombre, edad, salario);
        this.comision = comision;
    }

    @Override
    public boolean plus() {
        if(super.getEdad()>30 && this.comision >200){ //la palabra super hace referencia a la super clase
            double nuevoSalario = super.getSalario()+super.PLUS;
            super.setSalario(nuevoSalario);
            System.out.println("\nSe le ha añadido el PLUS al empleado "+super.getNombre());
            System.out.println("Su salario actual es: "+nuevoSalario);
            return true;
        }else{
            System.out.println("\nEl empleado no cumple con los requisitos");
            return false;
        }
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Comision: "+comision;
    }
    
    
}
