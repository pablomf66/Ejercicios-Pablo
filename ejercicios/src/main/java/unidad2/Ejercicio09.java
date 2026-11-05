package unidad2;

public class Ejercicio09 {

	public static void main(String[] args) {
		int dia = Integer.parseInt(IO.readln("numero: "));
		String d = semana(dia);
		System.out.println(d);

	}
	
	static String semana (int dia) {
		String cadena;
		switch(dia) {
		case 1:
			cadena = "lunes";
			break;
		case 2:
			cadena =  "martes";
			break;
		case 3:
			cadena =  "miercoles";
			break;
		case 4:
			cadena =  "jueves";
			break;
		case 5:
			cadena =  "viernes";
			break;
		case 6:
			cadena =  "sabado";
			break;
		case 7:
			cadena =  "domingo";
			break;
		default:
			cadena = "error";
		}
		return cadena;
	}

}
