package ClasesAbstractas;

public class Cuadrado extends FiguraXeometrica {
    int lado;
    public Cuadrado(double x, double y, int lado) {
        super(x,y);
        this.lado = lado;
    }
    public Cuadrado(int lado) {
        this(0,0,lado);
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
