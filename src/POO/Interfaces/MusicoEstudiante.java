package POO.Interfaces;

public class MusicoEstudiante  implements Musico,Estudiante{

    @Override
    public void tocarMusica() {
        System.out.println("Estoy tocando instrumentos musicales");
    }

    @Override
    public void hablar() {
        System.out.println("Estoy hablando");
    }

    @Override
    public void estudiar() {
        System.out.println("Estoy estudiando programacion");
    }

}
