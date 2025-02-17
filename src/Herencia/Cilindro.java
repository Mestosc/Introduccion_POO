package Herencia;

public class Cilindro extends Circulo {
    private double altura;
    public Cilindro(Centro centro, double radio, double altura) {
        super(centro, radio);
        this.altura = altura;
    }

    public Cilindro(double x, double y, double radio) {
        super(x, y, radio);
        this.altura = radio;
    }

    public Cilindro(int x, int y, int radio) {
        super(x, y, radio);
    }
    public double calcularArea() {
        double areaBases = super.calcularArea()*2;
        double areaLateral = 2 * Math.PI * altura;
        return areaBases + areaLateral;
    }
    public double calcularVolumen() {
        return Math.PI * Math.pow(getRadio(),2) * altura;
    }

    @Override
    public String toString() {
        return super.toString() + " Altura: " + altura;
    }
}
