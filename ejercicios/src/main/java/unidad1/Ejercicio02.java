package unidad1;

public class Ejercicio02 {
	
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		
		boolean r1 = a < b || c != d; // se puede usar una / para usar el operador "o" en vez de 2, 
		// aunque no hace al 100% lo mismo, mejor usar dos
		boolean r2 = a >= b && c == d; // con leyes de morgan, r2 = r1,  ¿¿¿ revisar en casa ??? 
	}

}
