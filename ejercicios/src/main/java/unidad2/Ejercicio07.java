package unidad2;

public class Ejercicio07 {

    public static void main(String[] args) {
        int h = Integer.parseInt(IO.readln("hora: "));
        int m = Integer.parseInt(IO.readln("min: "));
        int s = Integer.parseInt(IO.readln("seg: "));

        String siguienteSegundo = hora(h, m, s);
        System.out.println("El segundo siguiente es: " + siguienteSegundo);
    }
    static String hora(int h, int m, int s) {
        s += 1;
        if (s == 60) {
            s = 0;
            m += 1;
            if (m == 60) {
                m = 0;
                h += 1;
                if (h == 24) {
                    h = 0;
                }
            }
        }
        return String.format("%02d:%02d:%02d", h, m, s);
    }
}