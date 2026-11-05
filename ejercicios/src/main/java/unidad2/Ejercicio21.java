package unidad2;

public class Ejercicio21 {

    public static void main(String[] args) {
        int n = Integer.parseInt(IO.readln("Introduce la posición n de Fibonacci: "));

        long fibIterativo = fibonacciIterativo(n);
        long fibExplicito = fibonacciExplicito(n);

        System.out.println("Fibonacci(" + n + ") [Iterativo]: " + fibIterativo);
        System.out.println("Fibonacci(" + n + ") [Fórmula de Binet]: " + fibExplicito);
    }

    // Cálculo iterativo sumando los dos términos anteriores
    static long fibonacciIterativo(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;

        long a = 0;
        long b = 1;

        for (int i = 2; i <= n; i++) {
            long c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    // Cálculo explícito usando la fórmula de Binet
    static long fibonacciExplicito(int n) {
        if (n <= 0) return 0;

        double phi = (1 + Math.sqrt(5)) / 2;
        double psi = (1 - Math.sqrt(5)) / 2;

        double resultado = (Math.pow(phi, n) - Math.pow(psi, n)) / Math.sqrt(5);
        return Math.round(resultado);
    }
}