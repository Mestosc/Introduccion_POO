package Nodos;

/**
 * Implementa una lista mediante nodos
 * @version 0.9
 * @author Oscar Rodriguez
 */
public class ListaNodos<T> {
    private Nodo<T> nodoIncial;
    private Nodo<T> nodoFinal;
    private int tamano;

    /**
     * Añadir escribiendo numeros directamente una nuva lista de nodos
     * @param element permite introducir los numeros que quieras
     */
    @SafeVarargs
    public ListaNodos(T...element) {
        tamano=element.length;
        if (element.length > 0) {
            nodoIncial = new Nodo<T>(element[0]); // Se inicializa con el primer valor
            Nodo<T> actual = nodoIncial;
            Nodo<T> siguiente;
            // Se recorre el resto de los números y se añaden a la lista
            for (int i = 1; i < element.length; i++) {
                siguiente = new Nodo<T>(element[i]);
                actual.setPunteiroSeguinte(siguiente);
                actual = siguiente;
            }
            nodoFinal = actual;
        }
    }
    public T get(int index) {
        if (index<0 || index>= tamano) {
            throw new IndexOutOfBoundsException("Indice fuera de rango");
        }
        else {
            Nodo<T> temp = nodoIncial;
            for (int i = 0; i < index; i++) {
                temp = temp.getSeguinteNodo();
            }
            return temp.getValor();
        }
    }
    public void deleteFirst() {
        if (!estaValeira()) {
            nodoIncial = nodoIncial.getSeguinteNodo();
            tamano--;
        }
        else {
            throw new IndexOutOfBoundsException("Se trata de eliminar un indice inexistente");
        }
    }
    public void deleteLast() {
        if (!estaValeira()) {
        tamano--;
        Nodo<T> temp = nodoIncial;
        for (int i = 0; i < tamano; i++) {
            if (i==tamano-1) temp.setPunteiroSeguinte(null);
            else temp = temp.getSeguinteNodo();
        }
        nodoFinal = temp;
        }
        else {
            throw new IndexOutOfBoundsException("Se trata de eliminar un indice inexistente");
        }
    }
    public void deleteElement(int index) {
        if (estaValeira() || index<0 || index>=tamano) {
            throw new IndexOutOfBoundsException("Se trata de eliminar un indice inexistente");
        }
        else {
            if (index == 0) deleteFirst();
            else if (index == tamano - 1) deleteLast();
            else {
                Nodo<T> temp = nodoIncial;
                Nodo<T> ant = new Nodo<T>();
                Nodo<T> nes;
                for (int i = 0; i < index; i++) {
                    if (i == index - 1) ant = temp;
                    temp = temp.getSeguinteNodo();
                }
                nes = temp.getSeguinteNodo();
                ant.setPunteiroSeguinte(nes);
                tamano--;
            }
        }
    }
    public void insert(int index,T value) {
        if (estaValeira() || index<0 || index>=tamano) {
            throw new IndexOutOfBoundsException("Se trata de añadir un numero a un indice fuera de rango");
        }
        else {
            if (index==0) engadirPrimero(value);
            else if (index==tamano-1) append(value);
            else {
                Nodo<T> temp = nodoIncial;
                Nodo<T> ant = new Nodo<T>();
                for (int i = 0; i < index; i++) {
                    if (i==index-1) ant = temp;
                    temp = temp.getSeguinteNodo();
                }
                Nodo<T> nuevo = new Nodo<T>(value,temp);
                ant.setPunteiroSeguinte(nuevo);
                tamano++;
    }}}
    public ListaNodos() {
    }
    public void engadirPrimero(T valor) {
        Nodo<T> nuevo = new Nodo<T>(valor);
        if (!estaValeira()) {
            nuevo.setPunteiroSeguinte(nodoIncial);
        }
        nodoIncial = nuevo;
        tamano++;

    }
    public void append(T valor) {
        Nodo<T> novo = new Nodo<T>(valor,null);
        if (estaValeira()) {
            nodoIncial = novo;
        }
        else {
            nodoFinal.setPunteiroSeguinte(novo);
        }
        nodoFinal = novo;
        tamano++;

    }
    public boolean estaValeira() {
        return tamano==0 && nodoIncial==null;
    }

    public int getTamano() {
        return tamano;
    }
}
