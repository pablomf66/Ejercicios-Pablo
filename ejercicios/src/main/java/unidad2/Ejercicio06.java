package unidad2;

public class Ejercicio06 {

	public static void main(String[] args) {
		int n = Integer.parseInt(IO.readln("numero: "));
		while (n != 0) {
	        romano(n);
	        n = Integer.parseInt(IO.readln("numero: "));
	    }
	}

	static void romano(int n) {
		switch (n) {
		case 1:
			System.out.println("I");
			break;
		case 2:
			System.out.println("II");
			break;
		case 3:
			System.out.println("III");
			break;
		case 4:
			System.out.println("IV");
			break;
		case 5:
			System.out.println("V");
			break;
		case 6:
			System.out.println("VI");
			break;
		case 7:
			System.out.println("VII");
			break;
		case 8:
			System.out.println("VIII");
			break;
		case 9:
			System.out.println("IX");
			break;
		case 10:
			System.out.println("X");
			break;
		default:
			System.out.println("error");
		}
	}

}
