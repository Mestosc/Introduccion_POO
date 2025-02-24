
public class ListaNodos {
    private Nodo nodoIncial;
    private Nodo nodoFinal;
    int tamano;
    public ListaNodos(int...num) {
        tamano=num.length;
        if (num.length > 0) {
            nodoIncial = new Nodo(num[0]); // Se inicializa con el primer valor
            Nodo actual = nodoIncial;
            Nodo siguiente;
            // Se recorre el resto de los números y se añaden a la lista
            for (int i = 1; i < num.length; i++) {
                siguiente = new Nodo(num[i]);
                actual.setPunteiroSeguinte(siguiente);
                actual = siguiente;
            }
            nodoFinal = actual;
        }
    }
    public ListaNodos() {
    }
    public void listar() {
        Nodo temp = nodoIncial;
        for (int i = 0; i < tamano; i++) {
            System.out.println(temp.getValor());
            temp = temp.getSeguinteNodo();
        }
    }
    public void engadirPrimero(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (estaValeira()) {
            nodoIncial = nuevo;
            tamano++;
        }
        else {
            nuevo.setPunteiroSeguinte(nodoIncial);
            nodoIncial = nuevo;
        }
    }
    public void engadirUltimo(int valor) {
        Nodo novo = new Nodo(valor,null);
        if (estaValeira()) {
            nodoIncial = novo;
            nodoFinal = novo;
            tamano=1;
        }
        else {
            Nodo nodoActual = nodoFinal;
            nodoActual.setPunteiroSeguinte(novo);
            nodoFinal = novo;
            tamano++;
        }

    }
    public boolean estaValeira() {
        return tamano==0 || nodoIncial==null;
    }

    public int getTamano() {
        return tamano;
    }
}
