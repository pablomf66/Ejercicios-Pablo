package unidad3.arrays;

import java.util.Random;

public class Ejercicio03 {

	static Random r = new Random();
	
	public static void main(String[] args) {
		double t =  System.currentTimeMillis();
		int tamaño = Integer.parseInt(IO.readln("Introduce un numero entre 10 y 1_000_000: "));
		int v[] = new int[tamaño];
		for (int i = 0; i < v.length; i++) {
			v[i] = obtenerValorSinRepetir(v, i, tamaño);
		}
		
		System.out.println("Tamaño del vector: " + tamaño);
		System.out.println("Tiempo empleado: ");
		System.out.println("Diferencia entre el menor y el mayor: ");
		System.out.println("Tiempo empleado: ");

	}
	static int obtenerValorSinRepetir(int[] v, int i, int tamaño) {
		Integer valor = null;
		while (valor == null) {
			valor = r.nextInt((tamaño*2000) + (-tamaño*2000) + 1) -(tamaño*2000);
			for (int j=0; j<i; j++)
				if (v[j] == valor) {
					valor = null;
					break;
				}
		}
		return valor;
	}
}
