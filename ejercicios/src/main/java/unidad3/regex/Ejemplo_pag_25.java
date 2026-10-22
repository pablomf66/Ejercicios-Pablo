package unidad3.regex;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Ejemplo_pag_25 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Texto: ");
		String linea = in.readLine();
		System.out.print("Letra: ");
		String regex = String.format("%s\\w*", in.readLine());
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(linea);
		while (matcher.find())
			System.out.println(matcher.group());
	}
}
