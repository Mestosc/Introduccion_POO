package ClasesAbstractas;

public class Cilindro extends Solido {
    double altura;
    double radio;
    public Cilindro(double x, double y,double altura, double radio) {
        setX(x);
        setY(y);
        this.radio = radio;
        this.altura = altura;
    }
    @Override
    public double calcularVolume() {
        return Math.PI*Math.pow(radio,2)*altura;
    }

    @Override
    public double calcularArea() {
        return 2*(Math.PI*Math.pow(radio,2)) + 2*(Math.PI*radio*altura);
    }

    @Override
    String aCadea() {
        return "";
    }
}
