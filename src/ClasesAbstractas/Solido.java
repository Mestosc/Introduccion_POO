package ClasesAbstractas;

abstract public class Solido extends FiguraXeometrica {
    double altura;
    public Solido() {}
    public Solido(double x, double y, double altura) {
        super(x,y);
        setAltura(altura);
    }
    public void setAltura(double altura) {
        this.altura = Math.abs(altura);
    }
    abstract public double calcularVolume();
}
