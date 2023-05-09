package POO.Ejercicios.Ejercicio13;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.TreeMap;

public class TestInventarioProductos {

    public static void main(String[] args) {

        HashMap<String, Integer> inventario = new HashMap<>();
        TreeMap<String, Integer> inventarioOrdenado;
        Scanner entrada = new Scanner(System.in);
        entrada.useDelimiter("\n");

        int opcion = 0;

        System.out.println("Inventario de Productos");
        System.out.println("------------------------");

        while (opcion != 8) {
            System.out.println("1. Añadir Producto");
            System.out.println("2. Añadir stock de un producto");
            System.out.println("3. Eliminar stock de un producto");
            System.out.println("4. Listar Productos y su stock");
            System.out.println("5. Eliminar Producto");
            System.out.println("6. Ordenar productos ascendentemente");
            System.out.println("7. Ordenar producto descendentemente");
            System.out.println("8. Salir");

            try {

                System.out.print("Digite una opcion: ");
                opcion = entrada.nextInt();

                String producto;
                int stock, stockActual;

                switch (opcion) {
                    case 1:
                        System.out.print("\nDigite el nombre del producto: ");
                        producto = entrada.next();

                        if (inventario.containsKey(producto)) {
                            System.out.println("Ya existe el producto");
                        } else {
                            inventario.put(producto, 0);
                            System.out.println("Se ha añadido el producto");
                        }
                        break;
                    case 2:
                        System.out.print("\nDigite el nombre del producto: ");
                        producto = entrada.next();

                        if (inventario.containsKey(producto)) {
                            System.out.print("Digite la cantidad: ");
                            stock = entrada.nextInt();
                            if (stock > 0) {
                                stockActual = inventario.get(producto);
                                inventario.put(producto, stockActual + stock);
                                System.out.println("Se ha añadido " + stock + " de stock al producto " + producto);
                            } else {
                                System.out.println("No se puede añadir stock negativo");
                            }
                        } else {
                            System.out.println("No existe el producto");
                        }
                        break;
                    case 3:
                        System.out.print("\nDigite el nombre del producto: ");
                        producto = entrada.next();

                        if (inventario.containsKey(producto)) {
                            System.out.print("\nDigite el stock a eliminar: ");
                            stock = entrada.nextInt();

                            if (stock > 0) {
                                stockActual = inventario.get(producto);
                                if (stockActual > stock) {
                                    inventario.put(producto, stockActual - stock);
                                } else {
                                    System.out.println("No hay suficiente stock a eliminar");
                                }
                            } else {
                                System.out.println("No se puede elminar un stock negativo");
                            }
                        } else {
                            System.out.println("No existe el producto");
                        }
                        break;
                    case 4:
                        for (String productos : inventario.keySet()) {
                            stock = inventario.get(productos);
                            System.out.println("");
                            System.out.println("Clave: " + productos);
                            System.out.println("Stock: " + stock);
                        }
                        break;
                    case 5:
                        System.out.print("\nDigite el nombre del producto a eliminar: ");
                        producto = entrada.next();

                        if (inventario.containsKey(producto)) {
                            inventario.remove(producto);
                            System.out.println("Producto eliminado");
                        } else {
                            System.out.println("No existe el producto");
                        }

                        break;
                    case 6:
                        inventarioOrdenado = new TreeMap<>(new OrdenProductosAscendente());
                        inventarioOrdenado.putAll(inventario);

                        for (String i : inventarioOrdenado.keySet()) {
                            stock = inventarioOrdenado.get(i);
                            System.out.println("");
                            System.out.println("Clave: " + i);
                            System.out.println("Stock: " + stock);
                        }
                        break;
                    case 7:
                        inventarioOrdenado = new TreeMap<>(new OrdenProductoDescendente());
                        inventarioOrdenado.putAll(inventario);

                        for (String i : inventarioOrdenado.keySet()) {
                            stock = inventarioOrdenado.get(i);
                            System.out.println("");
                            System.out.println("Clave: " + i);
                            System.out.println("Stock: " + stock);
                        }

                        break;
                    case 8:
                        System.out.println("\nGracias por participar");
                        opcion = 8;
                        break;
                    default:
                        System.out.println("\nOpcion no disponible");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("");
                System.out.println("Vuelva a intentarlo, solo acepta numeros");
            }

        }
    }

}
