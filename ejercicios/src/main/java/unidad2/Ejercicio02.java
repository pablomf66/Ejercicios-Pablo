package unidad2;

public class Ejercicio02 {
    public static void main(String[] args) {
        // 1. Lectura de datos de la primera circunferencia
        double x1 = Double.parseDouble(IO.readln("Centro 1 - Coordenada X: "));
        double y1 = Double.parseDouble(IO.readln("Centro 1 - Coordenada Y: "));
        double r1 = Double.parseDouble(IO.readln("Radio 1: "));

        // 2. Lectura de datos de la segunda circunferencia
        double x2 = Double.parseDouble(IO.readln("Centro 2 - Coordenada X: "));
        double y2 = Double.parseDouble(IO.readln("Centro 2 - Coordenada Y: "));
        double r2 = Double.parseDouble(IO.readln("Radio 2: "));

        // 3. Cálculos auxiliares
        // Distancia entre los dos centros O1 y O2
        double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        double sumaRadios = r1 + r2;
        double difRadios = Math.abs(r1 - r2); // Valor absoluto para que siempre sea positivo

        // 4. Clasificación según la distancia y los radios
        if (d == 0) {
            System.out.println("Las circunferencias son CONCÉNTRICAS.");
        } else if (d > sumaRadios) {
            System.out.println("Las circunferencias son EXTERIORES.");
        } else if (d == sumaRadios) {
            System.out.println("Las circunferencias son TANGENTES EXTERIORES.");
        } else if (d < sumaRadios && d > difRadios) {
            System.out.println("Las circunferencias son SECANTES.");
        } else if (d == difRadios) {
            System.out.println("Las circunferencias son TANGENTES INTERIORES.");
        } else if (d < difRadios) {
            System.out.println("Las circunferencias son INTERIORES.");
        }
    }
}