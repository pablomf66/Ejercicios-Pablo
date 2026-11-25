package unidad3.cadenas;

public class Ejercicio07 {

	static void asteriscosNombre(String nombre) {
		if (nombre.length() > 2) {
		nombre = nombre.trim();
		char primeraLetra = nombre.charAt(0);
		String asteriscos = "*".repeat(nombre.length() -2);
		char ultimaletra = nombre.charAt(nombre.length() - 1);
		
		System.out.println(primeraLetra + asteriscos + ultimaletra); }
		else 
			System.out.println(nombre);
	}
	
	public static void main(String[] args) {
		asteriscosNombre("asa");
	}

}
