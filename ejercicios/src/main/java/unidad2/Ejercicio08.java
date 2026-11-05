package unidad2;

public class Ejercicio08 {

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("\n=== CLASIFICADOR DE TRIÁNGULOS ===");
            System.out.println("1. Clasificar por la longitud de sus lados");
            System.out.println("2. Clasificar por sus ángulos interiores");
            System.out.println("0. Salir");
            
            opcion = Integer.parseInt(IO.readln("Seleccione una opción: "));

            switch (opcion) {
                case 1 -> {
                    double a = Double.parseDouble(IO.readln("Introduce el lado a: "));
                    double b = Double.parseDouble(IO.readln("Introduce el lado b: "));
                    double c = Double.parseDouble(IO.readln("Introduce el lado c: "));
                    
                    String resultado = clasificarPorLados(a, b, c);
                    System.out.println("El triángulo es: " + resultado);
                }
                case 2 -> {
                    double A = Double.parseDouble(IO.readln("Introduce el ángulo A (°): "));
                    double B = Double.parseDouble(IO.readln("Introduce el ángulo B (°): "));
                    double C = Double.parseDouble(IO.readln("Introduce el ángulo C (°): "));
                    
                    String resultado = clasificarPorAngulos(A, B, C);
                    System.out.println("El triángulo es: " + resultado);
                }
                case 0 -> System.out.println("Programa finalizado. ¡Hasta pronto!");
                default -> System.out.println("Opción no válida. Inténtelo de nuevo.");
            }

        } while (opcion != 0);
    }
    static String clasificarPorLados(double a, double b, double c) {
        boolean esValido = (a > 0 && b > 0 && c > 0) &&
                           (a + b > c) && (a + c > b) && (b + c > a);

        if (!esValido) {
            return "imposible";
        }

        if (a == b && b == c) {
            return "equilátero";
        } else if (a == b || a == c || b == c) {
            return "isósceles";
        } else {
            return "escaleno";
        }
    }

    static String clasificarPorAngulos(double a, double b, double c) {

        boolean esValido = (a > 0 && b > 0 && c > 0) &&
                           Math.abs((a + b + c) - 180.0) < 0.001;

        if (!esValido) {
            return "imposible";
        }

        if (a == 90 || b == 90 || c == 90) {
            return "rectángulo";
        } else if (a > 90 || b > 90 || c > 90) {
            return "obtusángulo";
        } else {
            return "acutángulo";
        }
    }
}