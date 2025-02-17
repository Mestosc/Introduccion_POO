package Herencia;


public class Cilindro extends Circulo {
    private double altura;
    public Cilindro(Centro centro, double radio, double altura) {
        super(centro, radio);
        setAltura(altura);
    }
    public Cilindro(Circulo circulo, double altura) {
        super(circulo.getX(),circulo.getY(),circulo.getRadio());
        setAltura(altura);
    }
    public Cilindro(Circulo circulo) {
        super(circulo.getX(),circulo.getY(),circulo.getRadio());
        setAltura(0);
    }
    public Cilindro(double x, double y, double radio, double altura) {
        super(x, y, radio);
        setAltura(altura);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura>0) {
            this.altura = altura;
        }
        else {
            this.altura = 1;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o.getClass() == getClass()) {
            Cilindro cilindro = (Cilindro) o;
            return getRadio() == cilindro.getRadio() && altura == cilindro.altura;
        }
        else {
            return false;
        }
    }

    public Cilindro(int x, int y, int radio) {
        super(x, y, radio);
        setAltura(0);
    }

    @Override
    public double calcularArea() {
        return super.calcularArea()*2 + 2 * Math.PI * altura;
    }

    public double calcularVolumen() {
        return Math.PI * Math.pow(getRadio(),2) * altura;
    }

    @Override
    public String toString() {
        return super.toString() + " Altura: " + altura;
    }
}
