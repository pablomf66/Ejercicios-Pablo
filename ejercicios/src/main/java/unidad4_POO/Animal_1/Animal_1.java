package unidad4_POO.Animal_1;

import java.time.LocalDate;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class Animal_1 {
	
	private String nombre;
	private LocalDate fecha;
	
	public Animal_1(String nombre, LocalDate fecha) {
		this.nombre = nombre;
		this.fecha = fecha;
	}
	
	public Animal_1(String nombre) {
		this(nombre, LocalDate.now());
		
//		  ----o tambien----
//		this.nombre = nombre;
//		fecha = LocalDate.now();
	}

	@Override
	public int hashCode() {
		return Objects.hash(fecha, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal_1 other = (Animal_1) obj;
		return Objects.equals(fecha, other.fecha) && Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + " - Edad: " + (LocalDate.now().getYear() - fecha.getYear());  // ver github para hacerlo con ChronoUnit q este metodo puede dar errores
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFecha() {
		return fecha;
	}
	
	
}
