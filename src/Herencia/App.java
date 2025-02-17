package Herencia;

public class App {
    public static void main(String[] args) {
        Cilindro cilindro1 = new Cilindro(12,10,5,10);
        System.out.println(cilindro1.calcularVolumen());
        System.out.println(cilindro1.calcularArea());
        System.out.println(cilindro1.calcularDiametro());
    }
}
