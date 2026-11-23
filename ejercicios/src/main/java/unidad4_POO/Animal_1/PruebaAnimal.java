package unidad4_POO.Animal_1;

import java.time.LocalDate;

public class PruebaAnimal {

	public static void main(String[] args) {
		Animal_1 a1 = new Animal_1("Pepito", LocalDate.of(2021,3, 23));
		Animal_1 a2 = new Animal_1("Joselín");
		System.out.println(a1);
		System.out.println(a2);

	}

}
