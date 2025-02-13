public class Circulo extends Punto {
    private double radio;
    public Circulo(double x, double y, double radio) {
        super(x,y);
        this.radio = radio;
    }
    public double calcularArea() {
        final double PI = 3.14;
        return (radio*radio)*PI;
    }
}
