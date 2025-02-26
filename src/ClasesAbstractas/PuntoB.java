package ClasesAbstractas;

abstract public class PuntoB {
    private double x;
    private double y;
    public PuntoB() {}
    public PuntoB(double x, double y) {
        this.x= x;
        this.y = y;
    }
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    abstract String aCadea();
}
