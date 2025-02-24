
public class ListaNodos {
    private Nodo nodoIncial;
    private Nodo nodoFinal;
    int tamano;
    public ListaNodos() {
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
