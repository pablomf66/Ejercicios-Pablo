package unidad2;

public class Ejercicio16 {

	public static void main(String[] args) {
		int n = Integer.parseInt(IO.readln("Introduce un número (nº menor que 0 para finalizar): "));
		while (n > 0) {
			System.out.println(serie(n));
			n = Integer.parseInt(IO.readln("Introduce un número (nº menor que 0 para finalizar): "));
			}
		}

	static float serie(int n) {
		float suma = 0;
		for (int i=1; i<=n; i++)
			suma += 1f / i;
		return suma;
	}
	
}
