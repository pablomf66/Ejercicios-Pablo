package unidad4_POO.RetratoRobot;

public class Main {

	public static void main(String[] args) {
		RetratoRobot r1 = new RetratoRobot();
		IO.println(r1);
		System.out.println();
		RetratoRobot r2 = new RetratoRobot(1, 1, 1, 1, 1);
		IO.println(r2);
	}

}
