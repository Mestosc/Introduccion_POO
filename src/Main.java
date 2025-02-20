public class Main {
    public static void main(String[] args) {
        Lista lista1 = new Lista();
        lista1.firstAppend(10);
        for (int i : lista1.numeros) {
            System.out.println(i);
        }
    }
}
