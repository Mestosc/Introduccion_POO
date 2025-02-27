package ClasesAbstractas;

public class Canguro extends Mamiferos {
    public Canguro(String nome,int edad) {
        super(nome,edad);
    }

    @Override
    public void parir() {
        System.out.println("El canguro pare con su saco");
    }

    @Override
    void desprazar() {
        System.out.println("O canguro desprazase saltando");
    }
}
