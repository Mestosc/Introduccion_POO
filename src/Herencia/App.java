package Herencia;

public class App {
    public static void main(String[] args) {
        Cilindro cilindro1=null;
        try {
            cilindro1 = new Cilindro(-12, 10, 10, 10);
        } catch (PuntoFueraPrimerCuadrante e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println(cilindro1);
        }
    }
}
