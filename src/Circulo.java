public class Circulo extends Punto {
    private double radio;
    public Circulo(double x, double y, double radio) {
        super(x,y);
        this.radio = radio;
    }
    public double calcularDiametro() {
        return radio*2;
    }
    public double calcularArea() {
        return Math.pow(radio,2)*Math.PI;
    }
    public double calcularPerimetro() {
        return radio*calcularDiametro();
    }
}
