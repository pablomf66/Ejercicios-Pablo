package unidad2;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		int n = 5;
		System.out.println(esPar(n));
	}
	static boolean esPar (int n) {
		if (n%2 == 0) 
			return true;
		else
			return false;
	}

}
