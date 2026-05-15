package Ejemplo2;

import java.util.ArrayList;

public class Ejercicio2 {

    public static void main(String[] args) {

        ArrayList<String> estudiantes = new ArrayList<>();

        estudiantes.add("Antonio");
        estudiantes.add("Maria");
        estudiantes.add("Carlos");
        estudiantes.add("Lucia");

        // Eliminar un nombre
        estudiantes.remove("Carlos");

        System.out.println("Lista actualizada de estudiantes:");

        for (String estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    }
}