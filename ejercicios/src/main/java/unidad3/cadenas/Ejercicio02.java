package unidad3.cadenas;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		String cadena = IO.readln("Introduce una cadena: ");
		
		for (int i = cadena.length()-1; i>=0; i--) {
			System.out.print(cadena.charAt(i));
		}
		
//		String cadena = IO.readln("Introduce una cadena: ");
//		String inverso = "";
//		
//		for (int i = cadena.length()-1; i>=0; i--) {				otra opcion mas larga
//		char caracter = cadena.charAt(i);
//		inverso += caracter;
//		}
//		System.out.println("Cadena invertida: " + inverso);
	}

}
