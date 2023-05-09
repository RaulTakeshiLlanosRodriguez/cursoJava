
package POO.Ejercicios.Ejercicio6;

public class Cliente {
    private String nombre;
    private String apellido;
    private String dni;
    Cuentas cuentas[];

    public Cliente(String nombre, String apellido, String dni, Cuentas[] cuentas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuentas = cuentas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }
    
    //metodo para retornar saldo
    public double consultarSaldo(int indice){   
        return cuentas[indice].getSaldo();
    }
    
    //metodo para ingresar dinero
    public void ingresarDinero(int indice, double cantidad){
        cuentas[indice].ingresarDinero(cantidad);
    }
    
    //metodo para retirar dinero
    public void retirarDinero(int indice, double cantidad){
        cuentas[indice].retirarDinero(cantidad);
    }
}
