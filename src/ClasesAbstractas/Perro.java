package ClasesAbstractas;

public class Perro extends Mamiferos {
    public Perro(String nombre, int edad) {
        super(nombre,edad);
    }

    @Override
    public void parir() {
        System.out.println("El perro pare");
    }

    @Override
    void desprazar() {
        System.out.println("Se desplaza a cuatro patas");
    }

}
