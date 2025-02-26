package ClasesAbstractas;

public class Cilindro extends Solido {
    double radio;
    public Cilindro(double x, double y,double altura, double radio) {
        super(x,y,altura);
        this.radio = radio;
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
