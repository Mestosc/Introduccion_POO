package Herencia;
/**
* Define un cuadrado 
* @author: Oscar
* @version: 1.0
**/
public class Cuadrado {
    double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return lado*lado;
    }
}
