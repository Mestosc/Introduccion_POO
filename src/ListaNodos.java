import java.util.Arrays;

public class ListaNodos {
    private Nodo nodoIncial;
    int tamano;
    public ListaNodos() {
    }
    public void engadirPrimero(int valor) {
        if (estaValeira()) {
            nodoIncial = new Nodo(valor);
        }
    }
    public void engadirUltimo(int valor) {
        if (estaValeira()) {
            nodoIncial = new Nodo(valor);
        }
        else {

        }

    }
    public boolean estaValeira() {
        return tamano==0 || nodoIncial==null;
    }

    public int getTamano() {
        return tamano;
    }
}
