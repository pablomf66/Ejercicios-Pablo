package unidad3.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio03_vGemini {

	public static void main(String[] args) {
		Pattern p = Pattern.compile(">>(\\p{L}+)<<(\\d+(?:,\\d{1,2})?):(\\d+)", Pattern.UNICODE_CHARACTER_CLASS);
		String linea = IO.readln("> ");
		double total = 0;
		StringBuilder sb = new StringBuilder("Compra:\n");
		
		while (!linea.equalsIgnoreCase("comprar")) {
			Matcher m = p.matcher(linea);
			if (m.matches()) {
				sb.append(m.group(1));
				sb.append("(");
				sb.append(m.group(3));
				sb.append("), ");
				
				double precio = Double.parseDouble(m.group(2).replace(',', '.'));
				int cantidad = Integer.parseInt(m.group(3));
				total += precio * cantidad;
			} else {
				System.out.println("Formato incorrecto. Ejemplo: >>Manzanas<<2,50:3");
			}
			
			// Se pide la siguiente línea SIEMPRE al final de la iteración
			linea = IO.readln("> ");
		}
		
		// Si se ha añadido algún producto, quitamos la última coma y espacio (", ")
		if (sb.length() > 8) {
			sb.setLength(sb.length() - 2);
		}
		
		sb.append("\nImporte Total:\n");
		sb.append(String.format("%.2f", total));
		
		System.out.println(sb.toString());
	}
	
}