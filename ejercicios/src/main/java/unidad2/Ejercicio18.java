package unidad2;

public class Ejercicio18 {

    public static void main(String[] args) {
        int opcion;

        do {
            int tabla;
            do {
                tabla = Integer.parseInt(IO.readln("¿Qué tabla deseas repasar (1-9)?: "));
            } while (tabla < 1 || tabla > 9);

            int fallos = 0;

            for (int i = 1; i <= 10; i++) {
                int resultadoCorrecto = tabla * i;
                int respuesta = Integer.parseInt(IO.readln(tabla + " x " + i + " = "));

                if (respuesta != resultadoCorrecto) {
                    fallos++;
                    System.out.println("Incorrecto. La respuesta correcta es: " + resultadoCorrecto);
                }
            }

            System.out.println("\n--- RESULTADO DE LA TABLA DEL " + tabla + " ---");
            System.out.println("Total de fallos: " + fallos);

            if (fallos < 2) {
                System.out.println("¡HAS APROBADO!");
            } else {
                System.out.println("HAS SUSPENDIDO (2 o más fallos).");
            }

            System.out.println("\n1. Repasar otra tabla");
            System.out.println("0. Salir");
            opcion = Integer.parseInt(IO.readln("Selecciona una opción: "));

        } while (opcion != 0);

        System.out.println("Programa finalizado.");
    }
}