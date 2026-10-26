package unidad3.regex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio08 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader(args[0]));
		String txt = in.readAllAsString();
		Matcher m = Pattern.compile("<uppercase>(.*?)</uppercase>").matcher(txt);
//		StringBuilder sb = new StringBuilder();
		while (m.find())
			System.out.println(m.group(1).toUpperCase());
//		m.appendTail(sb);
//		System.out.println(sb);

	}

}
