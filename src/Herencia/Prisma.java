package Herencia;

public class Prisma extends Cuadrado {
    private double altura;

    public Prisma(double lado, double altura) {
        super(lado);
        this.altura = altura;
    }

    public double calcularArea() {
        double areaBase = 2*Math.pow(lado,2);
        double areaLateral = 4 * lado * altura;
        return areaBase + areaLateral;
    }
    public double calcularVolumen() {
        return Math.pow(lado,2) * altura;
    }
}
