package ClasesAbstractas;

public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado1 = new Cuadrado(4,5,-10);
        System.out.println(cuadrado1.aCadea());
        Cilindro cilindro = new Cilindro(4,5,4,5);
        System.out.println(cilindro.aCadea());
        Cubo cubo = new Cubo(5,4,3,10);
        System.out.println(cubo.calcularArea());
    }
}
