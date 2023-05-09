package POO.Collections.equals_hashcode;

public class TestEmpleado {

    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado("Raul",22);
        Empleado empleado2 = new Empleado("Gabriel",23);
        
        //uso de equals
        if(empleado1.equals(empleado2)){
            System.out.println("Los objetos son iguales");
            
        }else{
            System.out.println("Los objetos no son iguales");
        }
        
        //uso de hashcode
        if(empleado1.hashCode() == empleado2.hashCode()){
            System.out.println("Los hash son iguales");
        }else{
            System.out.println("Los hash no son iguales");
        }
    }

}
