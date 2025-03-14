package ClasesAbstractas;

public interface Son {
    public void voz();
    public default void bostezo() {
        System.out.println("Aaah");
    }
}
