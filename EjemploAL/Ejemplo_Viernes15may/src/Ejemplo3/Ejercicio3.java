package Ejemplo3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> productos = new ArrayList<>();

        System.out.print("¿Cuántos productos desea registrar?: ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < cantidad; i++) {

            System.out.print("Ingrese el nombre del producto: ");
            String producto = sc.nextLine();

            productos.add(producto);
        }

        System.out.println("\nProductos registrados:");

        for (String producto : productos) {
            System.out.println(producto);
        }

        System.out.println("\nCantidad total de productos: " + productos.size());

        sc.close();

    }
}