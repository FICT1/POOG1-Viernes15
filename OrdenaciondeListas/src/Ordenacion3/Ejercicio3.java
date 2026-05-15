package Ordenacion3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();

        try {

            for (int i = 0; i < 5; i++) {

                System.out.print("Ingrese un numero: ");
                int numero = entrada.nextInt();

                numeros.add(numero);

            }

            Collections.sort(numeros, Collections.reverseOrder());

            System.out.println("\nNumeros ordenados de mayor a menor:");
            System.out.println(numeros);

        } catch (Exception e) {

            System.out.println("Error: ingrese solamente numeros enteros.");

        }

    }
}