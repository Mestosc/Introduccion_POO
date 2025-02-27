package ClasesAbstractas;

public class Canguro extends Mamiferos {
    public Canguro(String nome,int edad) {
        super(nome,edad);
    }

    @Override
    void desprazar() {
        System.out.println("O canguro desprazase saltando");
    }
}
