package ClasesAbstractas;

public class Cubo extends Solido{
    int lado;
    public Cubo(int lado,double x, double y, double altura) {
        super(x,y,altura);
        this.lado = lado;
    }

    @Override
    public double calcularVolume() {
        return 0;
    }

    @Override
    public double calcularArea() {
        return 0;
    }

    @Override
    String aCadea() {
        return "";
    }
}
