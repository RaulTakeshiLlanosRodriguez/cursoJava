package ProgramacionFuncional.PrimerEjercicio.modelo;

import java.util.ArrayList;
import java.util.List;

public class TestAlumno {
    
    public static void main(String[] args) {
        
        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno(1, "32922785", "Raul Takeshi", "Llanos Rodriguez", "Programacion", 16, 22));
        alumnos.add(new Alumno(2, "32922786", "Luis Rodrigo", "Ramos Rodriguez", "Html", 15, 23));
        alumnos.add(new Alumno(3, "32922787", "Raul Paolo", "Cornjeo Rodriguez", "CSS", 14, 24));
        alumnos.add(new Alumno(4, "32922788", "Raul Piero", "Ramirez Rodriguez", "Java", 13, 25));
        alumnos.add(new Alumno(5, "32922789", "Raul Gerard", "Ore Rodriguez", "Microservicios", 12, 22));
        alumnos.add(new Alumno(6, "32922781", "Raul Paulo", "Montoya Rodriguez", "Literatura", 17, 22));
        alumnos.add(new Alumno(7, "32922782", "Raul Rafael", "Paredes Rodriguez", "CTA", 16, 22));
        alumnos.add(new Alumno(8, "32922783", "Raul Ronaldo", "Canales Rodriguez", "Biologia", 18, 22));
        alumnos.add(new Alumno(9, "32922784", "Raul Neymar", "Velasquez Rodriguez", "Spring Boot", 19, 18));
        alumnos.add(new Alumno(10, "32922775", "Raul Christian", "Quiñones Rodriguez", "Angular", 11, 16));
        alumnos.add(new Alumno(11, "32922765", "Griezman Yoshimar", "Horna Rodriguez", "Arquitectura de software", 10, 19));
        alumnos.add(new Alumno(12, "32922755", "Gian Edison", "Avila Rodriguez", "SQL Server", 12, 22));
        alumnos.add(new Alumno(13, "32922745", "German Luis", "Garcia Rodriguez", "MySql", 14, 22));
        alumnos.add(new Alumno(14, "32922735", "Raul Pedro", "Huertas Rodriguez", "MongoDB", 15, 21));
        alumnos.add(new Alumno(15, "32922725", "Raul Andres", "Otarola Rodriguez", "PHP", 20, 20));
        
        System.out.println("\nLista de alumnos");
        System.out.println("--------------------");
        alumnos.stream().forEach(a -> a.imprimirDatos());
        
        System.out.println("\nAlumnos cuyo nombre empiezan con L u G");
        System.out.println("--------------------");
        alumnos.stream()
                .filter(c -> c.getNombres().charAt(0) == 'L' || c.getNombres().charAt(0) == 'G')
                .forEach(c -> c.imprimirDatos());
        System.out.println("\nNumero de alumnos");
        System.out.println("--------------------");
        System.out.println(alumnos.stream().count());
        System.out.println("\nAlumno con menor edad");
        System.out.println("--------------------");
        System.out.println(alumnos.stream().min((a1, a2) -> a1.getEdad() - a2.getEdad()));
        System.out.println("\nAlumno con mayor edad");
        System.out.println("--------------------");
        System.out.println(alumnos.stream().max((a1, a2) -> a1.getEdad() - a2.getEdad()));
        System.out.println("\nPrimer Alumno: ");
        System.out.println("--------------------");
        System.out.println(alumnos.stream().findFirst());
        System.out.println("\nAlumnos cuyos nombre de los cursos terminan en t: ");
        System.out.println("--------------------");
        alumnos.stream().filter(a -> a.getNombreCurso().endsWith("t")).forEach(Alumno::imprimirDatos);
        System.out.println("\nAlumnos cuyos nombre de los cursos que contiene la a: ");
        System.out.println("--------------------");
        alumnos.stream().filter(a -> a.getNombreCurso().contains("a")).forEach(Alumno::imprimirDatos);
        System.out.println("\nAlumnos que el tamaño de sus nombre es mayor a 10 caracteres ");
        System.out.println("--------------------");
        alumnos.stream().filter(a -> a.getNombres().length() > 10).forEach(Alumno :: imprimirDatos);
    }
    
}
