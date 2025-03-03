
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
    public int get(int index) {
        if (index==0) return nodoIncial.getValor();
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
        nodoIncial = nodoIncial.getSeguinteNodo();
        tamano--;
    }
    public void deleteLast() {
        tamano--;
        Nodo temp = nodoIncial;
        for (int i = 0; i < tamano; i++) {
            if (i==tamano-1) temp.setPunteiroSeguinte(null);
            else temp = temp.getSeguinteNodo();
        }
        nodoFinal = temp;
    }
    public void deleteElement(int index) {
        if (index==0) deleteFirst();
        else if (index == tamano) deleteLast();
        Nodo temp = nodoIncial;
        Nodo ant = new Nodo();
        Nodo nes;
        for (int i = 0; i < index; i++) {
            if (i==index-1) ant = temp;
            temp = temp.getSeguinteNodo();
        }
        nes = temp.getSeguinteNodo();
        ant.setPunteiroSeguinte(nes);
        tamano--;

    }
    public void insert(int index,int value) {
        if (index==0) engadirPrimero(value);
        else if (index==tamano-1) engadirUltimo(value);
        else if (estaValeira()) {
            System.out.printf("La lista esta vacia asi que el indice %d no existe%n", index);
        } else {
            Nodo temp = nodoIncial;
            Nodo ant = new Nodo();
            for (int i = 0; i < index; i++) {
                if (i==index-1) ant = temp;
                temp = temp.getSeguinteNodo();
            }
            Nodo nuevo = new Nodo(value,temp);
            ant.setPunteiroSeguinte(nuevo);
            tamano++;
    }}
    public ListaNodos() {
    }
    public void listar() {
        Nodo temp = nodoIncial;
        for (int i = 0; i < tamano; i++,temp = temp.getSeguinteNodo()) {
            System.out.println(temp.getValor());
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
            nodoFinal.setPunteiroSeguinte(novo);
            nodoFinal = novo;
            tamano++;
        }

    }
    public boolean estaValeira() {
        return tamano==0 && nodoIncial==null;
    }

    public int getTamano() {
        return tamano;
    }
}
