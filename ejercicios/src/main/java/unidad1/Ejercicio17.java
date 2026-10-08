package unidad1;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		double examen_mate, examen_fisica, examen_quimica;
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce la nota del examen de mate, fisica, y quimica, en este orden separadas por espacios: ");
		examen_mate = in.nextDouble();
		examen_fisica = in.nextDouble();
		examen_quimica = in.nextDouble();
		
		System.out.println("Introduce las 3 notas de las tareas de matematicas separadas por espacios: ");
		double tarea_mate1 = in.nextDouble();
		double tarea_mate2 = in.nextDouble();
		double tarea_mate3 = in.nextDouble();
		
		System.out.println("Introduce las 2 notas de las tareas de fisica separadas por espacios: ");
		double tarea_fisica1 = in.nextDouble();
		double tarea_fisica2 = in.nextDouble();

		System.out.println("Introduce las 3 notas de las tareas de quimica separadas por espacios: ");
		double tarea_quimica1 = in.nextDouble();
		double tarea_quimica2 = in.nextDouble();
		double tarea_quimica3 = in.nextDouble();
		
		double media_mate = (examen_mate*0.9) + (((tarea_mate1 + tarea_mate2 + tarea_mate3) / 3) * 0.1);
		double media_fisica = (examen_fisica*0.8) + (((tarea_fisica1 + tarea_fisica2)/2)* 0.2);
		double media_quimica = (examen_quimica*0.85) + (((tarea_quimica1 + tarea_quimica2 + tarea_quimica3)/3)*0.15);
		
		double global = (media_mate + media_fisica + media_quimica) / 3;
		
		System.out.printf("Media en matematicas: %.2f %n", media_mate);
		System.out.printf("Media en fisica: %.2f %n", media_fisica);
		System.out.printf("Media en quimica: %.2f %n", media_quimica);
		System.out.printf("Media Global: %.2f %n", global);
	}

}
