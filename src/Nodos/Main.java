package Nodos;

import ClasesAbstractas.Perro;

public class Main {
    public static void main(String[] args) {
        ListaNodos<Integer> nodo = new ListaNodos<>(1,2,4,10,20,200);
        nodo.append(300);
        System.out.println(nodo.get(nodo.getTamano()-1));
        System.out.println(nodo);
        ListaNodos<String> cadenas = new ListaNodos<>("Hola","individuo","eres","tu","quien","crees");
        ListaNodos<String> nueva = new ListaNodos<>();
        System.out.println(nueva);
        for (String cadena : cadenas) {
            if (cadena.length()>4) {
                nueva.append(cadena);
            }
        }
        System.out.println(nueva);
    }
}

