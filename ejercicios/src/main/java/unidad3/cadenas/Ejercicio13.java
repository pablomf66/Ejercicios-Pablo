package unidad3.cadenas;

public class Ejercicio13 {
	
	public static String intercambiarPares(String s) {
	    StringBuilder sb = new StringBuilder();
	    
	    for (int i = 0; i < s.length(); i += 2) {
	        if (i + 1 < s.length()) {
	            // Hay pareja: metemos el segundo y luego el primero
	            sb.append(s.charAt(i + 1));
	            sb.append(s.charAt(i));
	        } else {
	            // Longitud impar: el último se queda igual
	            sb.append(s.charAt(i));
	        }
	    }
	    return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(intercambiarPares("Hola Mundo!"));

	}

}
