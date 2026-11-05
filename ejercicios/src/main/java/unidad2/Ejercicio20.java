package unidad2;

public class Ejercicio20 {

    public static void main(String[] args) {
        int n = Integer.parseInt(IO.readln("Introduce el número de filas (n): "));

        System.out.println("\n=== TRIÁNGULO 1 ===");
        triangulo1(n);

        System.out.println("\n=== TRIÁNGULO 2 ===");
        triangulo2(n);

        System.out.println("\n=== TRIÁNGULO 3 ===");
        triangulo3(n);

        System.out.println("\n=== TRIÁNGULO 4 ===");
        triangulo4(n);

        System.out.println("\n=== TRIÁNGULO 5 ===");
        triangulo5(n);

        System.out.println("\n=== TRIÁNGULO 6 ===");
        triangulo6(n);
    }

    // 1. Rectángulo decreciente (alineado a la izquierda)
    static void triangulo1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 2. Rectángulo decreciente (alineado a la derecha)
    static void triangulo2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 3. Rectángulo creciente (alineado a la izquierda)
    static void triangulo3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 4. Rectángulo creciente (alineado a la derecha)
    static void triangulo4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 5. Pirámide centrada
    static void triangulo5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 6. Pirámide invertida
    static void triangulo6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * (n - i) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}