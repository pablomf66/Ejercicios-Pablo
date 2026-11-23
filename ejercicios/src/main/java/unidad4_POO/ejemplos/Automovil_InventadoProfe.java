package unidad4_POO.ejemplos;

import java.awt.Color;

public class Automovil_InventadoProfe {

	private Color color;
	private int puertas;
	private String combustible;
	private int potencia;

	public Automovil_InventadoProfe(Color color, int puertas, String combustible, int potencia) {
		this.color = color;
		this.puertas = puertas;
		this.combustible = combustible;
		this.potencia = potencia;
	}

	public Automovil_InventadoProfe(int puertas, String combustible, int potencia) {
		this(Color.WHITE, puertas, combustible, potencia);
	}

	public Automovil_InventadoProfe() {
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public static void main(String[] args) {
		Automovil_InventadoProfe a = new Automovil_InventadoProfe();
		a.color = Color.RED;
	}

}

class Prueba {
	public static void main(String[] args) {
		Automovil_InventadoProfe a = new Automovil_InventadoProfe();
		System.out.println(a.getColor());
		a.setColor(Color.GREEN);
		a.setPotencia(500);
//		Automovil.setPotencia(a,500);
	}
}
