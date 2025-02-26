package ClasesAbstractas;

abstract public class FiguraXeometrica extends PuntoB {
    abstract public double calcularArea();
    public FiguraXeometrica() {}
    public FiguraXeometrica(double x, double y) {
        super(x,y);
    }

}
