package Herencia;

public class App {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(2,10,5);
        Cilindro cilindro1 = new Cilindro(12,10,5,10);
        Cilindro cilindro2 = new Cilindro(circulo,10);
        System.out.println(cilindro1.calcularVolumen());
        System.out.println(cilindro1.calcularArea());
        System.out.println(cilindro1.calcularDiametro());
        System.out.println(circulo);
        System.out.println(cilindro2);
    }
}
