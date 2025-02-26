package ClasesAbstractas;

public class Cubo extends Solido{
    int lado;
    public Cubo(int lado,double x, double y, double altura) {
        super(x,y,altura);
        this.lado = lado;
    }

    @Override
    public double calcularVolume() {
        return Math.pow(lado,3);
    }

    @Override
    public double calcularArea() {
        return lado*lado*6;
    }

    @Override
    String aCadea() {
        return "El lado es" + lado + " su area es "+ calcularArea() + " esta ubicado en " + getX() + " " + getY();
    }
}
