package Herencia;

public class Circulo extends Centro {
    private double radio;
    public Circulo(Centro centro, double radio) {
        super(centro.getX(), centro.getY());
        this.radio = radio;
    }
    public Circulo(double x, double y, double radio) {
        super(x,y);
        this.radio = radio;
    }
    public Circulo(int x, int y, int radio) {
        super(x,y);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public String toString() {
        return "Centro: " + this.getX() + "," + getY() + " Radio:" + radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularDiametro() {
        return radio*2;
    }
    public double calcularArea() {
        return Math.pow(radio,2)*Math.PI;
    }
    public double calcularPerimetro() {
        return Math.PI*calcularDiametro();
    }
}
