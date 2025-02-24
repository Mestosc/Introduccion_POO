public class Nodo {
    private int valor;
    private Nodo punteiroSeguinte;
    public int getValor() {
        return valor;
    }
    public Nodo(int valor) {
        this.valor = valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    public Nodo getSeguinteNodo() {
        return punteiroSeguinte;
    }
    public void setPunteiroSeguinte(Nodo punteiroSeguinte) {
        this.punteiroSeguinte = punteiroSeguinte;
    }
}
