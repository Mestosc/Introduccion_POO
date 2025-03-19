package CosasVarias;

public class Main {
    public static void main(String[] args) {
        Pila nodos = new Pila();
        Pila nodo = new Pila(1,2,4,10,20);
        for (int i = 0; i < nodo.getTamano(); i++) {
            System.out.println(nodo.get(i));
        }
    }
}
