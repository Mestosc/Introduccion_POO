//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import Herencia.Circulo;
import Herencia.Centro;

public class Main {
    public static void main(String[] args) {
        Fecha fecha = new Fecha(30,3,2010);
        //calendario2.incrementarDia();
        fecha.incrementarMes();
        fecha.incrementarAno();
        System.out.println(fecha);
        Centro centro1 = new Centro(23,12);
        Centro centro2 = new Centro(23,10);
        Centro punto3 = new Centro(32,10);
        Circulo circulo2 = new Circulo(21,10,21);
        if (centro1.equals(punto3)) {
            System.out.println("Son iguales");
        }
        System.out.println(centro2);
        Circulo circulo = new Circulo(23,12,34);
        System.out.println(circulo.calcularDiametro());
        System.out.println(circulo);
        Circulo circulo1 = new Circulo(centro1,23.23);
        System.out.println(circulo1);
        if (circulo.equals(circulo1)) {
            System.out.println("Estan en la misma posicion");
        }
    }
}