//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import Herencia.Circulo;
import Herencia.Punto;

public class Main {
    public static void main(String[] args) {
        Fecha fecha = new Fecha(30,3,2010);
        //calendario2.incrementarDia();
        fecha.incrementarMes();
        fecha.incrementarAno();
        System.out.println(fecha);
        Punto punto1 = new Punto(23,12);
        Punto punto2 = new Punto(23,10);
        Punto punto3 = new Punto(32,10);
        if (punto1.equals(punto3)) {
            System.out.println("Son iguales");
        }
        System.out.println(punto2);
        Circulo circulo = new Circulo(23,12,34);
        System.out.println(circulo.calcularDiametro());
        System.out.println(circulo);
        Circulo circulo1 = new Circulo(punto1,23.23);
        System.out.println(circulo1);
        if (circulo.equals(circulo1)) {
            System.out.println("Estan en la misma posicion");
        }
    }
}