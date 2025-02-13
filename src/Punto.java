public class Punto {
    private double x;
    private double y;

    public Punto(double x, double y) {
        setX(x);
        setY(y);
    }

    @Override
    public String toString() {
        return "X:" + x + " " + "Y:" + y;
    }

    public boolean equals(Object o) {
        if (o.getClass().equals(this.getClass())) {
            Punto o1 = (Punto) o;
            return o1.x == this.x && o1.y == this.y;
        }
        else {
            return false;
        }
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        if (x>=0) this.x = x;
    }
    public void setX(int x) {
        if (x>=0) this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        if (y>=0) this.y = y;
    }
    public void setY(int y) {
        if (y>=0) this.y = y;
    }
}
