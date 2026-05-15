package Ordenacion2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        ArrayList<String> nombres = new ArrayList<>();

        for (int i = 0; i < 5; i++) {

            System.out.print("Ingrese un nombre: ");
            String nombre = entrada.nextLine();

            nombres.add(nombre);

        }

        Collections.sort(nombres);

        System.out.println("\nNombres ordenados alfabeticamente:");
        System.out.println(nombres);

    }
}