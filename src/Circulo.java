public class Circulo extends Punto {
    private double radio;
    private final double PI = 3.14;
    public Circulo(double x, double y, double radio) {
        super(x,y);
        this.radio = radio;
    }
    public double calcularDiametro() {
        return radio*PI;
    }
    public double calcularArea() {
        return (radio*radio)*PI;
    }
}
