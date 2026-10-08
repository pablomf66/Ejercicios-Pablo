package unidad2;

import java.util.Random;

public class Ejercicio17 {

	public static void main(String[] args) {
	}
	
	static String juego(String repe) {
		
	}
			Random r = new Random();
			
			int n = r.nextInt(1000, 100001);
			int n0 = r.nextInt(n)+1;
			int i = 0;
			
			System.out.println("He pensado un nº entre 1 y " + n + ", adivina cual es.");
			i++;
			int a = Integer.parseInt(IO.readln("¿Que numero es?: "));
			while (a != n0) {
				if ( a > n0) {
					System.out.println("El numero es menor que " + a);
					a = Integer.parseInt(IO.readln("Vuelve a intentarlo: "));
					i++;
				}
				else {
					System.out.println("El numero es mayor que " + a);
					a = Integer.parseInt(IO.readln("Vuelve a intentarlo: "));
					i++;
				}
			
			}
			System.out.println("Acertaste en " + i + " intentos");
			System.out.println("¿Quieres volver a jugar? (Si o No");
			
		}


