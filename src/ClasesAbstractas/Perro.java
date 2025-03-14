package ClasesAbstractas;

public class Perro extends Mamiferos implements Comunicacion {
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

    @Override
    public void voz() {
        System.out.println("Guau guau");
    }

    @Override
    public void bostezo() {
        Comunicacion.super.bostezo();
    }

    @Override
    public void hablarConPareja(Mamiferos pareja) {
        System.out.println(getNombre() + " huele a " + pareja.getNombre());
    }
}
