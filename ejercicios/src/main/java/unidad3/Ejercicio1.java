package unidad3;

public class Ejercicio1 {

	public static void main(String[] args) {
		String s = IO.readln("Introduce una cadena: ").toLowerCase();
		int contadorA = 0;
		int contadorE = 0;
		int contadorI = 0;
		int contadorO = 0;
		int contadorU = 0;
		int consonantes = 0;

		for (int i = 0; i < s.length(); i++) {

			char caracter = s.charAt(i);

			switch (caracter) {
			case 'a':
				contadorA++;
				break;
			case 'e':
				contadorE++;
				break;
			case 'i':
				contadorI++;
				break;
			case 'o':
				contadorO++;
				break;
			case 'u':
				contadorU++;
				break;
			}
		}
		System.out.println("a: " + contadorA);
		System.out.println("e: " + contadorE);
		System.out.println("i: " + contadorI);
		System.out.println("o: " + contadorO);
		System.out.println("u: " + contadorU);
	}

}
