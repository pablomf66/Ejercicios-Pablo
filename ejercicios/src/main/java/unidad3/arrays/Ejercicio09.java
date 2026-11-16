package unidad3.arrays;

public class Ejercicio09 {

	public static void main(String[] args) {
		int v[] = {6,2,3,0,1};
		Integer centro = centro(v);
		IO.println(centro != null ? "Centro = " + centro : "El vector no tiene centro");
	}

	static Integer centro(int v[]) {
		
		for (int c = 0; c < v.length; c++) {
			int aux1 = 0;
			for (int i = 0; i<c; i++) {
				aux1 += (c - i) * v[i];
			}
			int aux2 = 0;
			for (int j=c+1; j<v.length;j++) {
				aux2 += (j-c) * v[j];
			}
			if (aux1 == aux2)
				return c;
		}
		return null;
	}
}
