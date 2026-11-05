package unidad2;

public class Ejercicio10 {

    public static void main(String[] args) {
        String entrada1 = IO.readln("Introduce el primer carácter: ");
        char c1 = entrada1.charAt(0);

        String entrada2 = IO.readln("Introduce el segundo carácter: ");
        char c2 = entrada2.charAt(0);

        System.out.println("\nCaracteres comprendidos entre '" + c1 + "' y '" + c2 + "':");

        mostrarCaracteresEntre(c1, c2);
    }

    static void mostrarCaracteresEntre(char c1, char c2) {
        char inicio = (char) Math.min(c1, c2);
        char fin = (char) Math.max(c1, c2);

        for (char c = inicio; c <= fin; c++) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}