package Ejemplo2;

import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        LinkedList<String> nombres = new LinkedList<>();

        System.out.print("Ingrese un nombre: ");
        nombres.add(entrada.nextLine());

        System.out.print("Ingrese otro nombre: ");
        nombres.add(entrada.nextLine());

        System.out.print("Ingrese un nombre al inicio: ");
        nombres.addFirst(entrada.nextLine());

        System.out.print("Ingrese un nombre al final: ");
        nombres.addLast(entrada.nextLine());

        System.out.println("\nLista de nombres:");
        System.out.println(nombres);

    }
}