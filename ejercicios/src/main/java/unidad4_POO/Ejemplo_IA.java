package unidad4_POO;

public class Ejemplo_IA {

    // 1. ABSTRACCIÓN e INTERFAZ
    interface IVolador {
        void volar();
    }

    // Añadimos "static" para poder usarlas dentro del método main
    static abstract class Animal {
        private String nombre;
        private int edad;

        public Animal(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public int getEdad() {
            return edad;
        }

        public abstract void hacerSonido();
    }

    static class Perro extends Animal {
        public Perro(String nombre, int edad) {
            super(nombre, edad);
        }

        @Override
        public void hacerSonido() {
            System.out.println(getNombre() + " dice: ¡Guau guau!");
        }
    }

    static class Pajaro extends Animal implements IVolador {
        public Pajaro(String nombre, int edad) {
            super(nombre, edad);
        }

        @Override
        public void hacerSonido() {
            System.out.println(getNombre() + " dice: ¡Pío pío!");
        }

        @Override
        public void volar() {
            System.out.println(getNombre() + " está volando por el cielo.");
        }
    }

    // Método principal directamente en la clase pública Ejemplo_IA
    public static void main(String[] args) {
        Animal miPerro = new Perro("Firulais", 3);
        Animal miPajaro = new Pajaro("Piolín", 1);

        System.out.println("--- Perro ---");
        System.out.println("Nombre: " + miPerro.getNombre() + ", Edad: " + miPerro.getEdad());
        miPerro.hacerSonido();

        System.out.println("\n--- Pájaro ---");
        System.out.println("Nombre: " + miPajaro.getNombre() + ", Edad: " + miPajaro.getEdad());
        miPajaro.hacerSonido();

        if (miPajaro instanceof IVolador) {
            ((IVolador) miPajaro).volar();
        }
    }
}
