package CosasVarias;

/**
 * Implementa una lista mediante nodos
 * @version 0.9
 * @author Oscar Rodriguez
 */
public class Pila implements Lifo {
    private Nodo nodoIncial;
    private Nodo nodoFinal;
    private int tamano;

    /**
     * Añadir escribiendo numeros directamente una nuva lista de nodos
     * @param num permite introducir los numeros que quieras
     */
    public Pila(int...num) {
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
    /// Metodo para obtener el `n` elemento de la Pila
    /// ```java
    /// Pila pila = new Pila(1,2,3,4)
    /// pila.get(1) // Obtiene el elemento del indice 1 que es 2
    /// ```
    /// @author Oscar Rodriguez
    /// @since 2025-03-17
    public int get(int index) {
        if (estaValeira() || index<0 || index>= tamano) {
            throw new IndexOutOfBoundsException("Indice fuera de rango");
        }
        else if (index==0) return nodoIncial.getValor();
        else if (index==tamano-1) return nodoFinal.getValor();
        else {
            Nodo temp = nodoIncial;
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
        Nodo temp = nodoIncial;
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
                Nodo temp = nodoIncial;
                Nodo ant = new Nodo();
                Nodo nes;
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
    public void insert(int index,int value) {
        if (estaValeira() || index<0 || index>=tamano) {
            throw new IndexOutOfBoundsException("Se trata de añadir un numero a un indice fuera de rango");
        }
        else {
            if (index==0) engadirPrimero(value);
            else if (index==tamano-1) append(value);
            else {
                Nodo temp = nodoIncial;
                Nodo ant = new Nodo();
                for (int i = 0; i < index; i++) {
                    if (i==index-1) ant = temp;
                    temp = temp.getSeguinteNodo();
                }
                Nodo nuevo = new Nodo(value,temp);
                ant.setPunteiroSeguinte(nuevo);
                tamano++;
    }}}
    public Pila() {
    }
    public void engadirPrimero(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (!estaValeira()) {
            nuevo.setPunteiroSeguinte(nodoIncial);
        }
        nodoIncial = nuevo;
        tamano++;

    }
    public void append(int valor) {
        Nodo novo = new Nodo(valor,null);
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

    @Override
    public void encolar(int valor) {
        append(valor);
    }

    @Override
    public int desencolar() {
        int valor_eliminado=get(0);
        if (!estaValeira()) {
            nodoIncial = nodoIncial.getSeguinteNodo();
            tamano--;
        }
        else {
            throw new IndexOutOfBoundsException("Se trata de eliminar un indice inexistente");
        }
        return valor_eliminado;
    }
}
