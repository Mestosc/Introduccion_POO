public class Circulo extends Punto {
    private double radio;
    public Circulo(Punto punto, double radio) {
        super(punto.getX(),punto.getY());
        this.radio = radio;
    }
    public Circulo(double x, double y, double radio) {
        super(x,y);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public String toString() {
        return "Centro: " + getX() + "," + getY() + "\nEl radio es: " + radio;
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
