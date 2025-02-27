package ClasesAbstractas;

public abstract class Mamiferos extends Animal{
    public Mamiferos(String nombre, int edad) {
        super(nombre, edad);
    }
    public void mamar() {
        System.out.println(getNombre() + " está mamando");
    }
}
