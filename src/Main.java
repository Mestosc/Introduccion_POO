public class Main {
    public static void main(String[] args) {
        Nodo nodo1 = new Nodo();
        nodo1.setValor(20);
        Nodo nod2 = new Nodo();
        nodo1.setPunteiroSeguinte(nod2);
        nod2.setValor(10);
    }
}
