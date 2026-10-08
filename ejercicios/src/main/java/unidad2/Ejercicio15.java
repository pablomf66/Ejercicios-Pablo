package unidad2;

public class Ejercicio15 {

	public static void main(String[] args) {
		double producto = 1;
		int n = 3;
		int cont = 1;

		while (cont < 200_000) {
			if (!esPar(n)) {
				producto *= n;
				cont++;
			}
			n++;
		}
		System.out.println("Resultado del producto de los primeros 200k numeros impares: " + producto);
		System.out.println(cont);
		System.out.println(n);

	}

	static boolean esPar(int n) {
		return (n % 2 == 0);
	}

}
