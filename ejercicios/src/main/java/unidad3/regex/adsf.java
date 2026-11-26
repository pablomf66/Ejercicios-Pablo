package unidad3.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class adsf {
public static void main(String[] args) {
	String html = "Visita https://www.uniovi.es y también http://campusvirtual.uniovi.es hoy.";

	Pattern p = Pattern.compile("https?://[^\\s\"]+");
	Matcher m = p.matcher(html);

	while (m.find()) {
	    System.out.println("URL encontrada: " + m.group()); // m.group() devuelve la URL entera pescada
	}
}
}
