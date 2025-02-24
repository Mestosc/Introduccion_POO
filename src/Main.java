public class Main {
    public static void main(String[] args) {
        ListaNodos nodos = new ListaNodos();
        ListaNodos nodo = new ListaNodos(1,23,4,5,10,20);
        nodo.engadirUltimo(40);
        nodo.engadirPrimero(0);
        nodo.listar();
    }
}
