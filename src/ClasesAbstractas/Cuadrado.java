package ClasesAbstractas;

public class Cuadrado extends FiguraXeometrica {
    int lado;
    public Cuadrado(double x, double y, int lado) {
        this(lado);
        setX(x);
        setY(y);
    }
    public Cuadrado(int lado) {
        this.lado = lado;
    }
    @Override
    public double calcularArea() {
        return lado*lado;
    }

    @Override
    String aCadea() {
        return "X:" + getX() + " Y:" + getY() + " Area:" + calcularArea();
    }
}
