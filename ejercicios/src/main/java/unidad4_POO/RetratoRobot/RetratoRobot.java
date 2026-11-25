package unidad4_POO.RetratoRobot;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RetratoRobot {
	
	private static Random r = new Random();
	private static ArrayList<ArrayList<String>> opciones = new ArrayList<>();
	static {
		opciones.add(new ArrayList<>(List.of ("el pelo", "WWWWWWWWW", "\\\\\\//////", "\"|||||||\"", "|||||||||")));
		opciones.add(new ArrayList<>(List.of("los ojos", "|  o o  |", "|-(· ·)-|", "|-(o o)-|", "| \\   / |")));
		opciones.add(new ArrayList<>(List.of("las orejas y la nariz", "@   J   @", "{   \"   }", "[   j   ]", "<   -   >")));
		opciones.add(new ArrayList<>(List.of("la boca", "|  ===  |", "|   -   |", "|  ___  |", "|  ---  |")));
		opciones.add(new ArrayList<>(List.of("la barbilla", "\\_______/", "\\,,,,,,,/", "\\......./")));
	}
	
	public static int getMaxPelo() {
		return opciones.get(0).size();
	}
	
	public static String getOpcionesPelo() {
		String o = "1 - " + opciones.get(0).get(1) + "\n";
		for (int i = 2; i<opciones.get(0).size(); i++) {
			o += i + " - " + opciones.get(0).get(i);
		}
		return "h";
	}
	
	private int [] rasgos = new int[5];

	public RetratoRobot() {
		for (int i=0; i<rasgos.length; i++)
			rasgos[i] = r.nextInt(opciones.get(i).size() - 1) + 1;
	}
		
	public RetratoRobot(int pelo, int ojos, int nariz, int boca, int barbilla) {
		
		rasgos[0] = pelo;
		rasgos[1] = ojos;
		rasgos[2] = nariz;
		rasgos[3] = boca;
		rasgos[4] = barbilla;
	}
	
	@Override
	public String toString() {
		String retrato = opciones.get(0).get(rasgos[0]);
		for (int i=1; i<rasgos.length; i++)
			retrato += "\n" + opciones.get(i).get(rasgos[i]);
		return retrato;
	}
}
