package Ejemplo3;

import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        LinkedList<String> productos = new LinkedList<>();

        productos.add("Laptop");
        productos.add("Mouse");
        productos.add("Teclado");
        productos.add("Monitor");

        System.out.println("Lista actual de productos:");
        System.out.println(productos);

        System.out.print("\nIngrese el producto que desea eliminar: ");
        String producto = entrada.nextLine();

        if (productos.remove(producto)) {

            System.out.println("Producto eliminado correctamente.");

        } else {

            System.out.println("El producto no existe en la lista.");

        }

        System.out.println("\nLista final:");
        System.out.println(productos);

    }
}