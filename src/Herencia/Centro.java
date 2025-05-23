package Herencia;

/**
 * Definicion de el centro de una figura en el espacio
 * @author Oscar Rodriguez
 * @version 1.0
 */
public class Centro {
    private double x;
    private double y;

    /**
     * Definicion del punto central de una figura geometrica
     * @param x coordenada X
     * @param y coordenada Y
     */
    public Centro(double x, double y) {
        setX(x);
        setY(y);
    }

    @Override
    public String toString() {
        return x + "," + y;
    }

    public boolean equals(Object o) {
        if (o.getClass()==this.getClass()) {
            Centro o1 = (Centro) o;
            return o1.x == this.x && o1.y == this.y;
        }
        else {
            return false;
        }
    }
    public double getX() {
        return x;
    }
    public void setX(double x) throws PuntoFueraPrimerCuadrante {
        if (x>=0) this.x = x;
        else throw new PuntoFueraPrimerCuadrante();
    }
    public void setX(int x) {
        if (x>=0) this.x = x;
        else throw new PuntoFueraPrimerCuadrante();
    }

    public double getY() {
        return y;
    }

    public void setY(double y) throws PuntoFueraPrimerCuadrante {
        if (y>=0) this.y = y;
	    else throw new PuntoFueraPrimerCuadrante();
    }
    public void setY(int y) {
        if (y>=0) this.y = y;
    }
}
