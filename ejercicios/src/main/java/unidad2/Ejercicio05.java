package unidad2;

public class Ejercicio05 {
	
	public static void main(String[] args) {
		String mes = IO.readln("Introduce el nombre del mes: ").toLowerCase();  // toLowerCase convierte el string introducido por teclado a todo minusculas
		
		switch (mes) { 
		case "enero","marzo","mayo","julio","agosto","octubre","diciembre":
			System.out.println("El mes de " + mes + " tiene 31 días");
			break;
			
		case "febrero":
			System.out.println("El mes de febrero tiene 28 días");
			break;
			
		case "abril","junio","septiembre","noviembre":
			System.out.println("El mes de " + mes + " tiene 30 días");
			break;

		default:
			System.out.println("No existe ese mes");
		}

	}

}
