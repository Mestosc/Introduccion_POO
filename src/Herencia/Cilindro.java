package Herencia;

public class Cilindro extends Circulo {
    private double profundidad;
    public Cilindro(Centro centro, double radio, double profundidad) {
        super(centro, radio);
        this.profundidad = profundidad;
    }

    public Cilindro(double x, double y, double radio, double profundidad) {
        super(x, y, radio);
        this.profundidad = profundidad;
    }

    public Cilindro(int x, int y, int radio) {
        super(x, y, radio);
    }
    public double calcularArea() {
        double areaBases = super.calcularArea()*2;
        double areaLateral = 2 * Math.PI * profundidad;
        return areaBases + areaLateral;
    }
    public double calcularVolumen() {
        return Math.PI * Math.pow(getRadio(),2) * profundidad;
    }

    @Override
    public String toString() {
        return super.toString() + " Altura: " + profundidad;
    }
}
