package unidad1;

public class Ejercicio07 {

	public static void main(String[] args) {
		//double vi = 5d;   sufijo "d" para indicar que el compilador lo detecte como double, tb vale poner 5.0
		// double a = 2d;  variables no necesarias porque se pueden poner los valores directamente en la expresion "d"
		
		double t = Double.parseDouble(IO.readln("Tiempo: ")); // inicio variables "t" y "d" y añado la expresion 
		double d = (5d * t) +((Math.pow(t, 2)) / 2d);
		// String linea;
		// linea = IO.readln("Tiempo: ");    otra forma
		// t = Double.parseDouble(linea);
		
		// t = Double.parseDouble(IO.readln("Tiempo: "));  esto se podir usar si declaro la variables arriba y luego pongo la expresion aqui
		// d = (5d * t) +((Math.pow(t, 2)) / 2d);
		
		System.out.println("Distancia: " + /*String.valueOf(d)*/ d  + " metros");  // String.valueOf(d) convierte d a tipo string para poder concatenar 3 strings (no es obligatorio ya que java lo hace solo)

	}

}
