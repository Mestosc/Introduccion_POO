public class Main {
    public static void main(String[] args) {
        ListaNodos nodos = new ListaNodos();
        ListaNodos nodo = new ListaNodos(1,2,4);
        nodo.listar();
        System.out.println(nodo.getTamano());
    }
}
