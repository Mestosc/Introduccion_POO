public class Main {
    public static void main(String[] args) {
        ListaNodos nodos = new ListaNodos();
        ListaNodos nodo = new ListaNodos(1,2,3,4,5,6,7);
        for (int i = 0; i < nodo.getTamano(); i++) {
            System.out.println(nodo.get(i));
        }
    }
}
