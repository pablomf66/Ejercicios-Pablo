package unidad2;

public class Ejercicio23 {

    public static void main(String[] args) {
        int opcion;

        do {
            double x1 = Double.parseDouble(IO.readln("Punto 1 - Coordenada X: "));
            double y1 = Double.parseDouble(IO.readln("Punto 1 - Coordenada Y: "));
            double x2 = Double.parseDouble(IO.readln("Punto 2 - Coordenada X: "));
            double y2 = Double.parseDouble(IO.readln("Punto 2 - Coordenada Y: "));

            double dist = calcularDistancia(x1, y1, x2, y2);
            System.out.printf("La distancia entre los puntos es: %.3f\n", dist);

            System.out.println("\n1. Calcular otra distancia");
            System.out.println("0. Salir");
            opcion = Integer.parseInt(IO.readln("Selecciona una opción: "));

        } while (opcion != 0);

        System.out.println("Programa finalizado.");
    }

    /**
     * Calcula la distancia euclídea entre dos puntos cartesiano en 2D.
     */
    static double calcularDistancia(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}