package POO.Excepciones;

public class TestExcepcionesPersonalizadas {

    public static void main(String[] args) {

        int resultado = 0;

        try {
            resultado = Division.dividir(10, 0);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            System.out.println("Fin del programa");
        }
    }

}
