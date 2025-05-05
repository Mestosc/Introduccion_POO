package Nodos;

/**
 * Nodos de una lista
 * @author Oscar
 * @version 1.0
 */
public class Nodo<T> {
    private T valor;
    private Nodo<T> punteiroSeguinte;

    public T getValor() {
        return valor;
    }
    public Nodo() {}
    public Nodo(T valor, Nodo<T> seguinte) {
        setValor(valor);
        punteiroSeguinte = seguinte;
    }
    public Nodo(T valor) {
        this.valor = valor;
    }
    public void setValor(T valor) {
        this.valor = valor;
    }
    /**
     * Obtener el siguiente nodo 
     * @return El nodo siguiente
     **/
    public Nodo<T> getSeguinteNodo() {
        return punteiroSeguinte;
    }
    public void setPunteiroSeguinte(Nodo<T> punteiroSeguinte) {
        this.punteiroSeguinte = punteiroSeguinte;
    }
}
