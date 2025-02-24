public class Main {
    public static void main(String[] args) {
        ListaNodos nodos = new ListaNodos();
        ListaNodos nodo = new ListaNodos(1,2,4,5,10,20);
        nodo.deleteElement(3);
        nodo.listar();
    }
}
