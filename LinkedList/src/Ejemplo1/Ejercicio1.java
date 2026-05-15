package Ejemplo1;

import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        LinkedList<Integer> numeros = new LinkedList<>();

        try {

            System.out.print("Cuantos numeros desea ingresar: ");
            int cantidad = entrada.nextInt();

            for (int i = 0; i < cantidad; i++) {

                System.out.print("Ingrese un numero: ");
                int numero = entrada.nextInt();

                numeros.add(numero);

            }

            System.out.println("\nLista de numeros:");
            System.out.println(numeros);

        } catch (Exception e) {

            System.out.println("Error: solo se permiten numeros enteros.");

        }

    }
}