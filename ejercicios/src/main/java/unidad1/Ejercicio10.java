package unidad1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio10 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Dime tu nombre: ");
		double t0 = System.currentTimeMillis(); // currentTimeMillis cuenta el tiempo transcurrido en mili segs desde     
		String nombre = in.readLine();		  // el 1 de enero de 1970 a las 00:00:00 UTC hasta ahora
		long t1 = System.currentTimeMillis();
		double t = (t1 - t0) / 1000d;
		
		System.out.printf("Hola %s, has tardado %.2f segundos en introducir tu nombre\n", nombre, t);
		
	}

}
