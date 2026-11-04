package unidad1;

public class Ejercicio09 {

	public static void main(String[] args) {
		double euro = Double.parseDouble(IO.readln("Euros: "));
		double dolar = euro * 1.12;
		System.out.printf("Dolares: %.2f",dolar );
	}

}
