package unidad1;

public class Ejercicio03 {

	public static void main(String[] args) {
		double año = Double.parseDouble(IO.readln("Introduce un año: "));
		
		boolean bisiesto = (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0); 
		
		System.out.print(bisiesto);

	}

}
