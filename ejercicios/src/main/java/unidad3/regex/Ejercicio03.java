package unidad3.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio03 {

	public static void main(String[] args) {
		Pattern p = Pattern.compile(">>([\\p{L}\\d_]+)<<(\\d(?:,\\d{1,2})?):(\\d+)");
		float total = 0;
		String linea = IO.readln("> ");
		while (!linea.equalsIgnoreCase("comprar")) {
			Matcher m = p.matcher(linea);
			if (m.matches()) {
				String nombre = m.group(1);
				float precio = Float.parseFloat(m.group(2));
				String cantidad = m.group(3);
				System.out.println(nombre + " - " + precio + " - " + cantidad);
			}
			linea = IO.readln("> ");
		}

	}

}
