package unidad2;

public class Ejercicio19 {

    public static void main(String[] args) {
        int n = 1;
        int f = Integer.parseInt(IO.readln("Numero de filas: "));

        int max = f * (f + 1) / 2;                      // investigar y aprender a razonar pòrque max y digitos se calcula asi
        int digitos = String.valueOf(max).length();

        String formato = String.format("%%-%dd ", digitos);

        for (int i = 1; i <= f; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf(formato, n);
                n++;
            }
            System.out.println();
        }
    }
}