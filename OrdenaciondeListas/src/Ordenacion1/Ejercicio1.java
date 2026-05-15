package Ordenacion1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();

        try {

            for (int i = 0; i < 5; i++) {

                System.out.print("Ingrese un numero: ");
                int numero = entrada.nextInt();

                numeros.add(numero);

            }

            Collections.sort(numeros);

            System.out.println("\nNumeros ordenados de menor a mayor:");
            System.out.println(numeros);

        } catch (Exception e) {

            System.out.println("Error: ingrese solamente numeros enteros.");

        }

    }
}