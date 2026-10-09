package unidad2;

import java.util.Random;

public class Ejercicio17 {

	public static void main(String[] args) {
	

		Random r = new Random();

		int otra = 1;

		while (otra == 1) {
		    int n = r.nextInt(1000, 100001);
		    int n0 = r.nextInt(n) + 1;
		    int i = 0;

		    System.out.println("He pensado un nº entre 1 y " + n + ", adivina cual es.");

		    int a = Integer.parseInt(IO.readln("¿Que numero es?: "));
		    i++;

		    while (a != n0) {
		        if (a > n0) {
		            System.out.println("El numero es menor que " + a);
		        } else {
		            System.out.println("El numero es mayor que " + a);
		        }

		        a = Integer.parseInt(IO.readln("Vuelve a intentarlo: "));
		        i++;
		    }

		    System.out.println("Acertaste en " + i + " intentos");

		    otra = Integer.parseInt(IO.readln("¿Quieres volver a jugar? (1 si, 0 no): "));
		}

		System.out.println("Gracias por jugar");
			
			
		}
}


