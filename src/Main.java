public class Main {
    public static void main(String[] args) {
        Lista lista1 = new Lista();
        lista1.firstAppend(10);
        lista1.append(20);
        lista1.append(30);
        lista1.firstAppend(100);
        for (int i : lista1.getNumeros()) {
            System.out.println(i);
        }
    }
}
