package ClasesAbstractas;

public class Serpiente extends Animal {
    public Serpiente(String nombre, int edad) {
        super(nombre,edad);
    }
    @Override
    void desprazar() {
        System.out.println("Reptando...");
    }
}
