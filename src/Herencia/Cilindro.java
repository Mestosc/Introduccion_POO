package Herencia;

import java.util.Objects;

public class Cilindro extends Circulo {
    private double altura;
    public Cilindro(Centro centro, double radio, double altura) {
        super(centro, radio);
        this.altura = altura;
    }

    public Cilindro(double x, double y, double radio, double altura) {
        super(x, y, radio);
        this.altura = altura;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cilindro cilindro = (Cilindro) o;
        return Double.compare(altura, cilindro.altura) == 0 && Double.compare(getRadio(), cilindro.getRadio()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(altura);
    }

    public Cilindro(int x, int y, int radio) {
        super(x, y, radio);
    }
    public double calcularArea() {
        return super.calcularArea()*2 + 2 * Math.PI * altura;
    }
    public double calcularVolumen() {
        return Math.PI * Math.pow(getRadio(),2) * altura;
    }

    @Override
    public String toString() {
        return super.toString() + " Altura: " + altura;
    }
}
