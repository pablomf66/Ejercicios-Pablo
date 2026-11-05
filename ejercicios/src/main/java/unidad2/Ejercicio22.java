package unidad2;

import java.util.Random;

public class Ejercicio22 {

    public static void main(String[] args) {
        Random r = new Random();
        int opcion;

        do {
            int n = Integer.parseInt(IO.readln("Introduce el número de lanzamientos N: "));

            // Acumuladores individuales para cada cara del dado
            int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0, c6 = 0;

            for (int i = 0; i < n; i++) {
                int cara = r.nextInt(6) + 1; // Genera enteros en el intervalo [1, 6]
                switch (cara) {
                    case 1 -> c1++;
                    case 2 -> c2++;
                    case 3 -> c3++;
                    case 4 -> c4++;
                    case 5 -> c5++;
                    case 6 -> c6++;
                }
            }

            System.out.println("\n--- RESULTADOS DE LOS LANZAMIENTOS ---");
            System.out.println("Cara 1: " + c1 + " veces");
            System.out.println("Cara 2: " + c2 + " veces");
            System.out.println("Cara 3: " + c3 + " veces");
            System.out.println("Cara 4: " + c4 + " veces");
            System.out.println("Cara 5: " + c5 + " veces");
            System.out.println("Cara 6: " + c6 + " veces");

            System.out.println("\n1. Simular de nuevo");
            System.out.println("0. Salir");
            opcion = Integer.parseInt(IO.readln("Selecciona una opción: "));

        } while (opcion != 0);

        System.out.println("Programa finalizado.");
    }
}