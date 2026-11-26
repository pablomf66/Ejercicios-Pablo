package unidad3.cadenas;

public class Ejercicio08 {

	public static String insertar(String s1, String s2, int pos)  {
		return s1.substring(0, pos) + s2 + s1.substring(pos);
	}
	
	public static void main(String[] args) {
		System.out.println(insertar("Hola Mundo", "bonito ", 5));
	}
}
