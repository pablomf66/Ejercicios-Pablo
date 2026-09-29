package unidad1;

public class Ejercicio08 {

	public static void main(String[] args) {
		double r =  Double.parseDouble(IO.readln("Radio: "));
		double perimetro = 2 * Math.PI * r;
		double area = Math.PI * Math.pow(r, 2);
		
		System.out.println("Perimetro: " + perimetro);
		System.out.println("Area: " + area);

	}

}
