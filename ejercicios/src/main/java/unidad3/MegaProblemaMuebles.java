package unidad3;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MegaProblemaMuebles {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Integer> cantidades = new ArrayList<>();
        double totalPagar = 0;

        Pattern p = Pattern.compile(">>([a-zA-Z]+)<<(\\d+(?:,\\d{1,2})?):(\\d+)");

        String linea = IO.readln().trim();

        while (!linea.equalsIgnoreCase("comprar")) {
            Matcher m = p.matcher(linea);

            if (m.matches()) {
                String nombre = m.group(1);
                double precio = Double.parseDouble(m.group(2).replace(',', '.'));
                int cantidad = Integer.parseInt(m.group(3));

                nombres.add(nombre);
                cantidades.add(cantidad);
                totalPagar += precio * cantidad;
            }

            linea = IO.readln().trim();
        }

        IO.print("Compra: ");
        for (int i = 0; i < nombres.size(); i++) {
            IO.print(nombres.get(i) + " (" + cantidades.get(i) + ") ");
        }
        IO.println(String.format("%nImporte total: %.2f€", totalPagar));
    }
}