package unidad1;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		/*
		double r =  Double.parseDouble(IO.readln("Red: "));
		double g =  Double.parseDouble(IO.readln("Green: "));
		double b =  Double.parseDouble(IO.readln("Blue: "));
		
		double y = 0.299*r + 0.587*g + 0.114*b;
		double i = 0.596*r - 0.275*g - 0.321*b;
		double q = 0.212*r - 0.528*g + 0.311*b;
		
		System.out.printf("Y: %.3f, I: %.3f, Q: %.3f", y, i, q);
		
		como lo haria yo
		*/
		
		double r, g, b, y, i , q;
		Scanner in = new Scanner(System.in);
		 // in.useDelimiter("[, \\s]"); con esto se indica como quieres separar los elementos del Scanner
		System.out.println("Introduce componentes RGB separadas por espacios: ");
		r = in.nextDouble();
		g = in.nextDouble();
		b = in.nextDouble();
		
		y = 0.299*r + 0.587*g + 0.114*b;
		i = 0.596*r - 0.275*g - 0.321*b;
		q = 0.212*r - 0.528*g + 0.311*b;
		
		System.out.printf("Y: %.3f, I: %.3f, Q: %.3f %n", y, i, q);
		
		char c = "HolaMundo".charAt(0);
		String s = "Adios Mundo🛝";
		s += " cruel";
		IO.print(s);
		
		// aqui se usa el Scanner como otro metodo de lectura de datos
		
		
		
		

	}

}
