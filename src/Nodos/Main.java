package Nodos;

public class Main {
    public static void main(String[] args) {
        ListaNodos<Integer> nodo = new ListaNodos<>(1,2,4,10,20,200);
        nodo.append(300);
        System.out.println(nodo.get(nodo.getTamano()-1));
        ListaNodos<String> cadenas = new ListaNodos<>("Hola","individuo","eres","tu","quien","crees");
        for (String cadena : cadenas) {
            System.out.println(cadena);
        }
    }
}

