package unidad1;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		boolean t = true;
		boolean f = false;
		
		boolean andTT = t && t;
		boolean andTF = t && f;
		boolean andFT = f && t;
		boolean andFF = f && f;
		
		boolean orTT = t || t;
		boolean orTF = t || f;
		boolean orFT = f || t;
		boolean orFF = f || f;
		
		boolean xorTT = t ^ t;
		boolean xorTF = t ^ f;
		boolean xorFT = f ^ t;
		boolean xorFF = f ^ f;
		
		System.out.printf("  A    B  |  %-6s|  %-6s|  %-6s|%n", "or", "and", "xor");
		System.out.println("-----------------------------------------");
		System.out.printf("True  True  |  %-6s|  %-6s|  %-6s|%n",orTT, andTT, xorTT);
		System.out.printf("True  False |  %-6s|  %-6s|  %-6s|%n",orTF, andTF, xorTF);
		System.out.printf("False True  |  %-6s|  %-6s|  %-6s|%n",orFT, andFT, xorFT);
		System.out.printf("False False |  %-6s|  %-6s|  %-6s|%n",orFF, andFF, xorFF);
		
		
		


	}

}
