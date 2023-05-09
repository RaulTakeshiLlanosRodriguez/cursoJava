/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.Ejercicios.Ejercicio1;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Figuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Perimetros perimetro = new Perimetros();
        Areas area = new Areas();
        Heron heron = new Heron();
        int opcion = 0;

        do {
            System.out.println("\n\tMENU");
            System.out.println("1. Areas");
            System.out.println("2. Perimetros");
            System.out.println("3. Ley de Heron");
            System.out.println("4. Salir");
            System.out.print("Digite una opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n\tMENU DE AREAS");
                    System.out.println("1. Cuadrado");
                    System.out.println("2. Circulo");
                    System.out.println("3. Triangulo");
                    System.out.println("4. Rectangulo");
                    System.out.print("Digite una opcion: ");
                    int elecccionArea = entrada.nextInt();
                    switch (elecccionArea) {
                        case 1:
                            System.out.print("\nDigite un lado: ");
                            float lado = entrada.nextFloat();
                            float areaCuadrado = area.calcularAreaCuadrado(lado);
                            System.out.println("\nEl area del cuadrado es: " + areaCuadrado);
                            break;
                        case 2:
                            System.out.print("\nDigite el radio: ");
                            float radio = entrada.nextFloat();
                            float areaCirculo = area.calcularAreaCirculo(radio);
                            System.out.println("\nEl area de circulo es: " + areaCirculo);
                            break;
                        case 3:
                            System.out.print("\nDigite la base: ");
                            float base = entrada.nextFloat();
                            System.out.print("\nDigite la altura: ");
                            float altura = entrada.nextFloat();
                            float areaTriangulo = area.calcularAreaTriangulo(base, altura);
                            System.out.println("\nEl area del triangulo es: " + areaTriangulo);
                            break;
                        case 4:
                            System.out.print("\nDigite la base: ");
                            float baseRecta = entrada.nextFloat();
                            System.out.print("\nDigite la altura: ");
                            float alturaRecta = entrada.nextFloat();
                            float areaRectangulo = area.calcularAreaRectangulo(baseRecta, alturaRecta);
                            System.out.println("\nEl area del rectangulo es: " + areaRectangulo);
                            break;

                        default:
                            System.out.println("\nOpcion no disponible");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("\n\tMENU DE PERIMETROS");
                    System.out.println("1. Cuadrado");
                    System.out.println("2. Circulo");
                    System.out.println("3. Triangulo");
                    System.out.println("4. Rectangulo");
                    System.out.print("Digite una opcion: ");
                    int elecccionPerimetros = entrada.nextInt();

                    switch (elecccionPerimetros) {
                        case 1:
                            System.out.print("\nDigite un lado: ");
                            float lado = entrada.nextFloat();
                            float perimetroCuadrado = perimetro.calcularPerimetroCuadrado(lado);
                            System.out.println("\nEl perimetro del cuadrado es: " + perimetroCuadrado);
                            break;
                        case 2:
                            System.out.print("\nDigite el diametro: ");
                            float diametro = entrada.nextFloat();
                            float perimetroCirculo = perimetro.calcularPerimetroCirculo(diametro);
                            System.out.println("\nEl perimetro del circulo es: " + perimetroCirculo);
                            break;
                        case 3:
                            System.out.print("\nDigite el lado 1: ");
                            float lado1 = entrada.nextFloat();
                            System.out.print("\nDigite el lado 2: ");
                            float lado2 = entrada.nextFloat();
                            System.out.print("\nDigite el lado 3: ");
                            float lado3 = entrada.nextFloat();
                            float perimetroTriangulo = perimetro.calcularPerimetroTriangulo(lado1, lado2, lado3);
                            System.out.println("\nEl perimetro del triangulo es: " + perimetroTriangulo);

                            break;
                        case 4:
                            System.out.print("\nDigite la base: ");
                            float base = entrada.nextFloat();
                            System.out.print("\nDigite la altura: ");
                            float altura = entrada.nextFloat();
                            float perimetroRectangulo = perimetro.calcularPerimetroRectangulo(base, altura);
                            System.out.println("\nEl perimetro del rectangulo es: " + perimetroRectangulo);
                            break;
                        default:
                            System.out.println("\nOpcion no disponible");
                            break;
                    }
                    break;
                case 3:
                    float a,
                     b,
                     c;
                    System.out.print("\nDigite el primer lado: ");
                    a = entrada.nextFloat();
                    System.out.print("\nDigite el segundo lado: ");
                    b = entrada.nextFloat();
                    System.out.print("\nDigite el tercer lado: ");
                    c = entrada.nextFloat();
                    float leyHeron = heron.calcularLeyHeron(a, b, c);
                    System.out.println("\nLa ley de Heron es: " + leyHeron);
                    break;
                case 4:
                    opcion = 4;
                    System.out.println("\nGracia por participar");
                    break;
                default:
                    System.out.println("\nOpcion no disponible");
                    break;
            }
        } while (opcion != 4);
    }

}
