package ClasesAbstractas;

public class Perro extends Animal {
    public Perro(String nombre, int edad) {
        super(nombre,edad);
    }
    @Override
    void desprazar() {
        System.out.println("Se desplaza a cuatro patas");
    }
}
