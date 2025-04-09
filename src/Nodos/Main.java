package Nodos;

public class Main {
    public static void main(String[] args) {
        ListaNodos<Integer> nodo = new ListaNodos<>(1,2,4,10,20,200);
        for (int i = 0; i < nodo.getTamano(); i++) {
            System.out.println(nodo.get(i));
        }
    }
}

