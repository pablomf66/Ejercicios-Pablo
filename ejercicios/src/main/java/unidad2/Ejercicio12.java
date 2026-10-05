package unidad2;

import java.util.Random;

public class Ejercicio12 {

	public static void main(String[] args) {

		Random r = new Random();

		int suma = 0;
		int contador = 0;
		int s = Integer.parseInt(IO.readln("Introduce un valor a superar mayor que 0: "));

		
		while (s <= 0) {  // con esto hacemos que el usuario no pueda meter el 0
			System.out.println("No has introducido un número mayor que 0");
			s = Integer.parseInt(IO.readln("Introducelo de nuevo:  "));
		}
			
		if (s > 0) {
			do {
				int n = r.nextInt(100, 1000);
				suma += n;
				contador++;
			} while (suma < s);
			System.out.println("Valor de la suma: " + suma);
			System.out.println("Numero de valores acumulados: " + contador);
		} else {
			System.out.println("Has introducido un numero menor o igual a 0");
		}
	}
}
