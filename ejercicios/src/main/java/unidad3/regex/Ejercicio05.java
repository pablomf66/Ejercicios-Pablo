package unidad3.regex;

public class Ejercicio05 {

	public static void main(String[] args) {
		String texto = "Tarjeta 1234-5678-9876-5432 aprobada";
		// Buscamos: 4 dígitos - 4 dígitos - 4 dígitos - (4 dígitos guardados en grupo 1)
		String oculta = texto.replaceAll("\\d{4}-\\d{4}-\\d{4}-(\\d{4})", "XXXX-XXXX-XXXX-$1");
		// Resultado: "Tarjeta XXXX-XXXX-XXXX-5432 aprobada"
		System.out.println(oculta);

	}

}
