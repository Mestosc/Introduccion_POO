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
}}